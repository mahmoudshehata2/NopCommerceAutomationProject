package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesPOM.P3_HomePagePOM;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_FollowUsStepD {
    P3_HomePagePOM followUs = new P3_HomePagePOM();

    @When("user opens facebook link")
    public void openFacebook() throws InterruptedException {
        followUs.facebook_Link().click();
    }

    @When("user opens rss link")
    public void openRss()
    {
        followUs.rss_Link().click();
    }

    @When("user opens youtube link")
    public void openYoutube()
    {
        followUs.youtube_Link().click();
    }

    @When("user opens twitter link")
    public void openTwitter()
    {
        followUs.twitter_Link().click();
    }

    @Then("^\"(.*)\" The link is opened in new tab$")
    public void newTabOpened(String url)
    {

        ArrayList<String> tabsLinks = new ArrayList<>(Hook.driver.getWindowHandles());
        System.out.println(tabsLinks.size());

        Hook.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        Hook.driver.switchTo().window(tabsLinks.get(1));
        System.out.println(Hook.driver.getCurrentUrl());
        System.out.println(url);

        Assert.assertEquals(Hook.driver.getCurrentUrl(),url);
        Hook.driver.close();

        Hook.driver.switchTo().window(tabsLinks.get(0));
        System.out.println(Hook.driver.getCurrentUrl());
        System.out.println(url);

        tabsLinks = new ArrayList<>(Hook.driver.getWindowHandles());


    }
}
