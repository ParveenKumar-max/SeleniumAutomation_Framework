package org.seleniumAutomation.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    // File -- Read the data from data.properties
    // External Files

    public static String readKey(String key){

        Properties P = null;

        try {
            FileInputStream fileInputStream = new FileInputStream
                    (System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");

            P = new Properties();

            P.load(fileInputStream);

        } catch (FileNotFoundException e) {
            e.getStackTrace();

        } catch (IOException e) {
            e.getStackTrace();
        }
        return P.getProperty(key);

    }

}
