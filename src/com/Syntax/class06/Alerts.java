package com.Syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto the  project
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        // maximize
        driver.manage().window().maximize();

        // find the button click me for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();

        Thread.sleep(2000);

        // Handling the Alert
        Alert simpleAlert1 =  driver.switchTo().alert();
        simpleAlert1.accept();

        // find the button for confirmation alert and click it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

       Alert confirmationAlert1 = driver.switchTo().alert();
       confirmationAlert1.dismiss();

       // find the prompt alert and send some text then accept ot
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();

       // switch to focus to the alert
       Alert promp1 = driver.switchTo().alert();
       promp1.sendKeys("abracadabra");
       promp1.accept();



    }
}
