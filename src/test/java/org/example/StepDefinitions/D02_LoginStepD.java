package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesPOM.P2_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;


public class D02_LoginStepD extends P2_LoginPage {


    @Given("User GO TO loginPage")
    public void  go_to_LoginPage() throws InterruptedException
    {
        loginBTN().click();
        Thread.sleep(2000);
    }

    @When("^user enter login \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void valid_username_password(String type , String email, String password)
    {
        ValidEmail().sendKeys(email);
        ValidPassword().sendKeys(password);
    }

/*
    @When("user enter  valid Email")
    public void validEmail()
    {
        ValidEmail().sendKeys("mahmoud33@gmail.com");

    }
    @And("user enter valid password")
    public void validPassword()
    {
        ValidPassword().sendKeys("M@shehata");

    }

 */
    @And("user press login button")
    public void press_login_button()
    {

        PressBTNLogin().sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void login_successfully() throws InterruptedException {
        SoftAssert soft = new SoftAssert();


         soft.assertTrue(MYAccountAssertion().isDisplayed(),"First assertion");
        System.out.println(Hook.driver.getCurrentUrl());
         soft.assertTrue(Hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),"Second assertion");
        //Thread.sleep(1000);
        System.out.println(Hook.driver.getTitle());
         soft.assertTrue(Hook.driver.getTitle().contains("nopCommerce demo store"),"Third assertion");
         soft.assertAll();
    }

    @Then("user could not login")
    public void user_couldNot_login() throws InterruptedException {
        SoftAssert soft = new SoftAssert();

        String invalidMessage = invalidMessageLogin(Hook.driver).getText();
        System.out.println(invalidMessage);
        String expectedMess ="Login was unsuccessful. Please correct the errors and try again.";


        String backGrColor = invalidColor(Hook.driver).getCssValue("color");// value valid color
        System.out.println(backGrColor);
        String expectedColor ="rgba(228, 67, 75, 1)";


        soft.assertTrue(expectedMess.contains("Login was unsuccessful."),"First Assertion");
        soft.assertTrue(backGrColor.contains("rgba(228, 67, 75, 1)"), "Second Assertion");
        soft.assertAll();
    }

}
