package com.Review.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        // goto the  project
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        // maximize
        driver.manage().window().maximize();

        // find the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='color']"));

  // what does this contain?
  // it contains all the 6 webelements

        for (WebElement checkBox:checkBoxes) {
           String color = checkBox.getAttribute("value");

           if (color.equalsIgnoreCase("blue")) {
               checkBox.click();
               break;
           }

        }


    }
}
