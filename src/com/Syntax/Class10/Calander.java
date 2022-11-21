package com.Syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calander {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.delta.com/");
        driver.manage().window().maximize();

        // click on the calander
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

        // get the month and check if it is the desired mounth
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean isFound = false;
        while(!isFound) {
          String monthName = month.getText();

          if (monthName.equalsIgnoreCase("March")) {

              // get all the dates from the table
              List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
              // traverse through the list to find your desired date
              for (WebElement date:dates) {
                  String currentDate = date.getText();
                  if (currentDate.equalsIgnoreCase("15")) {
                      date.click();
                      break;
                  }
              }



              System.out.println(" I have found the desired moonth : "+monthName);
              isFound = true;
          }
          else {
              WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
              nextButton.click();
          }


        }







    }
}
