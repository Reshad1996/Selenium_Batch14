package com.Syntax.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {

        // Task :
        // go to google.com
        // go to fb.com
        // go back to google.com

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // Create the WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to google.com
        driver.get("https://www.google.com/");

        // go to facebook.com
        driver.navigate().to("https://www.facebook.com/");



        // introduce some sleep which is wait
        // wait or pause for 2000 milli seconds (2 sec)
        Thread.sleep(2000);

        // go backto google.com
        driver.navigate().back();

        // wait for 2sec
        Thread.sleep(2000);

        // go forward to fb.com
        driver.navigate().forward();

        // wait for 2sec
        Thread.sleep(1000);

        // refresh the page
        driver.navigate().refresh();

        // quit
        driver.quit();
    }

}
