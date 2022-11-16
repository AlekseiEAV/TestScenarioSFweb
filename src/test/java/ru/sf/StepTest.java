package ru.sf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


import static org.junit.Assert.assertEquals;


public class StepTest {
    public static final WebDriver webDriver;
    public static final ChooseCountryPage chooseCountryPage;
    public static final CountryMenuPage cuntryMenuPage;

    static {

        System.setProperty("webdriver.chrome.driver", "/Users/alekseiegorov/Documents/GitHub/TestScenarioSF/src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        chooseCountryPage = new ChooseCountryPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();
        cuntryMenuPage =new CountryMenuPage(webDriver);
    }


    @Given("url of market {string}")
    public void url_of_market(String url) {
        chooseCountryPage.go(url);
    }

    @Then("website its open search {string}")
    public void website_its_open_search(String product) {
           chooseCountryPage.searchProduct(product);
    }

    @And("assert fail search {string}")
    public void assertFailCompletedSearch(String errorMessage) {
       final var currentFailSearch = cuntryMenuPage.getErrorCountrySpanXpath();
       assertEquals(errorMessage, currentFailSearch);
    }

    @And("assert completed search {string}")
    public void assertCompletedSearch(String expectedProduct) {
        final var currentActivtyCountry= cuntryMenuPage.getCurrentActiveCountry();
        assertEquals(expectedProduct, currentActivtyCountry);
    }
}
