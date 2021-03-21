package pageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strategy.FlightType;

public class OneWayTrip implements FlightType {

    WebDriver driver;
    By tripOption= By.cssSelector("input[value='OneWay']");

    public OneWayTrip(WebDriver driver){
        this.driver= driver;
        this.driver.findElement(this.tripOption).click();
    }

    @Override
    public void selectDepartureCity() {

    }

    @Override
    public void selectArrivalAirport() {

    }

    @Override
    public void selectDepartureDate(){
    }

    @Override
    public void selectReturnDate(){
    }

    @Override
    public void clickSearchBtn(){
    }
}