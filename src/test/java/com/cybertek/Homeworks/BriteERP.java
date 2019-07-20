package com.cybertek.Homeworks;

import com.cybertek.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BriteERP {

    WebDriver driver;


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://34.220.250.213/web/login");
        driver.findElement(By.id("login")).sendKeys("Lunch_Invoicing_User@info.com");
        driver.findElement(By.id("password")).sendKeys("LD686gfX26", Keys.ENTER);
        SeleniumUtils.waitPlease(3);

    }


    @Test
    public void test1() {
        driver.findElement(By.linkText("Lunch")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
        SeleniumUtils.waitPlease(1);

        driver.findElement(By.xpath("//span[contains(text(),'Your Lunch')]")).click();
        SeleniumUtils.waitPlease(1);
        assertEquals(driver.findElement(By.cssSelector(".breadcrumb")).getText(), "Your Account");


//        driver.findElement(By.xpath("(//span[contains(text(),'Lunch') and @class='oe_menu_text'])[1]")).click();
//        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();

    }


    @Test
    public void test2() {
        driver.findElement(By.linkText("Lunch")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
        SeleniumUtils.waitPlease(1);


        driver.findElement(By.xpath("//span[contains(text(),'New Order')]")).click();
        SeleniumUtils.waitPlease(1);


        driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']")).click();
        SeleniumUtils.waitPlease(1);

        WebElement addingItem = driver.findElement(By.linkText("Add an item"));

        assertTrue(addingItem.isDisplayed());

    }

    @AfterMethod
    public void tearDown() {
        SeleniumUtils.waitPlease(2);
        driver.close();

    }
}