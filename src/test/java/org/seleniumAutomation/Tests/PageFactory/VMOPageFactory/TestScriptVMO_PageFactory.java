package org.seleniumAutomation.Tests.PageFactory.VMOPageFactory;

import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.seleniumAutomation.Base.CommonToAll_Test;
import org.seleniumAutomation.Listeners.ScreenshotListener;
import org.seleniumAutomation.Pages.PageFactory.VMOPageFactory.LoginPageVMO_Factory;
import org.seleniumAutomation.Utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import org.testng.util.RetryAnalyzerCount;

import static org.seleniumAutomation.Driver.DriverManager.driver;

@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzerCount.class)
public class TestScriptVMO_PageFactory extends CommonToAll_Test {


    private static final Logger logger = LogManager.getLogger(TestScriptVMO_PageFactory.class);


    public void testLoginNegativeVWO_PF() {

        logger.info("Checking first program after creating framework from Scratch");

        LoginPageVMO_Factory loginPageVMO_factory = new LoginPageVMO_Factory(driver);
        String Error_Message = loginPageVMO_factory.loginToVWOInvalidCreds();

        // Few logging pref-defined function we need to add.

        logger.info("Error Message should be " + Error_Message);
        logger.debug("Error message should while debugging " + Error_Message);
        logger.error("Error msg is " + Error_Message);
        logger.fatal("Program is completed");
        Allure.addAttachment("Log Out is ", "text/plain", "This is log to verify error");
        Assert.assertEquals(Error_Message, PropertiesReader.readKey("error_message"));
    }
}

