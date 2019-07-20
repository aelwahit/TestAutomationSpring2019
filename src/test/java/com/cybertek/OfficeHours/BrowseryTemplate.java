package com.cybertek.OfficeHours;

import com.cybertek.day4.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowseryTemplate {

    WebDriver driver;


    @BeforeClass
    public void first(){
        WebDriverManager.chromedriver().setup();

    }



@BeforeMethod
    public void setup(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test
public void test1(){

    }

@Test
public void test2(){

}

@AfterMethod
public void tearDown(){
    Library.sleep(2);
        driver.quit();
}






}
