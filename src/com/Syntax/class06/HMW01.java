package com.Syntax.class06;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class HMW01 {
    public static void main(String[] args) {

        /* goto https://chercher.tech/practice/frames
           1.check the checkBox
           2.Select BabyCat from drop dwon
           3. Send text in text box "DONE"
        */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto the  project
        driver.get("https://chercher.tech/practice/frames");
        // maximize
        driver.manage().window().maximize();

        // Task 1 : check the checkBox.
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame("frame1");
        WebElement insideFrame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(insideFrame);
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        // Task 2 : Select BabyCat from drop dwon.
        driver.switchTo().defaultContent();
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame2);
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dropDown);
        sel.selectByValue("babycat");

        // Task 3 : Send text in text box "DONE".
        driver.switchTo().defaultContent();
        WebElement frame001 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame001);
        WebElement text = driver.findElement(By.xpath("//input"));
        text.sendKeys("DONE");














    }
}
