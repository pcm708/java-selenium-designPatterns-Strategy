package pageObjects;

import org.openqa.selenium.WebDriver;
import strategy.FlightType;
import strategy.StrategyClass;

public class FlightBookingPage {
    public WebDriver driver;
    public FlightType fType;

    public FlightBookingPage(WebDriver driver){
        this.driver= driver;
    }

    public FlightType checkOption(String option){
        StrategyClass strategyClass = new StrategyClass(driver);
        this.fType= strategyClass.getFlightType(option);
        return fType;
    }
}
