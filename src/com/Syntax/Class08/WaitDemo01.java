package com.Syntax.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitDemo01 {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();

        // click on the button "change text to selenium webDriver
        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();

        // get the text "selenium webDriver"
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        // print out text on the screen
        System.out.println(webDriverText.getText());

        // Task 2 :
        // click on the button "display text after 10 second"
        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();

        // as the button apears up after sometimes so in order to  click it or get text from
        // we need to define some explicit wait

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //button[@id='hidden']")));

        WebElement visibleBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();

        //

    }
}
