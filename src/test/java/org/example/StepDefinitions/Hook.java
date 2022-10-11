package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



public class Hook {
    public static WebDriver driver = null;

    @Before
    public static void openBrowser()  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //String  url = "https://demo.nopcommerce.com/";
       // driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");


        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());  //  window tap
        driver.switchTo().window(Tabs.get(0)).close();
        driver.switchTo().window(Tabs.get(1));
        Thread.sleep(2000);

        Tabs = new ArrayList<>(driver.getWindowHandles());   // update tabs


    }
    @After
    public static void close_driver()
    {
        driver.quit();
    }
}
