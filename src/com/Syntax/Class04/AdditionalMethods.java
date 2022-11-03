package com.Syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // goto the syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        // find the webelement button
       WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
       // get the text from the btn webelement
        String text = btn.getText();
        // print it on console
        System.out.println(text);

        // get the value of the attribute "id" from this webelement
        String idValue = btn.getAttribute("id");
        // print it on console
        System.out.println(idValue);
    }
}
