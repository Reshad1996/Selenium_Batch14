package com.Syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HMW02 {
    public static void main(String[] args) {

        /* **HomeWork 2**
           *Implicit wait**
           1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
           2. click on get New User
           3. get the firstname  of user and print it on console
        */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // goto the  project
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        // maximize
        driver.manage().window().maximize();

        // Task 1 :
        // click on get New User
        WebElement newUserBtn = driver.findElement(By.xpath("//button[text()='Get New User']"));
        newUserBtn.click();

        // Task 2 :
        // get the firstname  of user and print it on console
        WebElement nameValue = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = nameValue.getText();
        System.out.println(text);

    }
}
