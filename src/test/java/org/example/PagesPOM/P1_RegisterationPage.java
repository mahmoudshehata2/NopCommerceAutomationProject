package org.example.PagesPOM;

import org.example.StepDefinitions.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P1_RegisterationPage {

    public WebElement  registerPage()
    {
        return Hook.driver.findElement(By.className("ico-register"));
    }

    public List<WebElement> selGender()
    {
         List<WebElement> options = Hook.driver.findElements(By.id("gender"));
         return options ;
    }

    public WebElement fName()
    {
        return  Hook.driver.findElement(By.id("FirstName"));
    }

    public WebElement lName()
    {
        return  Hook.driver.findElement(By.id("LastName"));
    }

    public WebElement DateOfBirthday()
    {
        return Hook.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement DateOfBirthMonth()
    {
        return Hook.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement DateOfBirthYear()
    {
        return Hook.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement enterEmail()
    {
        return  Hook.driver.findElement(By.id("Email"));
    }

    public WebElement enterPassword()
    {
        return  Hook.driver.findElement(By.id("Password"));
    }

    public WebElement enterConfPassword()
    {
        return  Hook.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement clickRegisterBTN()
    {
        return  Hook.driver.findElement(By.id("register-button"));
    }

    public WebElement successmsg(WebDriver driver){

        return  Hook.driver.findElement(By.className("result"));

    }

    public WebElement AssertRegisterText(WebDriver driver){

        return  Hook.driver.findElement(By.className("result"));

    }
}
