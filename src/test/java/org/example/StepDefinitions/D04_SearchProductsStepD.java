package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesPOM.P3_HomePagePOM;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D04_SearchProductsStepD {
    P3_HomePagePOM Search = new P3_HomePagePOM();
        SoftAssert soft = new SoftAssert();

        @Given("user click on search item field")
        public void searchItem_field()
        {
            Search.searchItemField().click();
        }

        @When("user search item with {string}")
        public void userSearchItem(String product) {
            Search.searchItemField().sendKeys(product);
            Search.searchItemField().sendKeys(Keys.ENTER);
        }

        @Then("user could find  {string} relative words")
        public void userCouldFindRelativeWords(String SearchWord) {
            String word = null;
            for (int x = 0; x < Search.searchOutput().size(); x++)
            {
                word = Search.searchOutput().get(x).getText().toLowerCase();
            }


            soft.assertTrue(word.contains(SearchWord),"First Assertion");
            String expectedResult ="https://demo.nopcommerce.com/search?q=";
            String currentUrl = Hook.driver.getCurrentUrl();
            soft.assertTrue(currentUrl.contains(expectedResult),"second Assertion");
            soft.assertAll();

        }

        @Then("user could find  {string} inside product page")
        public void productPage(String sSku) {
            Search.clickSearch().click();
            String skuNum = Search.searchSku().getText();
            Assert.assertTrue(sSku.contains(skuNum));

        }
    }

