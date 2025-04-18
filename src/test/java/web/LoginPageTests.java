package web;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import web.generic.BaseTest;
import web.pages.LoginPage;

public class LoginPageTests extends BaseTest{

    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getMobileNumberTxtfd().sendKeys("7702425817");
        List<WebElement> pwds = loginPage.getPasswordTxtfd();
        for (WebElement element : pwds) {
            element.sendKeys("1");
        }
        Thread.sleep(2000);
        try {
            loginPage.getLoginBtn().click();
            loginPage.getLoginBtn().click();
        } catch (Exception e) {}
    }
}
