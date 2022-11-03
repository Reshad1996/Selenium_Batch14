package com.Syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class   on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        // goto the syntax project /DropDown
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // maximize
        driver.manage().window().maximize();

        // find the webelement that contains the select clas
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        // using select class
        Select sel = new Select(DD);

        // select by index
        sel.selectByIndex(3);

        // by visible text
        sel.selectByVisibleText("Texas");

        Thread.sleep(3000);
        // deselect by index
        sel.deselectByIndex(3);

        // write down the code to select all the options in the dropdown
        List<WebElement> option = sel.getOptions();
        for (int i=0 ; i<option.size() ; i++) {
            sel.selectByIndex(i);
        }

        Thread.sleep(3000);
        // deselect all of them
        sel.deselectAll();

        // how can you check if the dropdown is multi select or not using selenium?
        boolean multiSelect = sel.isMultiple();
        System.out.println(multiSelect);

    }
}
