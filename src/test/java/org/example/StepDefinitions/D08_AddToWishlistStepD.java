package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesPOM.P3_HomePagePOM;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_AddToWishlistStepD {

        P3_HomePagePOM addWishlist = new P3_HomePagePOM();
         SoftAssert soft = new SoftAssert();
    int number ;
         @When("user clicks on wishlist button on product")
         public void clickWishlistProduct () throws InterruptedException {
           addWishlist.addToWishlist().get(2).click();
            Thread.sleep(2000);
          }


    @Then("success message is visible")
    public void message_Visibility() throws InterruptedException {

        Assert.assertTrue(addWishlist.messageWishlist().isDisplayed());
        Thread.sleep(2000);
        soft.assertTrue(addWishlist.notification_Bar().getText().contains("The product has been added to your wishlist"),"First Assertion");
        String actualColor = addWishlist.notification_Bar().getCssValue("background-color");  // background-
        String expectedColor = "rgba(75, 176, 122, 1)";

      //  [rgba(75, 176, 122, 1)] but found [rgba(255, 255, 255, 1)]

        soft.assertEquals(actualColor, expectedColor, "color-Second Assertion");
        soft.assertAll();
    }

    @And("user get the number of wishlist items after adding product to wishlist")
    public void getNumberItems_In_Wishlist()
    {
        String convert  = addWishlist.addWishlistQuantity().getText();
        convert= convert.replaceAll("[^0-9]", "");
        number = Integer.parseInt(convert);


        /*
       try {
           String text  = addWishlist.addWishlistQuantity().getText();
           text= text.replaceAll("[^0-9]", "");
           number = Integer.parseInt(text);
       }
    // catch (NumberFormatException e) {
       catch (Exception e) {
        System.out.println("error"+ e);
    }

         */


    }

    @Then ("number of wishlist items is increased successfully")
    public void numIncreased()
    {
        Assert.assertTrue(number > 0 ) ;

    }



}
