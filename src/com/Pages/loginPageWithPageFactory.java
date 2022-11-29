package com.Pages;

import com.utils.CommenMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends CommenMethods {

    @FindBy(id="txtUsername")
    public WebElement usernamefield;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passwordfield;

    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;

    //    call the constructor to intialize all elements
    public loginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }




}
