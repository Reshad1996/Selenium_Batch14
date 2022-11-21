package com.Review.Class03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // Task : goto gmail sign up and get the window handle

        // goto gmail signup page
        driver.get("https://demoqa.com/alerts");
        // maximize
        driver.manage().window().maximize();

        // click on the button
        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();
        Thread.sleep(2000);
        //alert interface
        Alert Alert1 = driver.switchTo().alert();
        Alert1.accept();

        // alert btn 3
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();

        // reusing the alert already declared
        Alert1.sendKeys("abracadbra");
        Alert1.accept();


    }
}
