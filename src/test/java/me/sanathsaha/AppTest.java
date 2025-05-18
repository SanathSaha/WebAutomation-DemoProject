package me.sanathsaha;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends DriverSetup

{
    @Test
    public void WebPageLoad () {
        driver.get("https://google.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void WebPageLoadTitle () {
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}
