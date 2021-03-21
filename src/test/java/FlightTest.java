import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.FlightBookingPage;
import wdFactory.WebDriverFactory;

public class FlightTest {

    WebDriver driver;
    WebDriverFactory wdFactory;
    FlightBookingPage fbPage;

    FlightTest(){
        wdFactory = new WebDriverFactory();
    }

    @BeforeTest
    public void setup(){
        this.driver= wdFactory.initDriver();
        wdFactory.spinUpBrowser(driver);
        fbPage= new FlightBookingPage(driver);
    }

    @Test()
    public void test(){
        fbPage.fType= fbPage.checkOption("RoundTrip");
        fbPage.fType.selectDepartureCity();
        fbPage.fType.selectArrivalAirport();
        fbPage.fType.selectDepartureDate();
        fbPage.fType.selectReturnDate();
        fbPage.fType.clickSearchBtn();
    }

    @AfterTest
    public void tearDown(){
//        wdFactory.shutDriver(driver);
    }
}
