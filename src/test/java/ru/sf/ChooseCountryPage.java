package ru.sf;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ChooseCountryPage {
    private static final String SEARCH_FIELD_CLASS = "auto-search";
    private final WebDriver webDriver;

    public ChooseCountryPage(WebDriver webDriver){
        this.webDriver =webDriver;
    }

    public void go(String url){
      webDriver.get(url);
    }

    public void searchProduct(String product){
        final var searchInput = webDriver.findElement(By.className(SEARCH_FIELD_CLASS));
        searchInput.sendKeys(product, Keys.ENTER);
    }
}
