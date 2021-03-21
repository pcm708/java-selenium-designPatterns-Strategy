package pageComponents;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import strategy.FlightType;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RoundTrip implements FlightType {

    WebDriver driver;
    By tripOption= By.cssSelector("input[value='RoundTrip']");
    By departureCity= By.cssSelector("input[value='Departure City']");
    By arrivalCity = By.cssSelector("input[value='Arrival City']");
    By dCity = By.cssSelector("a[value='GOI']");
    By aCity = By.cssSelector("a[value='COK']");
    By dCalendar = By.cssSelector("#view_fulldate_id_1");
    By rCalendar = By.cssSelector("#view_fulldate_id_2");
    By dDate= By.xpath("//td[@data-month='2']//a[text()='22']");
    By rDate= By.xpath("//td[@data-month='2']//a[text()='29']");
    Actions act;

    public RoundTrip(WebDriver driver){
        this.driver= driver;
        this.driver.findElement(this.tripOption).click();
        this.act = new Actions(this.driver);
    }

    @Override
    public void selectDepartureCity() {
        driver.findElement(this.departureCity).click();
        driver.findElement(this.dCity).click();
    }

    @Override
    public void selectArrivalAirport() {
//        driver.findElement(this.arrivalCity).click();
        act.click(driver.findElement(this.arrivalCity)).build().perform();
//        driver.findElement(this.aCity).click();
        act.click(driver.findElement(this.aCity)).build().perform();
    }

    @Override
    public void selectDepartureDate(){
        act.click(driver.findElement(this.dCalendar)).click(driver.findElement(this.dDate)).build().perform();
    }

    @Override
    public void selectReturnDate(){
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
        act.moveToElement(driver.findElement(rCalendar)).click(driver.findElement(this.rCalendar))
                .moveToElement(driver.findElement(this.rDate)).click(driver.findElement(this.rDate)).build().perform();
    }

    @Override
    public void clickSearchBtn(){
//        driver.findElement(searchBtn).click();
    }
}