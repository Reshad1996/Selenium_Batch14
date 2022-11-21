package com.Review.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
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

        // switch the focus of the driver to the parent iframe whose id is iframe1
        driver.switchTo().frame("frame1");
        // switch the focus to the child frame
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        // switch the focus back to the main page
        driver.switchTo().defaultContent();

        // switching to the frame which has dropdown
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

        // find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dropDown);
        sel.selectByIndex(1);

        // switch the focus back to the main page
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("alksjd");











    }
}
