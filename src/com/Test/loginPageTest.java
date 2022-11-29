package com.Test;

import com.Pages.loginPage;
import com.utils.CommenMethods;

public class loginPageTest {
    public static void main(String[] args) {

        CommenMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPage login = new loginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();



    }
}
