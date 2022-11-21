package com.Review.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        // goto the  project
        driver.get("https://www.facebook.com/");
        // maximize
        driver.manage().window().maximize();

        // find the button create and click on it
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();

        // sleep for 3sec to wait for window to open up
        Thread.sleep(3000);

        // select the date from dropdown
        // approach to use the select to initial the instance
        // 1. find the webelement that contains the select tag
        // 2. use select class Select sel = new Select(Webelement);

        // 1.
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        // 2.
        Select sel = new Select(day);

        // we have now 3 methods
        // 1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
        // 2. Select by visible text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        // 2. Select by value
        sel.selectByValue("16");
        // .......................................................

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("Aug");

        // print all the available months in the console
        // gets you all the availble option in the dropdown
        List<WebElement> option = selectMonth.getOptions();
        // traverse through the loop and print each Webelement
        for (int i=0 ; i<option.size() ; i++) {
          String months = option.get(i).getText();
            System.out.println(months);

        }

    }
}
