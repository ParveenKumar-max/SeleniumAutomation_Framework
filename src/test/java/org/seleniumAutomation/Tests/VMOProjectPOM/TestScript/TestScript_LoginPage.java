package org.seleniumAutomation.Tests.VMOProjectPOM.TestScript;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.seleniumAutomation.Base.CommonToAll_Test;
import org.seleniumAutomation.Pages.VMOProject.NormalPOM.DashBoardPage;
import org.seleniumAutomation.Pages.VMOProject.NormalPOM.LoginPage;
import org.seleniumAutomation.Utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.seleniumAutomation.Driver.DriverManager.driver;

public class TestScript_LoginPage extends CommonToAll_Test {

    @Owner("Parveen Chaudhary")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login(){

        // Driver Manager Code - 1
        // Page Class Code (POM Code) - 2

        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.LoginVmoApplicationInvalidCred
                (PropertiesReader.readKey("invalid_username"),
                        PropertiesReader.readKey("invalid_password"));

        // Assertions - 3
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));

    }

    @Owner("Parveen Chaudhary")
    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {

        LoginPage loginPage_VWO = new LoginPage(driver);
        loginPage_VWO.LoginVmoApplicationValidCred(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashBoardPage dashBoardPage  = new DashBoardPage(driver);
        String usernameLoggedIn = dashBoardPage.loggedInUserName();


        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));


    }
}
