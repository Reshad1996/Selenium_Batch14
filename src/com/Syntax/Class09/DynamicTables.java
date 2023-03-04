package com.Syntax.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {


        // set the path to the driver to link it with our class  /  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers1/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();

        // Task 1 :
        // login the username
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        // check the checkbox that contains "screensaver" as a product
        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        // traverse through the list
        for (int i = 0; i < secondColumn.size(); i++) {

            String columnText = secondColumn.get(i).getText();
            // check for the desired value
            if (columnText.equalsIgnoreCase("ScreenSaver")) {

                // print out the index of column/row which contains the Scree Saver
                System.out.println("The index of the row which contains the Screen Saver is " + (i + 1));

                // get the checkbox
                // table[@class='SampleTable']/tbody/tr[2]/td[1]
                // table[@class='SampleTable']/tbody/tr[4]/td[1]
                WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));
                checkbox.click();
                // click on it



            }
        }




    }
}
