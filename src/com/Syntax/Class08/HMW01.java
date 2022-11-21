package com.Syntax.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HMW01 {
    public static void main(String[] args) {

        /* go to https://the-internet.herokuapp.com/dynamic_controls
           click on checkbox and click on remove
           verify the text
           click on enable verify the textbox is enabled
           enter text and click disable
           verify the textbox is disabled
        */

        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

        // Task 1 :
        // click on checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        // click on remove
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();

        // Task 2 :
        // verify the text
        WebDriverWait wait = new WebDriverWait(driver,20);  // Define explicit wait
        // find the "it's gone!" message by xpath and wait for it to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        // find the "it's gone!" message and verfiy the text
        WebElement verrifyText = driver.findElement(By.xpath("//p[@id='message']"));
        String text = verrifyText.getText();
        System.out.println("Message display when the button is removed : "+text);

        // Task 3 :
        // click on enable verify the textbox is enabled
        WebElement enableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']")); // Find the Enabled button by xpath
        enableBtn.click(); // click on it

        WebDriverWait enableWait = new WebDriverWait(driver,20);  // Define explicit wait
        // find the "it's gone!" message by xpath and wait for it to appear
        enableWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        // find the "it's enabled!" message and verfiy the text
        WebElement enableText = driver.findElement(By.xpath("//p[@id='message']"));
        String text1 = enableText.getText();
        System.out.println("Message display when the button is enabled : "+text1);

        // Task : 4
        // enter text and click disable
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']")); // find the textbox by xpath
        textBox.sendKeys("Reshad Gulzada"); // send the key to it

        WebElement disableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableBtn.click();

        // Task : 5
        // verify the textbox is disabled
        WebDriverWait disableWait = new WebDriverWait(driver,20);  // Define explicit wait
        // find the "it's gone!" message by xpath and wait for it to appear
        disableWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        // find the "it's enabled!" message and verfiy the text
        WebElement disableText = driver.findElement(By.xpath("//p[@id='message']"));
        String text2 = disableText.getText();
        System.out.println("Message display when the button is disabled : "+text2);


    }
}
