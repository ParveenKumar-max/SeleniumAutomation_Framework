package org.seleniumAutomation.Driver;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.Browser;
import org.seleniumAutomation.Utils.PropertiesReader;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    // When we want to start the browser

    public static void init(){
        String browser = PropertiesReader.readKey("browser");
        browser = browser.toLowerCase();

        switch (browser){
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--guest");
                edgeOptions.addArguments("--start--maximized");
                driver = new EdgeDriver(edgeOptions);
                break;
            case "chrome":
                EdgeOptions chromeOptions = new EdgeOptions();
                chromeOptions.addArguments("--guest");
                chromeOptions.addArguments("--start--maximized");
                driver = new EdgeDriver(chromeOptions);
                break;
            case "firefox":
                EdgeOptions firefoxOptions = new EdgeOptions();
                firefoxOptions.addArguments("--guest");
                firefoxOptions.addArguments("--start--maximized");
                driver = new EdgeDriver(firefoxOptions);
                break;
            default:
                System.out.println("No Browser Supported");
        }
    }

    // When we want to close the browser
    public static void down(){
        if (getDriver() != null) {
            driver.quit();
            driver = null;
        }

    }
}
