package com.Syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // goto the syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        // get the radio button
       WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));

       // Check if the radio button is displayed
       boolean displayStatus = maleRadioBtn.isDisplayed();
       // print the display status
        System.out.println("The radio button is displayed :"+displayStatus);

        // check weather the radio button male is Enabled
        boolean enableStatus = maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled :"+enableStatus);

        // check weather the radio button male is Selected
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);

        // Check if the radio button male is not selected then click on it
        if (!selectStatus){
            // perform a click operation on the radio button
            maleRadioBtn.click();
        }
        selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);
    }
}
