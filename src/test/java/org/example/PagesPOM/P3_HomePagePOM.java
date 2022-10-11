package org.example.PagesPOM;

import org.example.StepDefinitions.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3_HomePagePOM {

    public WebElement addWishlistQuantity()
    {

        return Hook.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }

    public WebElement notification_Bar(){
      //  return Hook.driver.findElement(By.id("bar-notification"));
      //  bar-notification success
       // return Hook.driver.findElement(By.className("bar-notification"));

        return Hook.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement messageWishlist()
    {
        return Hook.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public List<WebElement> addToWishlist()
    {
        return Hook.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement twitter_Link()
    {
        return Hook.driver.findElement(By.className("twitter"));
    }
    public WebElement facebook_Link()
    {
        return Hook.driver.findElement(By.className("facebook"));
    }

    public WebElement youtube_Link()
    {
        return Hook.driver.findElement(By.className("youtube"));
    }

    public WebElement rss_Link()
    {
        return Hook.driver.findElement(By.className("rss"));
    }  // test case fail



    public WebElement selectCurrencies()
    {
        return Hook.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> changeCurrencies()
    {
        return Hook.driver.findElements(By.className("actual-price"));
    }

    public WebElement searchItemField()
    {
        return Hook.driver.findElement(By.id("small-searchterms"));
    }

    public List <WebElement> searchOutput() {
        return Hook.driver.findElements(By.className("item-box"));
    }

    public WebElement clickSearch(){
        return Hook.driver.findElement(By.className("picture"));
    }

    public WebElement searchSku(){

        return Hook.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));
    }

    public List<WebElement> hoverCategories()
    {

        return Hook.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }

    public WebElement pageCategory()
    {
        return  Hook.driver.findElement(By.cssSelector("div[class=\"page category-page\"]"));
    }

    public WebElement titlePage()
    {
        return  Hook.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

    public List<WebElement> subCateg(int Numcateg)
    {
        Numcateg = Numcateg + 1;
        return Hook.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+ Numcateg + "]/ul[@class=\"sublist first-level\"]/li"));
    }

    public List<WebElement> sliderWrapper()
    {
        return  Hook.driver.findElements(By.className("nivo-control"));
    }


}
