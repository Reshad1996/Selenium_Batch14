package com.Review.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tables {
    public static void main(String[] args) {


        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
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
        //  click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();

        // Task 3 :
        // click on Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeListBtn.click();

        // from the table choose one id (it must be from the first page) id= "44968A"


        // counter variable
        int rowCount = 0;

        boolean notfound = true;
        while(notfound) {
            // A while loop continues to execute till the condition in the parenthesis is true

            // get all the data in the column ID of the table
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (WebElement id : idColumn) {
                String personID = id.getText();

                if (personID.equals("41641A")) {
                    System.out.println("the row number of desierd id is " + (rowCount + 1));

                    //  get the checbkbox on this row number and click it
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount + 1) + "]/td[1]"));
                    checkBox.click();
                    notfound = false;
                    break;
                }
                rowCount++;
            }

            if (notfound) {
                WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
                nextButton.click();
                rowCount=0;
            }

        }

    }
}
