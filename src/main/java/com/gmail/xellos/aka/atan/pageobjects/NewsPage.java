package com.gmail.xellos.aka.atan.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage {

    @FindBy(css = "div.nw-c-news-navigation")
    public SelenideElement newsTitle;


}
