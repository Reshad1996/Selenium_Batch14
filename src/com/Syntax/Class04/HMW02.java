package com.Syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW02 {
    public static void main(String[] args) {

        /* HRMS Application Negative Login:
           Open chrome browser
           Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
           Enter valid username
           Leave password field empty
           Click on login button
           Verify error message with text “Password cannot be empty” is displayed.
       */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto SyntaxHRM.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

        // Enter the valid username
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        // Click on Login button
        WebElement loginBtn = driver.findElement(By.cssSelector("input.button"));
        loginBtn.click();

        //  Verify error message with text “Password cannot be empty” is displayed.
        WebElement Message = driver.findElement(By.xpath("//span[contains(text(),'Password cannot')]"));
        String msg = Message.getText();
        boolean displayStatus = Message.isDisplayed();
        if (displayStatus) {
            System.out.println("“Password cannot be empty” is displayed: "+displayStatus);
        } else {
            System.out.println("“Password cannot be empty” is displayed: "+displayStatus);
        }
    }
}
