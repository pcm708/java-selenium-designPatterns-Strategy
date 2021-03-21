package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenshot {

    WebDriver driver;
    Date date;
    WebElement element;

    public TakeScreenshot(WebDriver driver){
        this.driver = driver;
        date= new Date();
    }

    public TakeScreenshot(WebElement element){
        this.element = element;
        date= new Date();
    }

    public void takesPageSS(WebDriver driver){
        this.driver= driver;
        File fs = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(fs,new File("./ss/page+"+date.getTime()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeElementSS(WebElement element){
        this.element = element;
        File fs = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(fs,new File("./ss/element+"+date.getTime()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
