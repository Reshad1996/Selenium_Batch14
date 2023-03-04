package com.Syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calanderPagination {
    public static void main(String[] args) {

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
        //  click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();

        // Task 3 :
        // click on Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeListBtn.click();





        boolean idFound=false;
        while(!idFound) {
            // get all the ids from the columns
            List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < columnID.size(); i++) {
                String id = columnID.get(i).getText(); //extract the id from the entry in list

                if (id.equalsIgnoreCase("40907A")) {  // check if it is the desired id
                    int rowNumber = i + 1;
                    System.out.println("screen saver  is  found  on row number :"+rowNumber);

                    //  get the checbkbox on this row number and click it
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + rowNumber + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }

            }
            if (!idFound){
                WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
                nextButton.click();

            }
        }


    }
}
