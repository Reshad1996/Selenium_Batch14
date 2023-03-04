package com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {

    public static void main(String[] args) {

        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers1/chromedriver.exe");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();

        // goto smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // maximize the window
        driver.manage().window().maximize();

        // Enter the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // Enter the password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // Click login
        driver.findElement(By.className("button")).click();

        // Make sure the title is correct i.e Web Order

        // get titile of the page
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Web Order")) {
            System.out.println("The title is correct :"+title);
        }
        else {
            System.out.println("The title is incorrect :"+title);
        }
    }
}
