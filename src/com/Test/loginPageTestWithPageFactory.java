package com.Test;


import com.Pages.loginPageWithPageFactory;
import com.utils.CommenMethods;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {

        CommenMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPageWithPageFactory login = new loginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginBtn.click();





    }
}
