package org.seleniumAutomation.Pages.PageFactory.VMOPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumAutomation.Base.CommonToAll;
import org.seleniumAutomation.Utils.PropertiesReader;
import org.seleniumAutomation.Utils.WaitHelpers;

public class LoginPageVMO_Factory extends CommonToAll {

    WebDriver driver;

    public LoginPageVMO_Factory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="login-username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;


    public String loginToVWOInvalidCreds() {

        try {
            openVWOUrl();
            enterInput(username, PropertiesReader.readKey("invalid_username"));
            enterInput(password, PropertiesReader.readKey("invalid_password"));
            clickElement(signButton);
            WaitHelpers.waitJVM(5000);
        } catch (Exception e) {
            System.out.println("Elements Not found!");
        }
        return getText(error_message);

    }
}

