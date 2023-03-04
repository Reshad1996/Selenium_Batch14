package com.Syntax.Class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HMW01 {
    public static void main(String[] args) throws InterruptedException {

        /*  1 : goto https://demo.guru99.com/test/simple_context_menu.html
           right click  on the button, select edit and handle the alert
            2 : double click on the button and handle the alert
        */

        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();

        // Task 1 :
        // find the right click button by xpath
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);  // Action claas
        action.contextClick(rightClick).perform();  // perfrom right click button

        // find the Edit button by xpath
        WebElement EditBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
        EditBtn.click();

        Alert alert = driver.switchTo().alert();  // switch focus to alert
        Thread.sleep(2000);
        alert.accept(); // handle the alert

        // Task 2 :
        // find the Double Click Me To see alert by xpath
        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions action1 = new Actions(driver);  // Action claas
        action1.doubleClick(doubleClick).perform();  // perfrom double click button

        driver.switchTo().alert();  // switch focus to alert
        Thread.sleep(2000);
        alert.accept(); // handle the alert












    }
}
