package com.Syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class actionClass {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        // find the element EN
        WebElement enHover = driver.findElement(By.xpath("//div[text()='EN']"));

        // action class
        Actions action = new Actions(driver);
        action.moveToElement(enHover).perform();



    }
}
