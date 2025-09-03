package org.seleniumAutomation.Pages.VMOProject.NormalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.seleniumAutomation.Utils.WaitHelpers;

public class DashBoardPage {

    WebDriver driver;

    // Add Constructor
    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");
    // Page Actions
    public String loggedInUserName(){
        WaitHelpers.waitJVM(10000);

        //Add wait for 10 sec and wait for dashboard page

        driver.get("https://app.vwo.com/#/dashboard");
        return driver.findElement(userNameOnDashboard).getText();
    }

}
