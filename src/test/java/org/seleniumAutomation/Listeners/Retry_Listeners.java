package org.seleniumAutomation.Listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Retry_Listeners implements IAnnotationTransformer {


    @Override
    public void transform(ITestAnnotation annotation, Class testClass,
                          Constructor testConstructor, Method testMethod) {
        // Attach RetryAnalyzer to every @Test
        annotation.setRetryAnalyzer(I_RetryAnalyzer.class);
    }
}
