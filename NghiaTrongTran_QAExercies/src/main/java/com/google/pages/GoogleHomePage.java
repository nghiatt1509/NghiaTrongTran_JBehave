package com.google.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class GoogleHomePage extends PageObject {

    @Step("Navigate to Google Home Page")
    public void navigateToGoogleHome(){
        openUrl("https://www.google.com/");
        getDriver().manage().window().maximize();
    }

    @Step("Make a search with keyword")
    public void makeASearchWithKeyword(String strKeyword){
        $("//input[@title='Search'] | //input[@title='Tìm kiếm']").sendKeys(strKeyword);
        $("//input[@name='btnK']").click();
    }
}
