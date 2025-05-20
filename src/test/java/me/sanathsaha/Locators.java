package me.sanathsaha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends DriverSetup{

    @Test
    public void testlocators() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

       // WebElement searchArea = driver.findElement(By.id("APjFqb"));
        //searchArea.sendKeys("movie");

       // WebElement searchArea = driver.findElement(By.name("q"));
        //searchArea.sendKeys("movie");

        //WebElement searchArea = driver.findElement(By.tagName("textarea"));
        //searchArea.sendKeys("movie");

        //WebElement searchArea = driver.findElement(By.className("gLFyf"));
        //searchArea.sendKeys("movie");

        //driver.findElement(By.linkText("Gmail")).click();

        driver.findElement(By.partialLinkText("How Search works")).click();

        Thread.sleep(3000);
    }


}
