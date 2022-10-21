package com.Syntax.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

    public static void main(String[] args) {

        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // Create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        // use the get() function to open up the required website
        driver.get("https://www.google.com/");

        // get the URL of the website
       String url = driver.getCurrentUrl();
       // print the url
        System.out.println(url);

        // get the title
        String title = driver.getTitle();
        System.out.println(title);

        // close the chrome
        driver.quit();

    }
}
