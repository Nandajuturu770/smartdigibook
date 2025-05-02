package web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import web.generic.BaseTest;
import web.pages.HomePage;
import web.pages.LoginPage;

public class HomePageTests extends BaseTest {

	final static Logger logger = LogManager.getLogger(HomePage.class);

	String mobileNumber = "7702425817";
	String password = "111111";
	LoginPage loginPage;
	HomePage homePage;

	@BeforeMethod(alwaysRun = true)
	public void initialization() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.loginIntoApplication(mobileNumber, password);
	}
	
	@Test
	public void verifyHomePage() {
		homePage.verifyHeaderOfHome();
		homePage.verifyMyLibrary();
		homePage.verifyHelpCenterFeature(true);
	}
}
