package com.Syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HMW01 {
    public static void main(String[] args) {

        /* **HomeWork 1**
           **WindowHandles**
           1.goto http://accounts.google.com/signup
           2.click on help and privacy btn
           3.click on community Button
           4.goto gmail.com page and enter your user name in form
           Create your Google Account
           Hint1:
           u can save the window handle in variables for later use
        */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // Task 1 :
        // goto gmail signup page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        // maximize
        driver.manage().window().maximize();

        // Task 2 :
        // click on help and privacy btn
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        // get the window handle for the current page
        String gmail = driver.getWindowHandle();

        // get all the window handles
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles) {
            // switching the focus to the current handle from list
            driver.switchTo().window(handle);
            // get the title of the window to which the driver has switched
            String title = driver.getTitle();

            // compare if the title is of the help
            if (title.equalsIgnoreCase("Google Account Help")) {  // the title of my desired page is    (Google Account Help)

                System.out.println("The current page under focus is :"+title);
                break;
            }
        }
        // Task 3 :
        // click on community Button
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));

        // Task 4 :
        // goto gmail.com page and enter your user name in form
        driver.switchTo().window(gmail); // Switch focus to main page gmail
        WebElement userName = driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("Reshad Gulzada");



    }
}
