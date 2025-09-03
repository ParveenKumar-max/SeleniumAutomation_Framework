package org.seleniumAutomation.Listeners;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class I_RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 1; // retry failed test 2 times

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("⚠️ Retrying test " + result.getName() + " | Attempt " + (retryCount + 1));
            return true;
        }
        return false;
    }
}
