package com.Syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        // switch the focus to the frame
        driver.switchTo().frame(0);

        // dragable
        WebElement dragAbleElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        // dropable
        WebElement dropAbleElement = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);
       // action.dragAndDrop(dragAbleElement,dropAbleElement).perform(); // one of drag and drop
        action.clickAndHold(dragAbleElement).moveToElement(dropAbleElement).release().build().perform(); // another way





    }
}
