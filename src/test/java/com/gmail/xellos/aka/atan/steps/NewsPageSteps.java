package com.gmail.xellos.aka.atan.steps;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import com.gmail.xellos.aka.atan.pageobjects.HomePage;
import com.gmail.xellos.aka.atan.pageobjects.NewsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewsPageSteps {

    private NewsPage newsPage = page(NewsPage.class);

    @Then("I go to the news section")
    public void isNewsPageOpened() {
        newsPage.newsTitle.shouldBe(visible);
    }

}
