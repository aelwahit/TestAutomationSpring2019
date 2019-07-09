package com.cybertek.Homeworks;

import com.cybertek.day4.Library;
import com.cybertek.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        List<String>searchStrs= Arrays.asList("Java", "Junit","REST Assured");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        for(String each : searchStrs) {

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(each);
            // finding search button and clicking
            driver.findElement(By.name("btnK")).click();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            String expected = driver.findElement(By.className("iUh30")).getText();

            driver.findElement(By.className("LC20lb")).click();

            String actual = driver.getCurrentUrl();


            Library.verifyEquals(expected,actual);



            driver.navigate().back();
            driver.navigate().back();

        }

        driver.close();
    }


}