package me.sanathsaha;

import org.testng.annotations.Test;

public class Locators extends DriverSetup{

    @Test
    public void testlocators(){
        driver.get("https://www.google.com");
    }


}
