package com.syntax.test;

import com.syntax.Utils.CommonMethods;
import com.syntax.Utils.CommonMethodss;
import com.syntax.pages.loginPageWithPageFactory;
import com.syntax.testBase.BaseClass;
import org.openqa.selenium.WebElement;

import javax.sql.CommonDataSource;

public class loginPageTest {

    public static void main(String[] args) {
 //       open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

 //      locate the elements on loginPage and send the username and password

        loginPageWithPageFactory login= new loginPageWithPageFactory();
        WebElement user =login.userName;
        CommonMethodss.sendText(user,"Admin");

        WebElement pass = login.password;
        CommonMethodss.sendText(pass,"whywhy");

        login.loginbt.click();

 //       take screenshot

        CommonMethodss.takeTheSs("loginPage");
 //     close the browser
        BaseClass.tearDown();
    }
}
