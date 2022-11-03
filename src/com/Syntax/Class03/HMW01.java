package com.Syntax.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW01 {
    public static void main(String[] args) throws InterruptedException {

        /*
          Navigate to http://syntaxprojects.com/
          Click on start practicing
          click on simple form demo
          enter any text on first text box
          click on show message
          quit the browser
        */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@id, 'btn_basic')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@class, 'list')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello World");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(), 'Show')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
