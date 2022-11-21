package com.Review.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        //open gmail.com sigup page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        // maximize
        driver.manage().window().maximize();

        //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();

        // click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        String mainPageHandle = driver.getWindowHandle();

        // get all the window handles
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle:allHandles) {
            driver.switchTo().window(handle);
            String URL = driver.getCurrentUrl();

            System.out.println(URL);
            // making sure that we have switched to the right page
            if(URL.equalsIgnoreCase("https://support.google.com/accounts?hl=en&visit_id=638037283464435703-3333014810&rd=2&p=account_iph#topic=3382296")){
                break;
            }
        }

        // find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());

    }
}
