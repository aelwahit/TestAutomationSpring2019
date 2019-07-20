package com.cybertek.OfficeHours;

import com.cybertek.day4.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNGDemo {
    WebDriver driver;


@BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.findElement(By.cssSelector("#dropdownMenuLink")).click();
    }


     @Test
    public void test1(){
    driver.findElement(By.linkText("Google")).click();
         String expected = "https://www.google.com/";
         Library.sleep(2);
         String actual = driver.getCurrentUrl();
         Assert.assertEquals(expected,actual);



    }

    @Test()
    public void test2(){
        driver.findElement(By.linkText("Amazon")).click();
        String expected = "https://www.amazon.com/";
        Library.sleep(2);
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);



    }



    @Test(invocationCount = 4)
    public void test3(){
        driver.findElement(By.linkText("Yahoo")).click();
        String expected = "https://www.yahoo.com/";
        Library.sleep(2);
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        System.out.println("yahoooooo");



    }



    @Test
    public void test4(){
        driver.findElement(By.linkText("Etsy")).click();
        String expected = "https://www.etsy.com/";
        Library.sleep(2);
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);



    }


    @Test
    public void test5(){
        driver.findElement(By.linkText("Facebook")).click();
        String expected = "https://www.facebook.com/";
        Library.sleep(2);
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);



    }





@AfterMethod
    public void close(){

       driver.close();
    }









}
