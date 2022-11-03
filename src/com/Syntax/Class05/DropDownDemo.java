package com.Syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto the syntax project /DropDown
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // maximize
        driver.manage().window().maximize();

        // find the webelement dropdown by looking for select tag
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='select-demo']"));

        // use Select class
        Select select = new Select(dropdown);

        // select an option by index
        select.selectByIndex(5);

        Thread.sleep(3000);
        // select by visible Text
        select.selectByVisibleText("Saturday");

        Thread.sleep(3000);
        // select by value
        select.selectByValue("Sunday");

        Thread.sleep(3000);
        // to get all the options available to us in the dropdown we can use
        List<WebElement> options = select.getOptions();
        for (int i=0 ; i<options.size() ; i++) {
            WebElement option = options.get(i);

            String text = option.getText();
            if (text.equalsIgnoreCase("Friday")) {
                select.selectByIndex(i);
            }
        }
    }

}
