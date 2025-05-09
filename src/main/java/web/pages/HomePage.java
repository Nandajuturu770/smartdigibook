package web.pages;

import java.awt.Checkbox;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v130.profiler.model.Profile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import web.enums.ProfileFields;
import web.generic.WebElementActions;

public class HomePage extends WebElementActions {

	final static Logger logger = LogManager.getLogger(HomePage.class);
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//* elements of header navigation bar
	@FindBy(xpath = "//img[@class='header-logo']")
	private WebElement headerSmartDigiBookLogo;

	@FindBy(xpath = "//*[@id='redeem-access-button']/button")
	private WebElement headerRedeemAccessBtn;

	@FindBy(id = "contactUsLibrary")
	private WebElement contactUsBtn;

	@FindBy(id = "notification")
	private WebElement headerNotificationBtn;

	@FindBy(id = "heartIcon")
	private WebElement headerWishlistBtn;

	@FindBy(id = "cartIcon")
	private WebElement headerCartBtn;

	@FindBy(id = "userWallet")
	private WebElement headerUserWalletBtn;

	@FindBy(xpath = "//*[@id='userWallet']/img")
	private WebElement headerWalletImg;

	@FindBy(xpath = "//*[@id='userWallet']/p")
	private WebElement headerWalletAmountTxt;

	@FindBy(xpath = "//*[@class = 'arrowIconButton']")
	private WebElement headerProfileBtn;

	@FindBy(xpath = "//*[@class='arrowIconButton']/div")
	private WebElement headerProfileUserNameTxt;

	@FindBy(xpath = "//*[@id='my-profile']//img")
	private WebElement headerProfileImg;

	//* element of my library
	@FindBy(css = ".slider.animated")
	private WebElement banner;

	@FindBy(className = "myLibrary-title")
	private WebElement myLibraryTxt;

	@FindBy(name = "search")
	private WebElement searchTxtfd;

	@FindBy(className = "category-paragraph")
	private List<WebElement> categoriesTxt;

	@FindBy(className = "sub-header-title")
	private WebElement myBooksTxt;

	@FindBy(xpath = "//*[@role='progressbar']")
	private WebElement bookProgressbarImg;

	@FindBy(className = "progress-value")
	private WebElement progressValueTxt;

	@FindBy(xpath = "//*[@class='feedback-logo-div']/img")
	private WebElement feedbackImg;

	@FindBy(className = "Mybook-img")
	private WebElement bookImg;

	@FindBy(className = "Mybook-subTitle")
	private WebElement bookNameTxt;

	@FindBy(className = "my-book-premium-label")
	private WebElement premiumLabelSec;

	@FindBy(xpath = "//*[@class='my-book-premium-label']/img")
	private WebElement premiumLabelImg;

	@FindBy(xpath = "//*[@class='my-book-premium-label']/span")
	private WebElement premiumLabel;

	//* Recently Viewed Books
	@FindBy(xpath = "//*[text()='Recently Viewed']")
	private WebElement recentlyViewedTitleTxt;

	@FindBy(xpath = "//*[text()='Recently Viewed']/..//span")
	private WebElement recentlyviewedFeedbackImg;

	@FindBy(xpath = "//*[text()='Recently Viewed']/..//img[@class='horizontalScrollBar-img']")
	private WebElement recentlyViewedBookImg;

	@FindBy(xpath = "//*[text()='Recently Viewed']/..//*[@class='horizontalscroller-subTitle']")
	private WebElement recentlyViewedBookNameTxt;

	//* Recently Activities
	@FindBy(id = "recentActivities")
	private WebElement recentActivitiesTitleTxt;

	@FindBy(xpath = "//*[@id = 'recentActivities']/following-sibling::div")
	private WebElement recentActivitiesViewAllLnk;

	@FindBy(xpath = "//*[@class='annotation-title']/preceding-sibling::*")
	private WebElement activityImg;

	@FindBy(xpath = "//*[@class='annotation-title']")
	private WebElement activityBookNameTxt;

	@FindBy(xpath = "//img[@class='bookCoverImg']")
	private WebElement activityBookCoverImg;

	@FindBy(xpath = "//*[@class='convertType-recentActivities']")
	private WebElement activityNameTXt;

	@FindBy(xpath = "//*[@class='annotations-card-footer']/div/span")
	private WebElement activityPageNumberTxt;

	@FindBy(xpath = "//*[contains(@class,'justify-center')]")
	private WebElement activityNavigationBtn;

	//* The Smart Store
	@FindBy(xpath = "//h2[contains(text(),'SMART')]")
	private WebElement TheSmartStoreTitleTxt;

	@FindBy(xpath = "//a[contains(@href ,  '/smart-store')]")
	private WebElement TheSmartStoreViewAllLnk;

	@FindBy(xpath = "//*[contains(text(),'SMART')]/..//img[@class='horizontalScrollBar-img']")
	private WebElement TssBookCoverImg;

	@FindBy(xpath = "//*[contains(text(),'SMART')]/..//*[@class='horizontalscroller-subTitle']")
	private WebElement TssBookNameTxt;

	@FindBy(xpath = "//*[contains(text(),'SMART')]/..//*[@class='book-current-price']")
	private WebElement TssBookPriceTxt;

	@FindBy(xpath = "//*[@class='book-wishlist-icon']//*[@xmlns='http://www.w3.org/2000/svg']")
	private WebElement TssBookHeartBtn;

	@FindBy(xpath = "//*[contains(text(),'SMART')]/..//*[@class='premium-label']/img")
	private WebElement TssBookPremiumImg;

	@FindBy(xpath = "//*[@class='book-add-to-cart-button']")
	private WebElement addToCartOrGoToCartBtn;

	//* Promotional Books
	@FindBy(xpath = "//*[contains(text(), 'Promotional')]")
	private WebElement thePromotionalTitleTxt;

	@FindBy(xpath = "//*[contains(text(), 'Promotional')]/..//*[@class='image-wrapper']")
	private WebElement promotionalBookCoverImg;

	@FindBy(xpath = "//*[contains(text(), 'Promotional')]/..//*[@class='horizontalscroller-subTitle']")
	private WebElement promotionalBookNameTxt;

	//* Help Center Feature
	@FindBy(xpath = "//*[@alt='Scroll to Top']")
	private WebElement scrollToTopImg;

	@FindBy(xpath = "//*[@class ='react-draggable']/img")
	private WebElement helpCentreBtn;

	@FindBy(xpath = "//*[@class ='needHelp_label']")
	private WebElement needHelpTxt;

	@FindBy(xpath = "//*[@alt ='help_center_close']")
	private WebElement needHelpCloseBtn;

	@FindBy(xpath = "//*[@alt ='help_center_contact_us']")
	private WebElement contactUsImg;

	@FindBy(xpath = "//*[@alt ='help_center_contact_us']/following-sibling::p")
	private WebElement contactUsTxt;

	@FindBy(xpath = "//*[@alt ='help_center_whatsapp']")
	private WebElement whatsAppImg;

	@FindBy(xpath = "//*[@alt ='help_center_whatsapp']/following-sibling::p")
	private WebElement whatsAppTxt;

	@FindBy(xpath = "//*[@alt ='help_center_faqs']")
	private WebElement faqImg;

	@FindBy(xpath = "//*[@alt ='help_center_faqs']/following-sibling::p")
	private WebElement faqTxt;

	@FindBy(xpath = "//*[@alt ='help_center_app_tour']")
	private WebElement appTourImg;

	@FindBy(xpath = "//*[@alt ='help_center_app_tour']/following-sibling::p")
	private WebElement appTourTxt;

	@FindBy(xpath = "//*[text()='Profile']")
	private WebElement profileBtn;

	@FindBy(xpath = "//*[text()='My Orders']")
	private WebElement myOrdersBtn;

	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logoutBtn;

	/* Getter Methods */
	public static Logger getLogger() {
		return logger;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHeaderSmartDigiBookLogo() {
		return headerSmartDigiBookLogo;
	}

	public WebElement getHeaderRedeemAccessBtn() {
		return headerRedeemAccessBtn;
	}

	public WebElement getContactUsBtn() {
		return contactUsBtn;
	}

	public WebElement getHeaderNotificationBtn() {
		return headerNotificationBtn;
	}

	public WebElement getHeaderWishlistBtn() {
		return headerWishlistBtn;
	}

	public WebElement getHeaderCartBtn() {
		return headerCartBtn;
	}

	public WebElement getHeaderUserWalletBtn() {
		return headerUserWalletBtn;
	}

	public WebElement getHeaderWalletImg() {
		return headerWalletImg;
	}

	public WebElement getHeaderWalletAmountTxt() {
		return headerWalletAmountTxt;
	}

	public WebElement getHeaderProfileBtn() {
		return headerProfileBtn;
	}

	public WebElement getHeaderProfileUserNameTxt() {
		return headerProfileUserNameTxt;
	}

	public WebElement getHeaderProfileImg() {
		return headerProfileImg;
	}

	public WebElement getBanner() {
		return banner;
	}

	public WebElement getMyLibraryTxt() {
		return myLibraryTxt;
	}

	public WebElement getSearchTxtfd() {
		return searchTxtfd;
	}

	public List<WebElement> getCategoriesTxt() {
		return categoriesTxt;
	}

	public WebElement getMyBooksTxt() {
		return myBooksTxt;
	}

	public WebElement getBookProgressbarImg() {
		return bookProgressbarImg;
	}

	public WebElement getProgressValueTxt() {
		return progressValueTxt;
	}

	public WebElement getFeedbackImg() {
		return feedbackImg;
	}

	public WebElement getBookImg() {
		return bookImg;
	}

	public WebElement getBookNameTxt() {
		return bookNameTxt;
	}

	public WebElement getPremiumLabelSec() {
		return premiumLabelSec;
	}

	public WebElement getPremiumLabelImg() {
		return premiumLabelImg;
	}

	public WebElement getPremiumLabel() {
		return premiumLabel;
	}

	public WebElement getRecentlyViewedTitleTxt() {
		return recentlyViewedTitleTxt;
	}

	public WebElement getRecentlyViewedFeedbackImg() {
		return recentlyviewedFeedbackImg;
	}

	public WebElement getRecentlyViewedBookImg() {
		return recentlyViewedBookImg;
	}

	public WebElement getRecentlyViewedBookNameTxt() {
		return recentlyViewedBookNameTxt;
	}

	public WebElement getRecentActivitiesTitleTxt() {
		return recentActivitiesTitleTxt;
	}
	public WebElement getRecentActivitiesViewAllLnk() {
		return recentActivitiesViewAllLnk;
	}
	public WebElement getActivityImg() {
		return activityImg;
	}

	public WebElement getActivityBookNameTxt() {
		return activityBookNameTxt;
	}

	public WebElement getActivityBookCoverImg() {
		return activityBookCoverImg;
	}

	public WebElement getActivityNameTXt() {
		return activityNameTXt;
	}

	public WebElement getActivityPageNumberTxt() {
		return activityPageNumberTxt;
	}

	public WebElement getActivityNavigationBtn() {
		return activityNavigationBtn;
	}

	public WebElement getTheSmartStoreTitleTxt() {
		return TheSmartStoreTitleTxt;
	}

	public WebElement getTheSmartStoreViewAllLnk() {
		return TheSmartStoreViewAllLnk;
	}

	public WebElement getTssBookCoverImg() {
		return TssBookCoverImg;
	}

	public WebElement getTssBookNameTxt() {
		return TssBookNameTxt;
	}

	public WebElement getTssBookPriceTxt() {
		return TssBookPriceTxt;
	}

	public WebElement getTssBookHeartBtn() {
		return TssBookHeartBtn;
	}

	public WebElement getTssBookPremiumImg() {
		return TssBookPremiumImg;
	}

	public WebElement getAddToCartOrGoToCartBtn() {
		return addToCartOrGoToCartBtn;
	}

	public WebElement getThePromotionalTitleTxt() {
		return thePromotionalTitleTxt;
	}

	public WebElement getPromotionalBookCoverImg() {
		return promotionalBookCoverImg;
	}

	public WebElement getPromotionalBookNameTxt() {
		return promotionalBookNameTxt;
	}

	public WebElement getScrollToTopImg() {
		return scrollToTopImg;
	}

	public WebElement getHelpCentreBtn() {
		return helpCentreBtn;
	}

	public WebElement getNeedHelpTxt() {
		return needHelpTxt;
	}

	public WebElement getNeedHelpCloseBtn() {
		return needHelpCloseBtn;
	}

	public WebElement getContactUsImg() {
		return contactUsImg;
	}

	public WebElement getContactUsTxt() {
		return contactUsTxt;
	}

	public WebElement getWhatsAppImg() {
		return whatsAppImg;
	}

	public WebElement getWhatsAppTxt() {
		return whatsAppTxt;
	}

	public WebElement getFaqImg() {
		return faqImg;
	}

	public WebElement getFaqTxt() {
		return faqTxt;
	}

	public WebElement getAppTourImg() {
		return appTourImg;
	}

	public WebElement getAppTourTxt() {
		return appTourTxt;
	}	

	public WebElement getRecentlyviewedFeedbackImg() {
		return recentlyviewedFeedbackImg;
	}

	public WebElement getProfileBtn() {
		return profileBtn;
	}

	public WebElement getMyOrdersBtn() {
		return myOrdersBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	/**
	 * @description this method is used to verify header of home
	 */
	public void verifyHeaderOfHome() {
		logger.info("verification of header of home is started...");
		elementIsDisplayed(getHeaderSmartDigiBookLogo(), "HeaderSmartDigiBookLogo");
		elementIsDisplayed(getHeaderRedeemAccessBtn(), "HeaderRedeemAccessBtn");
		elementIsDisplayed(getContactUsBtn(), "ContactUsBtn");
		elementIsDisplayed(getHeaderNotificationBtn(), "HeaderNotificationBtn");
		elementIsDisplayed(getHeaderWishlistBtn(), "HeaderWishlistBtn");
		elementIsDisplayed(getHeaderCartBtn(), "HeaderCartBtn");
		elementIsDisplayed(getHeaderUserWalletBtn(), "HeaderUserWalletBtn");
		elementIsDisplayed(getHeaderWalletImg(), "HeaderWalletImg");
		elementIsDisplayed(getHeaderWalletAmountTxt(), "HeaderWalletAmountTxt");
		elementIsDisplayed(getHeaderProfileBtn(), "HeaderProfileBtn");
		elementIsDisplayed(getHeaderProfileUserNameTxt(), "HeaderProfileUserNameTxt");
		elementIsDisplayed(getHeaderProfileImg(), "HeaderProfileImg");
		logger.info("verification of header of home is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify my library and my books
	 * sections.
	 */
	public void verifyMyLibrary() {
		logger.info("verification of my library and my books section is started...");
		scrollToElementByActions(getBookNameTxt(), "BookNameTxt");
		elementIsDisplayed(getBanner(), "Banner");
		elementIsDisplayed(getMyLibraryTxt(), "LibraryTxt");
		elementIsDisplayed(getSearchTxtfd(), "SearchTxtfd");
		List<WebElement> categories = getCategoriesTxt();
		for (WebElement element : categories) {
			elementIsDisplayed(element, element.getText());
		}
		elementIsDisplayed(getMyBooksTxt(), "MyBooksTxt");
		String bookName = getTextFromElement(getBookNameTxt(), "getBookNameTxt");
		logger.info("My Books Section First Book Name is :: " + bookName);
		elementIsDisplayed(getBookProgressbarImg(), "BookProgressbarImg");
		elementIsDisplayed(getFeedbackImg(), "FeedbackImg");
		elementIsDisplayed(getBookImg(), "BookImg");
		elementIsDisplayed(getBookNameTxt(), "BookNameTxt");
		elementIsDisplayed(getPremiumLabelSec(), "PremiumLabelSec");
		elementIsDisplayed(getPremiumLabelImg(), "PremiumLabelImg");
		elementIsDisplayed(getPremiumLabel(), "PremiumLabel");
		logger.info("verification of my library and my books section is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify recent viewed books
	 */
	public void verifyRecentViewedBooks() {
		logger.info("verification of recent viewed books is started...");
		scrollToElementByActions(getRecentlyViewedTitleTxt(),"RecentlyViewedTitleTxt");
		elementIsDisplayed(getRecentlyViewedTitleTxt(), "RecentlyViewedTitleTxt");
		elementIsDisplayed(getRecentlyViewedFeedbackImg(), "RecentlyViewedFeedbackImg");
		elementIsDisplayed(getRecentlyViewedBookImg(), "RecentlyViewedBookImg");
		elementIsDisplayed(getRecentlyViewedBookNameTxt(), "RecentlyViewedBookNameTxt");
		String bookName = getTextFromElement(getRecentlyViewedBookNameTxt(), "RecentlyViewedBookNameTxt");
		logger.info("recent viewed book name is :: " + bookName);
		logger.info("verification of recent viewed books is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify recently activity.
	 */
	public void verifyRecentlyActivity() {
		logger.info("verification of recently activity is started...");
		scrollToElementByActions(getRecentActivitiesTitleTxt(),"RecentActivitiesTitleTxt");
		elementIsDisplayed(getActivityImg(), "ActivityImg");
		elementIsDisplayed(getActivityBookNameTxt(), "ActivityBookNameTxt");
		String bookName = getTextFromElement(getActivityBookNameTxt(), "ActivityBookNameTxt");
		logger.info("recently activity book name is :: " + bookName);
		elementIsDisplayed(getActivityBookCoverImg(), "ActivityBookCoverImg");
		elementIsDisplayed(getActivityNameTXt(), "ActivityNameTXt");
		String activityName = getTextFromElement(getActivityNameTXt(), "ActivityNameTXt");
		logger.info("recently activity name is :: " + activityName);
		elementIsDisplayed(getActivityPageNumberTxt(), "ActivityPageNumberTxt");
		elementIsDisplayed(getActivityNavigationBtn(), "ActivityNavigationBtn");
		logger.info("verification of recently activity is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify the smart store.
	 * @param cartOrWish <code>String</code>
	 */
	public void verifyTheSmartStore(String cartOrWish) {
		logger.info("verification of the smart store is started...");
		scrollToElementByActions(getTheSmartStoreTitleTxt(), "TheSmartStoreTitleTxt");
		elementIsDisplayed(getTheSmartStoreTitleTxt(), "TheSmartStoreTitleTxt");
		elementIsDisplayed(getTheSmartStoreViewAllLnk(), "TheSmartStoreViewAllLnk");
		elementIsDisplayed(getTssBookCoverImg(), "TssBookCoverImg");
		elementIsDisplayed(getTssBookNameTxt(), "TssBookNameTxt");
		String bookName = getTextFromElement(getTssBookNameTxt(), "TssBookNameTxt");
		logger.info("tss book name is :: " + bookName);
		elementIsDisplayed(getTssBookPriceTxt(), "TssBookPriceTxt");
		String bookPrice = getTextFromElement(getTssBookPriceTxt(), "TssBookPriceTxt");
		logger.info("tss book price is :: " + bookPrice);
		elementIsDisplayed(getTssBookHeartBtn(), "TssBookHeartBtn");
		scrollToElementByActions(getAddToCartOrGoToCartBtn(), "AddToCartOrGoToCartBtn");
		click(getTssBookHeartBtn(), "TssBookHeartBtn");
		elementIsDisplayed(getTssBookPremiumImg(), "TssBookPremiumImg");
		elementIsDisplayed(getAddToCartOrGoToCartBtn(), "AddToCartOrGoToCartBtn");
		logger.info("verification of the smart store is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify promotional books
	 */
	public void verifyPromotionalBooks() {
		logger.info("verification of promotional books is started...");
		scrollToElementByActions(getPromotionalBookNameTxt(), "PromotionalBookNameTxt");
		elementIsDisplayed(getThePromotionalTitleTxt(), "ThePromotionalTitleTxt");
		elementIsDisplayed(getPromotionalBookCoverImg(), "PromotionalBookCoverImg");
		elementIsDisplayed(getPromotionalBookNameTxt(), "PromotionalBookNameTxt");
		String bookName = getTextFromElement(getPromotionalBookNameTxt(), "PromotionalBookNameTxt");
		logger.info("promotional book name is :: " + bookName);
		logger.info("verification of promotional books is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify the help center icon.
	 * @param close <code>boolean</code> if true the pop up is closed otherwise
	 * false.
	 */
	public void verifyHelpCenterFeature(boolean close) {
		logger.info("verification of help center feature is started...");
		waitTillElementIsDisplayedWithinTime(getHelpCentreBtn(), "HelpCentreBtn", 3);
		elementIsDisplayed(getHelpCentreBtn(), "HelpCentreBtn");
		waitTillElementClickable(getHelpCentreBtn(),"HelpCentreBtn");
		clickByActions(getHelpCentreBtn(), "getHelpCentreBtn");
		if(!checkIfElementIsDisplayed(getNeedHelpTxt(), "NeedHelpTxt"))
			clickByActions(getHelpCentreBtn(), "getHelpCentreBtn");
		elementIsDisplayed(getNeedHelpTxt(), "NeedHelpTxt");
		elementIsDisplayed(getNeedHelpCloseBtn(), "NeedHelpCloseBtn");
		elementIsDisplayed(getContactUsImg(), "ContactUsImg");
		elementIsDisplayed(getContactUsTxt(), "ContactUsTxt");
		elementIsDisplayed(getWhatsAppImg(), "WhatsAppImg");
		elementIsDisplayed(getWhatsAppTxt(), "WhatsAppTxt");
		elementIsDisplayed(getFaqImg(), "FaqImg");
		elementIsDisplayed(getFaqTxt(), "FaqTxt");
		elementIsDisplayed(getAppTourImg(), "AppTourImg");
		elementIsDisplayed(getAppTourTxt(), "AppTourTxt");
		if (close) {
			click(getNeedHelpCloseBtn(), "NeedHelpCloseBtn");
		}
		logger.info("verification of help center feature is completed successfully.\n");
	}

	/**
	 * @description this method is used to open the sub feature of the home page.
	 */
	public void openHomeFeaturesByName(String featureName) {
		logger.info("system is trying to open \' "+featureName+" \' of the home..." );
		if (ProfileFields.HOME.getProfileFieldName().equals(featureName))
			click(getHeaderSmartDigiBookLogo(), "HeaderSmartDigiBookLogo");
		else if (ProfileFields.REDEEM_ACCESS_CODE.getProfileFieldName().equals(featureName))
			click(getHeaderRedeemAccessBtn(), "HeaderRedeemAccessBtn");
		else if (ProfileFields.CONTACT_US.getProfileFieldName().equals(featureName))
			click(getContactUsBtn(), "ContactUsBtn");
		else if (ProfileFields.NOTIFICATION_SETTINGS.getProfileFieldName().equals(featureName))
			click(getHeaderNotificationBtn(), "HeaderNotificationBtn");
		else if (ProfileFields.MY_WISHLIST.getProfileFieldName().equals(featureName))
			click(getHeaderWishlistBtn(), "HeaderWishlistBtn");
		else if (ProfileFields.MY_CART.getProfileFieldName().equals(featureName))
			click(getHeaderCartBtn(), "HeaderCartBtn");
		else if (ProfileFields.MY_WALLET.getProfileFieldName().equals(featureName))
			click(getHeaderUserWalletBtn(), "HeaderUserWalletBtn");
		else 
			logger.info(featureName+" is not in home page and stared to search in profile");
		waitTillElementClickable(getHeaderProfileUserNameTxt(), "HeaderProfileUserNameTxt");
		clickByJavaScript(getHeaderProfileUserNameTxt(), "HeaderProfileUserNameTxt");
		waitTillElementIsDisplayedWithinTime(getProfileBtn(), "ProfileButton", 3);
		if (ProfileFields.PROFILE.getProfileFieldName().equals(featureName)) 
			clickByJavaScript(getProfileBtn(), "ProfileBtn");
		else if (ProfileFields.MY_ORDERS.getProfileFieldName().equals(featureName)) 
			clickByJavaScript(getMyOrdersBtn(), "MyOrders");
		else if (ProfileFields.LOGOUT.getProfileFieldName().equals(featureName)) 
			clickByJavaScript(TheSmartStoreTitleTxt, featureName);
		else {
			clickByJavaScript(getHeaderProfileBtn(), "HeaderProfileBtn");
			Assert.fail("the given feature :: "+ featureName + "is matched with home features.");
		}
		if(!checkIfElementIsDisplayed(getProfileBtn(), "ProfileBtn"))
			waitTillElementClickable(getHeaderProfileUserNameTxt(), "HeaderProfileUserNameTxt");	
		logger.info("system opened \' "+featureName+" \' of the home succussfully." );
	}
}
