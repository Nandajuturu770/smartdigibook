package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	final static Logger logger = LogManager.getLogger(HomePage.class);
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//* elements of header navigation bar
	@FindBy(className = "header-logo")
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

	@FindBy(className = "arrowIconButton")
	private WebElement headerProfileBtn;

	@FindBy(xpath = "//*[@class='arrowIconButton']/div")
	private WebElement headerProfileUserNameTxt;

	@FindBy(xpath = "//*[@id='my-profile']//img")
	private WebElement headerProfileImg;

	//* element of my library
	@FindBy(className = "slider animated")
	private WebElement banner;

	@FindBy(className = "myLibrary-title")
	private WebElement myLibraryTxt;

	@FindBy(name = "search")
	private WebElement searchTxtfd;

	@FindBy(className = "category-paragraph")
	private List<WebElement> categotiesTxt;

	@FindBy(className = "sub-header-title")
	private WebElement myBooksTxt;

	@FindBy(xpath = "//*[@role='progressbar']")
	private WebElement bookProgressbarImg;

	@FindBy(className= "progress-value")
	private WebElement progressValueTxt;

	@FindBy(xpath= "//*[@class='feedback-logo-div']/img")
	private WebElement feedbackImg;

	@FindBy(className = "Mybook-img")
	private WebElement bookImg;

	@FindBy(className = "Mybook-subTitle")
	private WebElement bookNameTxt;

	@FindBy(className = "my-book-premium-label")
	private WebElement premiumLabelSec;

	@FindBy(xpath = "//*[@class='my-book-premium-label']/img")
	private WebElement premiunLabelImg;

	@FindBy(xpath = "//*[@class='my-book-premium-label']/span")
	private WebElement premiumLabel;
	
	//* Recently Viewed Books
	@FindBy(xpath = "//*[text()='Recently Viewed']")
	private WebElement recentlyViewedTitleTxt;

	@FindBy(xpath = "//*[text()='Recently Viewed']/..//span")
	private WebElement recentlyViewdFeedbackImg;

	@FindBy(xpath = "//*[text()='Recently Viewed']/..//img[@class='horizontalScrollBar-img']")
	private WebElement recentlyViewedBookImg;

	@FindBy(xpath = "//*[text()='Recently Viewed']/..//*[@class='horizontalscroller-subTitle']")
	private WebElement recentlyViewedBookNameTxt;

	//* Recently Activities
	@FindBy(xpath = "//*[@class='annotation-title']/preceding-sibling::*")
	private WebElement activityImg;

	@FindBy(xpath = "//*[@class='annotation-title']")
	private WebElement activityBookNameTxt;

	@FindBy(xpath = "//img[@class='bookCoverImg']")
	private WebElement activityBookCoverImg;

	@FindBy(xpath = "//*[@class='convertType-recentActivities']")
	private WebElement activityNammeTXt;

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

	public List<WebElement> getCategotiesTxt() {
		return categotiesTxt;
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

	public WebElement getPremiunLabelImg() {
		return premiunLabelImg;
	}

	public WebElement getPremiumLabel() {
		return premiumLabel;
	}

	public WebElement getRecentlyViewedTitleTxt() {
		return recentlyViewedTitleTxt;
	}

	public WebElement getRecentlyViewdFeedbackImg() {
		return recentlyViewdFeedbackImg;
	}

	public WebElement getRecentlyViewedBookImg() {
		return recentlyViewedBookImg;
	}

	public WebElement getRecentlyViewedBookNameTxt() {
		return recentlyViewedBookNameTxt;
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

	public WebElement getActivityNammeTXt() {
		return activityNammeTXt;
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
	
	
	

}
