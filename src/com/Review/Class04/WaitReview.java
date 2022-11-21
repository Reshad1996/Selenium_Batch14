package com.Review.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitReview {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();


        WebElement checkBox = driver.findElement(By.xpath(" //input[@type='checkbox']"));
        checkBox.click();

//        click the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Remove']"));
        button.click();

//        get the text
        WebElement text = driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        System.out.println(text.getText());

//   click on the button
        WebElement buton2 = driver.findElement(By.xpath("//button[text()='Enable']"));
        buton2.click();

//        explicit

        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));


//        send text
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abracadabra");








    }
}
