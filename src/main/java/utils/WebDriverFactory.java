package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverFactory {

    public WebDriver driver;

    public WebDriver initDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public void spinUpBrowser(WebDriver driver){
        driver.get("https://www.spicejet.com/");
    }

    public void shutDriver(WebDriver driver){
        driver.quit();
    }
}
