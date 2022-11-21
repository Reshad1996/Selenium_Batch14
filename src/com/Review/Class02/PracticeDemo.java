package com.Review.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        // goto the  project HRM
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // maximize
        driver.manage().window().maximize();

        // when user send in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
        // send the user name
        userName.sendKeys("Admin");

        // Then user send in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        pass.sendKeys("dhakjlsdh");

        // Then user clicks on login button
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

        // Then verify thata the error  "invalid credentials"
        WebElement errorMSG = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMSG.getText();

        // Verfication
        if (error.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("The correct Error message is there ---> verfied");
        } else {
            System.out.println("The correct Error message is not there");
        }


    }
}
