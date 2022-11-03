package com.Syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class CheckBoxDemo02 {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto the syntax project /Checkbox
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        // maximize
        driver.manage().window().maximize();

        // find all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        // travers through list of checkboxes to find the desire one
        for (WebElement checkbox:checkBoxes) {
            // get the attribute value to check if this is the right option to select
          String optionName = checkbox.getAttribute("value");
          // if condition to make sure it is the right checkbox
            if (optionName.equalsIgnoreCase("Option-3")) {
                // if passes click on it
                checkbox.click();
            }
        }
    }
}
