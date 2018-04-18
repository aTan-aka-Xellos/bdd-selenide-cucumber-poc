package com.gmail.xellos.aka.atan;

import static com.codeborne.selenide.Configuration.*;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/gmail/xellos/aka/atan/steps"
)

@RunWith(Cucumber.class)
public class BBCTest {

    @BeforeClass
    public static void setupTimeout() {
        browser = "chrome";
    }

}
