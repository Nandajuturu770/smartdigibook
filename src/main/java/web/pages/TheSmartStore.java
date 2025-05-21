package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class TheSmartStore extends WebElementActions {

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

    @FindBy(name = "search")
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

    @FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']")
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
    @FindBy(className = "smartStoreCard-header")
    private WebElement bookNameTxt;

    @FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[@alt='Red Heart Icon']")
    private WebElement wishlistedBtn;

    @FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[@alt=\"Red Heart Icon\"]")
    private WebElement notWishlistedBtn;

    @FindBy(className = "smartStoreCard-description")
    private WebElement bookDescTxt;

    @FindBy(className = "smartStoreCardRating-box")
    private WebElement bookRatingSec;

    @FindBy(className = "smartStore-averageReview")
    private WebElement bookAverageRateTxt;

    @FindBy(className = "smartStore-count")
    private WebElement bookRationCountTxt;

    @FindBy(xpath = "//span[@class='smartStore-Grade']")
    private WebElement bookGradeTxt;

    @FindBy(xpath = "//span[@class='smartStore-GradeName']")
    private WebElement bookGradeValueTxt;

    @FindBy(xpath = "//div[@class='smartStore-Grade']")
    private WebElement bookSubjectTxt;

    @FindBy(className = "smartStore-SubjName")
    private WebElement bookSubjectValueTxt;

    @FindBy(xpath = "(//*[@class='smartStoreCardRating-container'])[1]/following-sibling::div")
    private WebElement checkIfMoreBuyingOptionsBtn;

    @FindBy(className = "smartStore-BuyingOptions")
    private WebElement moreBuyingOptionsBtn;

    @FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]//*[@class='cart-Item-premium-label']")
    private WebElement checkPremiumLabel;

    @FindBy(xpath = "//*[@class='cart-Item-premium-label']/img")
    private WebElement premiumIconImg;

    @FindBy(xpath = "//*[@class='cart-Item-premium-label']/span")
    private WebElement premiumTxt;

    @FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]//*[@class='cart-Item-basic-label']")
    private WebElement checkBasicLabel;

    @FindBy(className = "cart-Item-basic-label")
    private WebElement basicTxt;

    @FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]/child::button")
    private WebElement checkFirstBookBtn;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//*[text()='Go to Cart']")
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

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement moreBuyingPopupCloseBtn;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/preceding-sibling::div")
    private WebElement moreBuyingPremiumCkbx;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']")
    private WebElement moreBuyingPremiumTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/img")
    private WebElement moreBuyingPremiumIcon;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/ancestor::div[@class='left-container']/following-sibling::div//span")
    private WebElement moreBuyingPremiumAmountTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/ancestor::div[@id]/../descendant::div[@class='buying-option-text']")
    private WebElement moreBuyingPremiumDescTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/ancestor::div[@id]/../descendant::div[@class='icon-main']")
    private WebElement moreBuyingPremiumResourceSec;

	@FindBy(xpath = "//*[@class = 'buying-option-header']/preceding-sibling::div")
    private WebElement moreBuyingBasicCkbx;

    @FindBy(xpath = "//*[@class = 'buying-option-header']")
    private WebElement moreBuyingBasicTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/img")
    private WebElement moreBuyingBasicIcon;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/ancestor::div[@class='left-container']/following-sibling::div//span")
    private WebElement moreBuyingBasicAmountTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/ancestor::div[@id]/../descendant::div[@class='buying-option-text']")
    private WebElement moreBuyingBasicDescTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/ancestor::div[@id]/../descendant::div[@class='icon-main']")
    private WebElement moreBuyingBasicResourceSec;

    @FindBy(xpath = "//*[@class='moreBuying-btnBlock']/button")
    private WebElement moreBuyingAddToCartBtn;

	//* Upgrade Popup
    @FindBy(xpath = "//*[contains(text(),'Resource')]")
    private WebElement upgradePopupTitleTxt;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement upgradePopupCloseBtn;

    @FindBy(xpath = "//*[@class='u8wr32go6iI6CiMtFrK4']/img")
    private WebElement upgradePopupImg;

    @FindBy(xpath = "//*[contains(text(),'your learning with Premium DigiBook')]")
    private WebElement upgradePopupDescTxt;

    @FindBy(className = "text-[#00AAD3] font-bold")
    private WebElement upgradePopupAmountTxt;

    @FindBy(xpath = "//*[contains(text(),'with the expiry of this DigiBook')]")
    private WebElement upgradeExpireTxt;

    @FindBy(xpath = "//*[text()='Upgrade to Premium DigiBook']")
    private WebElement upgradeToPremiumBtn;

	//* Getter Methods */
    public WebElement getHomeLnk() {
        return homeLnk;
    }

    public WebElement getTheSmartStoreTitleTxt() {
        return theSmartStoreTitleTxt;
    }

    public WebElement getBooksCountTxt() {
        return booksCountTxt;
    }

    public WebElement getSearchTxtfd() {
        return searchTxtfd;
    }

    public WebElement getSearchClearIcon() {
        return searchClearIcon;
    }

    public WebElement getNoDataFoundImg() {
        return noDataFoundImg;
    }

    public WebElement getNoBooksFoundTxt() {
        return noBooksFoundTxt;
    }

    public WebElement getWeCouldNotFoundTxt() {
        return weCouldNotFoundTxt;
    }

    public List<WebElement> getGradeAndSubjectFiltersImg() {
        return gradeAndSubjectFiltersImg;
    }

    public WebElement getGradeFilterTxt() {
        return gradeFilterTxt;
    }

    public WebElement getSubjectFilterTxt() {
        return subjectFilterTxt;
    }

    public WebElement getFilterOpts() {
        return filterOpts;
    }

    public WebElement getBookCoverImg() {
        return bookCoverImg;
    }

    public WebElement getBookNameTxt() {
        return bookNameTxt;
    }

    public WebElement getWishlistedBtn() {
        return wishlistedBtn;
    }

    public WebElement getNotWishlistedBtn() {
        return notWishlistedBtn;
    }

    public WebElement getBookDescTxt() {
        return bookDescTxt;
    }

    public WebElement getBookRatingSec() {
        return bookRatingSec;
    }

    public WebElement getBookAverageRateTxt() {
        return bookAverageRateTxt;
    }

    public WebElement getBookRationCountTxt() {
        return bookRationCountTxt;
    }

    public WebElement getBookGradeTxt() {
        return bookGradeTxt;
    }

    public WebElement getBookGradeValueTxt() {
        return bookGradeValueTxt;
    }

    public WebElement getBookSubjectTxt() {
        return bookSubjectTxt;
    }

    public WebElement getBookSubjectValueTxt() {
        return bookSubjectValueTxt;
    }

    public WebElement getCheckIfMoreBuyingOptionsBtn() {
        return checkIfMoreBuyingOptionsBtn;
    }

    public WebElement getMoreBuyingOptionsBtn() {
        return moreBuyingOptionsBtn;
    }

    public WebElement getCheckPremiumLabel() {
        return checkPremiumLabel;
    }

    public WebElement getPremiumIconImg() {
        return premiumIconImg;
    }

    public WebElement getPremiumTxt() {
        return premiumTxt;
    }

    public WebElement getCheckBasicLabel() {
        return checkBasicLabel;
    }

    public WebElement getBasicTxt() {
        return basicTxt;
    }

    public WebElement getCheckFirstBookBtn() {
        return checkFirstBookBtn;
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    public WebElement getGoToCartBtn() {
        return goToCartBtn;
    }

    public WebElement getUpgradeBtn() {
        return upgradeBtn;
    }

    public WebElement getPreviousPageBtn() {
        return previousPageBtn;
    }

    public WebElement getNextPageBtn() {
        return nextPageBtn;
    }

    public WebElement getMoreBuyingOptionsPopupSec() {
        return moreBuyingOptionsPopupSec;
    }

    public WebElement getSelectBuyingOptionTitleTxt() {
        return selectBuyingOptionTitleTxt;
    }

    public WebElement getMoreBuyingPopupCloseBtn() {
        return moreBuyingPopupCloseBtn;
    }

    public WebElement getMoreBuyingPremiumCkbx() {
        return moreBuyingPremiumCkbx;
    }

    public WebElement getMoreBuyingPremiumTxt() {
        return moreBuyingPremiumTxt;
    }

    public WebElement getMoreBuyingPremiumIcon() {
        return moreBuyingPremiumIcon;
    }

    public WebElement getMoreBuyingPremiumAmountTxt() {
        return moreBuyingPremiumAmountTxt;
    }

    public WebElement getMoreBuyingPremiumDescTxt() {
        return moreBuyingPremiumDescTxt;
    }

    public WebElement getMoreBuyingPremiumResourceSec() {
        return moreBuyingPremiumResourceSec;
    }

    public WebElement getMoreBuyingBasicCkbx() {
        return moreBuyingBasicCkbx;
    }

    public WebElement getMoreBuyingBasicTxt() {
        return moreBuyingBasicTxt;
    }

    public WebElement getMoreBuyingBasicIcon() {
        return moreBuyingBasicIcon;
    }

    public WebElement getMoreBuyingBasicAmountTxt() {
        return moreBuyingBasicAmountTxt;
    }

    public WebElement getMoreBuyingBasicDescTxt() {
        return moreBuyingBasicDescTxt;
    }

    public WebElement getMoreBuyingBasicResourceSec() {
        return moreBuyingBasicResourceSec;
    }

    public WebElement getMoreBuyingAddToCartBtn() {
        return moreBuyingAddToCartBtn;
    }

    public WebElement getUpgradePopupTitleTxt() {
        return upgradePopupTitleTxt;
    }

    public WebElement getUpgradePopupCloseBtn() {
        return upgradePopupCloseBtn;
    }

    public WebElement getUpgradePopupImg() {
        return upgradePopupImg;
    }

    public WebElement getUpgradePopupDescTxt() {
        return upgradePopupDescTxt;
    }

    public WebElement getUpgradePopupAmountTxt() {
        return upgradePopupAmountTxt;
    }

    public WebElement getUpgradeExpireTxt() {
        return upgradeExpireTxt;
    }

    public WebElement getUpgradeToPremiumBtn() {
        return upgradeToPremiumBtn;
    }

}
