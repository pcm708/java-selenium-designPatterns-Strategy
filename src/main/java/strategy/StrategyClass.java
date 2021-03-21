package strategy;

import org.openqa.selenium.WebDriver;
import pageComponents.OneWayTrip;
import pageComponents.RoundTrip;

public class StrategyClass {
    WebDriver driver;

    public StrategyClass(WebDriver driver){
        this.driver = driver;
    }

    public FlightType getFlightType(String value){
        if(value.equalsIgnoreCase("RoundTrip")){
            return new RoundTrip(driver);
        }
        else if(value.equalsIgnoreCase("OneWay")){
            return new OneWayTrip(driver);
        }
        return null;
    }
}
