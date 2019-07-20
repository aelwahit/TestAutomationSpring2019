package com.cybertek.Homeworks;

import com.cybertek.day4.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/user/login");
        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("salesmanager261 ");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String actualTitle= driver.getTitle();
       String expectedTitle = "Dashboard";
        Library.verifyEquals(expectedTitle,actualTitle);

        Library.sleep(2);
        driver.close();
    }
}
