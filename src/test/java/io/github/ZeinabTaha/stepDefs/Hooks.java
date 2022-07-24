package io.github.ZeinabTaha.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {

    public static WebDriver driver = null;

    @Before
    public static void openDriver(){
        //setup the browser
        WebDriverManager.chromedriver().setup();

        //initialization the browser
       driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //navigate to the website
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @After
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
