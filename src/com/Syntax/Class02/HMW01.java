package com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW01 {

    public static void main(String[] args) throws InterruptedException {

        /* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
           fill out the form
           click on register
           close the browser
        */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Ahmad Reshad");
        driver.findElement(By.id("customer.lastName")).sendKeys("Gulzada");
        driver.findElement(By.id("customer.address.street")).sendKeys("3102,Hollowstone Dr");
        driver.findElement(By.id("customer.address.city")).sendKeys("Atlanta");
        driver.findElement(By.id("customer.address.state")).sendKeys("GA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("30052");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-789");
        driver.findElement(By.id("customer.ssn")).sendKeys("987654321");
        driver.findElement(By.id("customer.username")).sendKeys("Reshad1996");
        driver.findElement(By.id("customer.password")).sendKeys("123abc");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123abc");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
