package web;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import web.enums.ProfileFields;
import web.generic.BaseTest;
import web.pages.HomePage;
import web.pages.LoginPage;
import web.pages.ProfilePage;

public class HomePageTests extends BaseTest {

	final static Logger logger = LogManager.getLogger(HomePage.class);

	String mobileNumber = "7702425817";
	String password = "111111";
	LoginPage loginPage;
	HomePage homePage;
	ProfilePage profilePage;

	@BeforeMethod(alwaysRun = true)
	public void initialization() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		profilePage = new ProfilePage(driver);
		loginPage.loginIntoApplication(mobileNumber, password);
	}

	@Test(enabled = false)
	public void verifyHomePage() {
		logger.info("verification of all features of home page is started...");
		homePage.verifyHeaderOfHome();
		homePage.verifyMyLibrary();
		homePage.verifyRecentViewedBooks();
		homePage.verifyRecentlyActivity();
		homePage.verifyTheSmartStore("cart");
		homePage.verifyPromotionalBooks();
		homePage.verifyHelpCenterFeature(true);
		logger.info("verification of all features of home page is completed successfully.");
	}
	@Test
	public void verifyProfileFeature() {
		logger.info("verification of profile feature is started...");
		homePage.openHomeFeaturesByName(ProfileFields.PROFILE.getProfileFieldName());
		profilePage.verifyRightSideOfProfilePage();
		Map<String, String> details = profilePage.getProfileDetails();
		profilePage.verifyProfileInfoFields();
		Map<String, String> updated = profilePage.updateProfile();
		logger.info(details.entrySet());
		logger.info(updated.entrySet());
		logger.info("verification of profile feature is completed successfully.");
	}
}
