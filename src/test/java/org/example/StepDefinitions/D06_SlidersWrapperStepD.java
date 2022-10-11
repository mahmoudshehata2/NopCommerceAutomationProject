package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesPOM.P3_HomePagePOM;


import org.testng.Assert;


public class D06_SlidersWrapperStepD  {


    P3_HomePagePOM  Slider = new P3_HomePagePOM();


    @When("user clicks on first slider")
    public void click_First_SliderWrapper() throws InterruptedException
    {
        Slider.sliderWrapper().get(1).click();
       // Slider.sliderWrapper("1").click();     // isSelected()
    }
    @Then("relative product for first slider is displayed")
    public void displayedFirstSlider() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Hook.driver.getCurrentUrl());
        Assert.assertEquals(Hook.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");

    }
    @When("user clicks on second slider")
    public void Second_Slider()
    {
        Slider.sliderWrapper().get(2).click();
    }


    @Then("relative product for second slider is displayed")
    public void SecondSlider() throws InterruptedException {
        Thread.sleep(6000);
        Assert.assertEquals(Hook.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");

    }



}