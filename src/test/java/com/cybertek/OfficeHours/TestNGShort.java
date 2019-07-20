package com.cybertek.OfficeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNGShort {

    WebDriver driver;
@BeforeClass
    public void bclass(){
        System.out.println("Before Class");
    }




    @BeforeMethod
    public void setup() {

        System.out.println("Before Method");

    }





//    @BeforeMethod
//    public  void setup(){
//    WebDriverManager.chromedriver().setup();
//     driver = new ChromeDriver();
//     driver.manage().window().maximize();
//     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


  @Test
  public void test1(){
      System.out.println("Test 1");
        int x=5;
        int y=5;
      Assert.assertEquals(x,y);

  }

@Test
    public void test2(){
        System.out.println("Test 2");

        int x=5;
        int y=5;
        Assert.assertEquals(x,y);
        throw new SkipException("skip");

    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method");

    }

@AfterClass
    public void AClass(){
        System.out.println("After Class");
    }



}
