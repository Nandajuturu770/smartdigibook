package web.pages;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheSmartStore {

	final static Logger logger = LogManager.getLogger(TheSmartStore.class);
	WebDriver driver;

	public TheSmartStore(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//* Element of Header and search
	@FindBy(xpath = "//*[@href='/private/library']")
	private WebElement homeLnk;

	@FindBy(xpath = "//*[contains(text(),'SMART')]")
	private WebElement theSmartStoreTitleTxt;

	@FindBy(xpath = "//*[contains(text(),'SMART')]/child::span")
	private WebElement booksCountTxt;

	@FindBy(name  = "search")
	private WebElement searchTxtfd;

	@FindBy(xpath = "//*[@data-testid='ClearIcon']")
	private WebElement searchClearIcon;
	
    //* No Data Found Page
	@FindBy(xpath = "//*[@alt='noDataFound']")
	private WebElement noDataFoundImg;

	@FindBy(xpath = "//*[contains(text(),'No books')]")
	private WebElement noBooksFoundTxt;

	@FindBy(xpath = "//*[contains(text(),'matches your')]")
	private WebElement weCouldNotFoundTxt;

	@FindBy(xpath  = "//*[@xmlns='http://www.w3.org/2000/svg']")
	private List<WebElement> gradeAndSubjectFiltersImg;

	@FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']/following-sibling::*[text()='Grade']")
	private WebElement gradeFilterTxt;
	
	@FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']/following-sibling::*[text()='Subject']")
	private WebElement subjectFilterTxt;

	@FindBy(xpath = "//*[@role='option']/child::div")
	private WebElement filterOpts;

	@FindBy(className = "smartStoreCard-img")
	private WebElement bookCoverImg;

	//* Book Details
	@FindBy(className  = "smartStoreCard-header")
	private WebElement bookNameTxt;

	@FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[@alt='Red Heart Icon']")
	private WebElement wishlistedBtn;
	
	@FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[@alt=\"Red Heart Icon\"]")
	private WebElement notWishlistedBtn;

	@FindBy(className = "smartStoreCard-description")
	private WebElement bookDescTxt;

	@FindBy(className = "smartStoreCardRating-box")
	private WebElement bookRatingSec;

	@FindBy(className  = "smartStore-averageReview")
	private WebElement bookAverageRateTxt;

	@FindBy(className = "smartStore-count")
	private WebElement bookRationCountTxt;
	
	@FindBy(xpath = "//span[@class='smartStore-Grade']")
	private WebElement bookGradeTxt;

	@FindBy(xpath = "//span[@class='smartStore-GradeName']")
	private WebElement bookGradeValueTxt;

	@FindBy(xpath = "//div[@class='smartStore-Grade']")
	private WebElement bookSubjectTxt;

	@FindBy(className  = "smartStore-SubjName")
	private WebElement bookSubjectValueTxt;

	@FindBy(xpath = "(//*[@class='smartStoreCardRating-container'])[1]/following-sibling::div")
	private WebElement checkIfMoreBuyingOptionsBtn;

	@FindBy(className = "smartStore-BuyingOptions")
	private WebElement moreBuyingOptionsBtn;

	@FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]//*[@class='cart-Item-premium-label']")
	private WebElement checkPremiumLabel;

	@FindBy(xpath = "//*[@class='cart-Item-premium-label']/img")
	private WebElement premiumIconImg;

	@FindBy(xpath  = "//*[@class='cart-Item-premium-label']/span")
	private WebElement premiumTxt;

	@FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]//*[@class='cart-Item-basic-label']")
	private WebElement checkBasicLabel;

	@FindBy(className = "cart-Item-basic-label")
	private WebElement basicTxt;

	@FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]/child::button")
	private WebElement checkFirstBookBtn;

	@FindBy(xpath = "//*[text()='Add to Cart']")
	private WebElement addToCartBtn;

	@FindBy(xpath  = "//*[text()='Go to Cart']")
	private WebElement goToCartBtn;

	@FindBy(xpath = "//*[text()='Upgrade']")
	private WebElement upgradeBtn;
	
	@FindBy(xpath = "//*[@aria-label='Go to previous page']")
	private WebElement previousPageBtn;

	@FindBy(xpath = "//*[@data-testid='NavigateNextIcon']")
	private WebElement nextPageBtn;

	//* More Buying Options Popup
	 @FindBy(className = "moreBuyingSect")
   private WebElement moreBuyingOptionsPopupSec;
   
   @FindBy(className = "removeBookTitle")
   private WebElement selectBuyingOptionTitleTxt;
   
   @FindBy(xpath  = "//*[@data-testid='CloseIcon']")
   private WebElement moreBuyingPopupCloseBtn;

   @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/preceding-sibling::div")
   private WebElement moreBuyintPremiumCkbx;
   
   @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']")
   private WebElement moreByingPremiumTxt;

   @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/img")
   private WebElement moreBuyingPremiumIcon;
   
   @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/ancestor::div[@class='left-container']/following-sibling::div//span")
   private WebElement moreBuyingPremiumAmountTxt;

}
