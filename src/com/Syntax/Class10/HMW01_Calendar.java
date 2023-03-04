package com.Syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HMW01_Calendar {
    public static void main(String[] args) {

        /* Go to syntax hrms .
           Go-to the recruitment tab.
           From the calendar  just select a date
           8 August 2023
        */

        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Task 1 :
        // Login the username and password
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        // Task 2 :
        // Go-to the recruitment tab.
        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentBtn.click();

        // Task 3 :
        // From the calendar  just select a date

        //  click on the date format
        WebElement dates = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        dates.click();

        // Select date as (8 August 2023)
        // Select August from dropdown
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select sel = new Select(month);   // Use Select class to select form dropdown
        sel.selectByVisibleText("Aug");

         // Select year 2023 form dropdown
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

        Select sel1 = new Select(year);   // Use Select class to select form dropdown
        sel1.selectByValue("2023");

        // select the day 8 from the calendar
        List<WebElement> day = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[2]"));

        // travarse through all the columns
        for (int i=0 ; i<day.size() ; i++) {
          String text = day.get(i).getText();

          if (text.equals("8")) {
              int rowNumber = i + 1;
              System.out.println("screen saver  is  found  on row number :"+rowNumber);

              // get the row and click on it
              driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+rowNumber+"]/td[2]")).click();
          }
        }

    }
}
