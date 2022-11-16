package ru.sf;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:ru.sf")


public class RunTest {
        @AfterClass
        public static void finalizeResources() {
            StepTest.webDriver.close();
        }
    }

