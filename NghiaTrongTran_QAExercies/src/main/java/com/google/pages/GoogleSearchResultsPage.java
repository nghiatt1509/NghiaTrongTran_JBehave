package com.google.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearchResultsPage extends PageObject {

    @Step("Verify if the expected result is displayed")
    public boolean isExpectedResultDisplayed(String strExpectedResult){
        boolean isDisplayed = false;

        List<WebElement> lstItems = getDriver().findElements(By.xpath("//h3"));
        List<String> lstItemsText = new ArrayList<String>();

        for (WebElement element : lstItems){
            lstItemsText.add(element.getText().trim());
        }

        isDisplayed = lstItemsText.contains(strExpectedResult.trim());

        return isDisplayed;
    }
}
