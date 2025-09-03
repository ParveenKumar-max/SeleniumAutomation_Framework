package org.seleniumAutomation.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumAutomation.Driver.DriverManager;
import org.seleniumAutomation.Utils.PropertiesReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.seleniumAutomation.Driver.DriverManager.getDriver;

public class CommonToAll_Test {


    @BeforeMethod
    public void inti(){
        DriverManager.init();
    }

    @AfterMethod
    public void tear(){
        DriverManager.down();
    }

}
