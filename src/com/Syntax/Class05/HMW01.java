package com.Syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMW01 {
    public static void main(String[] args) throws InterruptedException {

        /* 1.Go to facebook
           2.click on create New Account
           3.Fill out the whole form
           4.Take screen shot of filled out form manually and share in HW channel along with code
        */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto the fb.com
        driver.get("https://www.facebook.com/");
        // maximize
        driver.manage().window().maximize();

        // click on create new account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmad Reshad");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gulzada");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Ar.gulzada@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123abc");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Ar.gulzada@gmail.com");

        // find the webelement dropdown by looking for select tag
        WebElement birthMonth = driver.findElement(By.cssSelector("select#month"));
        // use Select class
        Select select = new Select(birthMonth);
        // select an option by index
        select.selectByIndex(4);


        // find the webelement dropdown by looking for select tag
        WebElement birthDay = driver.findElement(By.cssSelector("select#day"));
        // use Select class
        Select sel = new Select(birthDay);
        // select an option by index
        sel.selectByIndex(5);

        // find the webelement dropdown by looking for select tag
        WebElement birthYear = driver.findElement(By.cssSelector("select#year"));
        // use Select class
        Select se = new Select(birthYear);
        // select an option by index
        se.selectByValue("1996");

        // find the chekbox
        WebElement checkBox = driver.findElement(By.xpath("//label[text()='Male']"));
        // click the checkbox
        checkBox.click();

        // click on sign in button
        WebElement signIn = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signIn.click();

    }
}
