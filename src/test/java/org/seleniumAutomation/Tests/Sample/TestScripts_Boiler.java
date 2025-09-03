package org.seleniumAutomation.Tests.Sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScripts_Boiler {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");

        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }


@Test
@Owner("Parveen Chaudhary")
@Description("TC_verify All Test Before Adding in Main folders")
public void testScripts(){


        driver.get("https://www.google.com");
    Assert.assertEquals(driver.getTitle(),"Google");
    System.out.println("Assertion Pass");

}
@AfterTest
    public void CloseBrowser(){
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.quit();
    }

}
