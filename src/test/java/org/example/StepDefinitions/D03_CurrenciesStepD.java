package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.PagesPOM.P3_HomePagePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D03_CurrenciesStepD extends P3_HomePagePOM {


    @Given("user select random currency user select euro")
    public void user_select_currency()
    {
       Select selectEuro = new Select(selectCurrencies());
        selectEuro.selectByVisibleText("Euro");;

    }


    @Then("currency is changed correctly euro currency is changed")
    public void currencyIsChanged() {
        for(int c = 0; c < changeCurrencies().size(); c++)
        {
          String output = changeCurrencies().get(c).getText();
            System.out.println(output);


            SoftAssert soft = new SoftAssert();

          soft.assertTrue(Hook.driver.findElement(By.className("prices")).getText().contains("€"),"First Assertion");
            soft.assertAll();
        }
    }
}
