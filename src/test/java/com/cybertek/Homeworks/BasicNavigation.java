package com.cybertek.Homeworks;

import com.cybertek.day4.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
        String googleTitle1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        String googleTitle2 = driver.getTitle();
        driver.navigate().forward();
        String etsyTitle2= driver.getTitle();

        Library.verifyEquals(googleTitle1,googleTitle2);
        Library.verifyEquals(etsyTitle,etsyTitle2);
          driver.quit();










    }
}
//1. Open browser
//        2. Go to website https://google.com
//        3. Save the title in a string variable
//        4. Go to https://etsy.com
//        5. Save the title in a string variable
//        6. Navigate back to previous page
//        7. Verify that title is same is in step 3
//        8. Navigate forward to previous page
//        9. Verify that title is same is in step 5