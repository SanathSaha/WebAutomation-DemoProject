package me.sanathsaha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

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

        //WebElement searchArea = driver.findElement(By.partialLinkText("কীভাবে কাজ করে"));
        //searchArea.click();


        //WebElement searchArea = driver.findElement(By.cssSelector("textarea[name='q']"));
        //searchArea.sendKeys("T-shirt");

        //WebElement searchArea = driver.findElement(By.xpath("//textarea[@name='q']"));
        //searchArea.sendKeys("T-shirt");

        //List<WebElement> childs = driver.findElements(By.cssSelector("div[class='KxwPGc AghGtd']>a"));

        //for(WebElement child: childs){
            //System.out.println(child.getText());
        //}
        Thread.sleep(3000);
    }


}
