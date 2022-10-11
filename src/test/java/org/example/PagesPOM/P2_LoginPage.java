package org.example.PagesPOM;

import org.example.StepDefinitions.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_LoginPage {

    public WebElement loginBTN()
    {
        return Hook.driver.findElement(By.className("ico-login"));
    }

    public WebElement ValidEmail()
    {
        return Hook.driver.findElement(By.id("Email"));
    }

    public WebElement ValidPassword()
    {
        return Hook.driver.findElement(By.id("Password"));
    }
    public WebElement PressBTNLogin()
    {

        return Hook.driver.findElement(By.className("login-button"));
    }

    public WebElement MYAccountAssertion()
    {
        return Hook.driver.findElement(By.className("ico-logout"));
        //return Hook.driver.findElement(By.cssSelector("div[class=\"header-links-wrapper\"] a[href=\"/customer/info\"]"));

    }

    public WebElement invalidMessageLogin(WebDriver driver)
    {
      return Hook.driver.findElement(By.className("validation-summary-errors"));
    }


    public WebElement invalidColor(WebDriver driver){

        return  Hook.driver.findElement(By.className("validation-summary-errors"));

    }

}
