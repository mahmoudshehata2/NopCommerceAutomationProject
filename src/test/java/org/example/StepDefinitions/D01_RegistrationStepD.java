package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesPOM.P1_RegisterationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;


public class D01_RegistrationStepD extends P1_RegisterationPage {


    @Given("user go to register page")
    public void user_register_page()
    {
       registerPage().click();

    }

    @When("user select gender type")
    public void Select_gender () throws InterruptedException
    {
        Thread.sleep(1000);
        Random random = new Random();
        int index = random.nextInt(selGender().size());
        Thread.sleep(1000);
        selGender().get(index).click();

    }
    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void enter_fName_lName (String firstname, String lastname)
    {
        fName().sendKeys(firstname);
        lName().sendKeys(lastname);
    }


/*
    @And("user enter first name and last name")
    public void enter_fName_lName () throws InterruptedException
    {
        fName().sendKeys("Mahmoud");
        lName().sendKeys("Mohamed");
    }

 */

    @And("user enter date of birth")
    public void date_of_birth () throws InterruptedException
    {

        DateOfBirthday().sendKeys("10");
        DateOfBirthMonth().sendKeys("11");
        DateOfBirthYear().sendKeys("1997");

    }

    @And("^user enter email \"(.*)\"$")
    public void enter_email(String email)
    {
        enterEmail().sendKeys(email);
    }
/*
    @And("user enter email field")
    public void enter_email() throws InterruptedException
    {
        enterEmail().sendKeys("mahmoud@shehata.com");
    }

 */

    @And("^user enter Password \"(.*)\" and \"(.*)\"$")
    public void enter_Password_ConfirmationP(String password, String confirmationPassword) throws InterruptedException
    {
        enterPassword().sendKeys(password);
        enterConfPassword().sendKeys(confirmationPassword);

    }


    /*
    @And("user enter  Password  and confirmation Pass fields")
    public void enter_Password_ConfirmationP() throws InterruptedException
    {
        enterPassword().sendKeys("mse@1234");
        enterConfPassword().sendKeys("mse@1234");

    }

     */

    @And("user click on register button")
    public void register_button()
    {
        clickRegisterBTN().click();
    }

    @Then("user register successfully")
    public void register_Successfully()
    {
        SoftAssert soft = new SoftAssert();


        String backgroundColor = successmsg(Hook.driver).getCssValue("color");// value valid color
        System.out.println(backgroundColor);
        String expectedColor ="rgba(76, 177, 124, 1)";

        String TextMessage = AssertRegisterText(Hook.driver).getText();
        System.out.println(TextMessage);
        String expectedText ="Your registration completed";


        soft.assertTrue(Hook.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"),"first assertion");

       // soft.assertTrue(Hook.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed(),"second assertion");
        soft.assertTrue(successmsg(Hook.driver).isDisplayed(),"second assertion");
        //soft.assertTrue(Hook.driver.findElement(By.className("result")).getText().contains("Your registration completed"),"third assertion");

        soft.assertTrue(expectedText.contains("Your registration completed"),"third assertion");
        soft.assertTrue(backgroundColor.contains("rgba(76, 177, 124, 1)"), "Forth assertion");
        soft.assertAll();

    }






}
