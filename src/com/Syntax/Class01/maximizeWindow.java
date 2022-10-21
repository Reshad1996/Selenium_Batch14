package com.Syntax.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {

        // Task :
        // go to google.come
        // maximize the window

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // Create the WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to google.com
        driver.get("https://www.google.com/");

        // maximize the window
        driver.manage().window().maximize();

        // full screen
        driver.manage().window().fullscreen();

        // quit
        driver.quit();
        
    }
}
