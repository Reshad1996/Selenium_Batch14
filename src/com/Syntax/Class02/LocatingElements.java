package com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) {

        // go to fb.com
        // Enter Username
        // Enter Password
        // click login button

        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();


        // go to fb.com
        driver.get("https://www.facebook.com/");

        // maximize the window
        driver.manage().window().maximize();

        // enter the username in the TextBox
             //   1: locate the element and send the key
        driver.findElement(By.id("email")).sendKeys("reshadgulzada");

        // enter the password in the TextBox
            //   2: locate the element and send the key
        driver.findElement(By.name("pass")).sendKeys("123abc");

        // click the login
        driver.findElement(By.name("login")).click();

        // for the following task to work please make sure that you comment the login functionality

        // Task 2 :
        // click on forgot password using linkText
       // driver.findElement(By.linkText("Forgot password?")).click();

        // for the following task to work please make sure that you comment the task2 and login functionality

        // Task 3 :
        //  click on forgot password using Partial linkText locator
       // driver.findElement(By.partialLinkText("Forgot")).click();
    }

}
