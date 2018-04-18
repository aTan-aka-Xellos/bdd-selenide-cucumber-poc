package com.gmail.xellos.aka.atan.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "h2>a.tag--news")
    public SelenideElement newsLink;


}
