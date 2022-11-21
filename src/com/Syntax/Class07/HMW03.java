package com.Syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW03 {
    public static void main(String[] args) {

        /* HomeWork3: (do not use thread .sleep  or Explicit wait)
           1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
           2.Click on start button
           3. get the text Welcome Syntax technologies and print on console
              *the text will be Empty.
              *write down  whatever the reason you understand  of text being empty after exploring DOM.
        */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // Task 1 :
        // goto the project
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        // maximize
        driver.manage().window().maximize();

        // Task 2 :
        // Click on start button
        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();

        // Task 3 :
        // get the text Welcome Syntax technologies and print on console
        WebElement Technologies = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = Technologies.getText();
        System.out.println(text);

        // ( Consle is not prinitng any text because the DOM and the UI are not the same)
    }
}
