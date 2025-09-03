package org.seleniumAutomation.Pages.PageFactory.VMOPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.apache.poi.ss.formula.eval.ErrorEval.getText;
import static org.seleniumAutomation.Utils.WaitHelpers.visibilityOfElement;

public class DashBoardPageVMO_Factory {

    WebDriver driver;

    public DashBoardPageVMO_Factory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

        @FindBy(xpath = "//button[contains(text(),' Verify Account')]")
        private WebElement userNameOnDashboard;


    // Page Actions
   /* public String loggedInUserName() {
        visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }*/
}