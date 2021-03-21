package strategy;

import org.openqa.selenium.By;

public interface FlightType {

    By departureCity = By.cssSelector("input[value='Departure City']");
    By arrivalAirport= By.cssSelector("input[value='Arrival City']");
    By searchBtn = By.cssSelector(".btn-find-flight-home input[value=\"Search\"]");

    void selectDepartureCity();
    void selectArrivalAirport();
    void selectDepartureDate();
    void selectReturnDate();
    void clickSearchBtn();

}
