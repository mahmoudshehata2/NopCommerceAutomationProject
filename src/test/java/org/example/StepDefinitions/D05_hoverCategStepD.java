package org.example.StepDefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.PagesPOM.P3_HomePagePOM;
import org.example.UtilitiesAdd.UtilitiesClass;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D05_hoverCategStepD {
    P3_HomePagePOM hover = new P3_HomePagePOM();
    String category;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

       int categoriesCount = hover.hoverCategories().size();
       int numCateg = UtilitiesClass.randomNum(0, categoriesCount-1);
       System.out.println(numCateg);

       Actions a = new Actions(Hook.driver);
        a.moveToElement(hover.hoverCategories().get(numCateg)).perform();

       Hook.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       if(!hover.subCateg(numCateg).isEmpty())
        {
       int subCateg = hover.subCateg(numCateg).size();

       int subCategNum = UtilitiesClass.randomNum(0, subCateg-1);

       this.category = hover.subCateg(numCateg).get(subCategNum).getText().trim();
       System.out.println("Sub categories: "+this.category);
        hover.subCateg(numCateg).get(subCategNum).click();

        }

       else

       {
           this.category = hover.hoverCategories().get(numCateg).getText().trim();
           System.out.println("Main category: "+this.category);
           hover.hoverCategories().get(numCateg).click();

       }

        Hook.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("page categories is displayed and select categories successfully")
    public void category_page_displayed() throws InterruptedException {

    SoftAssert soft = new SoftAssert();
    soft.assertTrue(hover.pageCategory().isDisplayed(),"first Assertion");
    soft.assertTrue(hover.titlePage().getText().contains(this.category),"second Assertion");

    soft.assertAll();

    }

}