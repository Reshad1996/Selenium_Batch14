package com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW02 {

    public static void main(String[] args) throws InterruptedException {

        /* navigate to fb.com
           click on create new account
           fill up all the textboxes

           close the pop up
           close the browser
        */

        System.setProperty("webdriver.chrome.driver","Drivers1/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Ahmad Reshad");
        driver.findElement(By.name("lastname")).sendKeys("Gulzada");
        driver.findElement(By.name("reg_email__")).sendKeys("ar.gulzada@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123abc");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ar.gulzada@gmail.com");
        driver.findElement(By.id("month")).sendKeys("May");
        driver.findElement(By.id("day")).sendKeys("6");
        driver.findElement(By.id("year")).sendKeys("1996");
       driver.findElement(By.name("websubmit")).click();


    }
}
