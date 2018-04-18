package com.gmail.xellos.aka.atan.steps;

import static com.codeborne.selenide.Selenide.*;

import com.gmail.xellos.aka.atan.pageobjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {

    private HomePage homePage = page(HomePage.class);


    @Given("I launch www.bbc.com")
    public void openHomePage() {
        open("http://www.bbc.com/");
    }

    @When("I click news in the menu")
    public void clickNews() {
        homePage.newsLink.click();
    }


}
