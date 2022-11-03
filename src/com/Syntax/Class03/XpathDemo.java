package com.Syntax.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();

       // enter the username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("reshad");

        // click on forgot password
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
    }
}

//button[contains(@type, 'sub')]
//a[contains(text(), 'Forgot')]
//input[starts-with(@name,'pa')]