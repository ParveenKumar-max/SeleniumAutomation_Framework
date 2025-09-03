package org.seleniumAutomation.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumAutomation.Utils.PropertiesReader;

import static org.seleniumAutomation.Driver.DriverManager.getDriver;

public class CommonToAll {

    public CommonToAll() {

        // If you want to call something before every Page Object Class call, Put your Code here;

        // Open File, Open Data Base Connection You can write code here
    }

    // The below method used to add method in improved POM.

    public void openVWOUrl(){
        getDriver().get(PropertiesReader.readKey("url"));
    }

    public void openOrangeUrl(){
        getDriver().get(PropertiesReader.readKey("org_url"));
    }

    public void openKatalonUrl(){
        getDriver().get(PropertiesReader.readKey("katalon_url"));
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void clickElement(WebElement by) {
        by.click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public String getText(WebElement by){
        return by.getText();
    }

}