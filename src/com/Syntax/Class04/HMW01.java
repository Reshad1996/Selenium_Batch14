package com.Syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW01 {
    public static void main(String[] args) {

        /* Open chrome browser
           Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
           Enter valid username and password (username - Admin, password - Hum@nhrm123)
           Click on login button
           Then verify the message "Welcome Admin " is there on the top right corner
        */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto SyntaxHRM.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%C3%A2%C2%80%C2%9D");
        driver.manage().window().maximize();

        // Enter the valid username
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        // Enter the valid password
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");

        // Click on Login button
        WebElement loginBtn = driver.findElement(By.cssSelector("input.button"));
        loginBtn.click();

        //Then verify the message "Welcome Admin " is there on the top right corner
        WebElement Message = driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
        boolean displayStatus = Message.isDisplayed();
        System.out.println("the message \"Welcome Admin \" is there on the top right corner: "+Message.isDisplayed());
    }
}
