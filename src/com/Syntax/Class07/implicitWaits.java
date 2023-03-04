package com.Syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWaits {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        //
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // goto the  project
        driver.get("https://www.facebook.com/");
        // maximize
        driver.manage().window().maximize();

        // Click on create new account
        WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

        // send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Reshad Gulzada");





    }
}
