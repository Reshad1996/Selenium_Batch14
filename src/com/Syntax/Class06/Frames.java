package com.Syntax.Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto the  project
        driver.get("https://chercher.tech/practice/frames");
        // maximize
        driver.manage().window().maximize();


        // Task 1: print the animals on the screen and then select baby Cat from the drop down

        // Step 1 : Switch to the frame using by index
        driver.switchTo().frame(1);

        // find the text animals and print on screen
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = animalText.getText();
        System.out.println(text);

        // Task 2 : Check the checkBox

        // Back to the main page
        driver.switchTo().defaultContent();

        // switch to the frame containing the subframe which has checkbox
        driver.switchTo().frame("frame1");
        WebElement inputText = driver.findElement(By.xpath("//input"));
        inputText.sendKeys("abracadabra");

       // finfing the frame through xpath and switching using By Webelement method
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id=\"frame3']"));
        driver.switchTo().frame(frame3);

      // find the checkBox
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();



    }
}
