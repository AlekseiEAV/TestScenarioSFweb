package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public record CountryMenuPage(WebDriver webDriver) {

    private final static String ACTIVE_COUNTRY_SPAN_XPATH = "//h1[@class='b-object-min__title search_pad']";
    private final static String ERROR_COUNTRY_SPAN_XPATH = "//div[@class='pull-left b-sort__total']";

    public String getCurrentActiveCountry() {
        return webDriver.findElement(By.xpath(ACTIVE_COUNTRY_SPAN_XPATH)).getText();
    }
    public String getErrorCountrySpanXpath(){
        return webDriver.findElement(By.xpath(ERROR_COUNTRY_SPAN_XPATH)).getText();
    }
}

