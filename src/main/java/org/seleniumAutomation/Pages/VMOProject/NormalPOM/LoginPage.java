package org.seleniumAutomation.Pages.VMOProject.NormalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.seleniumAutomation.Utils.PropertiesReader;
import org.seleniumAutomation.Utils.WaitHelpers;

import static org.seleniumAutomation.Utils.WaitHelpers.waitJVM;


public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver webdriver) {
        this.driver = webdriver;
    }

    // Step 1- Page Locators
    private By user_name = By.id("login-username");
    private By pass_word = By.id("login-password");
    private By sign_Button = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");
    //  private By Xpath = By.xpath("//a[@class='abc']");

    // If you are not using it , don't keep.
    //private By signBySSO = By.xpath("//button[normalize-space()='Sign in using SSO']");

    // Step 2 - Page Actions

    public String LoginVmoApplicationInvalidCred(String Username, String Password) {

        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(user_name).sendKeys(Username);
        driver.findElement(pass_word).sendKeys(Password);
        driver.findElement(sign_Button).click();

        waitJVM(3000);

        WaitHelpers.checkVisibility(driver, error_message, 3);
        String error_element = driver.findElement(error_message).getText();
        return error_element;

    }
    // Step 2 - Page Actions
    public void LoginVmoApplicationValidCred(String username, String password) {


        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(user_name).sendKeys(username);
        driver.findElement(pass_word).sendKeys(password);
        driver.findElement(sign_Button).click();

        waitJVM(3000);

    }
}
