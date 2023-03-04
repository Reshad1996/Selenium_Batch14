package com.Syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HMW02 {
    public static void main(String[] args) {

        /* 1.Go to ebay.com
           2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
           3.select Computers/Tables & Networking
           4.click on search
           5.verify the title
        */

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        // goto the fb.com
        driver.get("https://www.ebay.com/");
        // maximize
        driver.manage().window().maximize();

        // get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
        WebElement allCatagory = driver.findElement(By.cssSelector("select#gh-cat"));

        Select select = new Select(allCatagory);

        List<WebElement> options = select.getOptions();
        for (int i=0 ; i<options.size() ; i++) {
            WebElement option = options.get(i);

            String text = option.getText();
            System.out.println(text);

            // select Computers/Tables & Networking
            if (text.equalsIgnoreCase("Computers/Tablets & Networking")) {
                select.selectByIndex(i);
            }
        }

           // click on search
         driver.findElement(By.xpath("//input[@value='Search']")).click();
         String title = driver.getTitle();
         System.out.println("Title is: "+title);
         if (title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")) {
             System.out.println("The titled: "+title+" is verfied.");
         } else {
             System.out.println("The titled: "+title+" is not verfied.");
         }

    }
}
