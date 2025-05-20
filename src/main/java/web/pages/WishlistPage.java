package web.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import web.enums.BookDetails;
import web.enums.ProfileFields;
import web.generic.WebElementActions;

public class WishlistPage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(WishlistPage.class);
    WebDriver driver;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* elements of wish list empty
    @FindBy(xpath = "//*[@href='/private/library']")
    private WebElement homeLnk;

    @FindBy(xpath = "//*[text()='My Wishlist']")
    private WebElement myWishlistTitleTxt;

    @FindBy(xpath = "//*[text()='My Wishlist']/child::span")
    private WebElement myWishlistCountTxt;

    @FindBy(name = "search")
    private WebElement searchTxtfd;

    @FindBy(xpath = "//*[@alt='emptyScreen']")
    private WebElement emptyScreenImg;

    @FindBy(xpath = "//*[text()='Wishlist is empty!']")
    private WebElement emptyMainTxt;

    @FindBy(xpath = "//*[contains(text(),'Smart Store')]")
    private WebElement emptyDescTxt;

    @FindBy(xpath = "//*[contains(@class, 'css-1cx4s75')]")
    private WebElement startShoppingBtn;

    //* Book Details
    @FindBy(className = "horizontalScrollBar-bookImg")
    private WebElement bookCoverImg;

    @FindBy(className = "horizontalscroller-subTitle")
    private WebElement bookNameTxt;

    @FindBy(className = "horizontalscroller-subTitle")
    private List<WebElement> bookNamesTxt;

    @FindBy(className = "book-current-price")
    private WebElement bookPriceTxt;

    @FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']")
    private WebElement bookDeleteBtn;

    @FindBy(xpath = "(//*[@class ='wishlist-book-price-container'])[1]//*[@class='premium-label']")
    private WebElement firstBookPremium;

    @FindBy(className = "premium-label")
    private WebElement premiumSec;

    @FindBy(xpath = "//*[@class='premium-label']/child::img")
    private WebElement premiumIcon;

    @FindBy(className = "book-add-to-cart-button")
    private WebElement bookMoveToCartBtn;

    @FindBy(xpath = "//*[@alt='noDataFound']")
    private WebElement noDataFoundImg;

    @FindBy(xpath = "//*[contains(text() ,'results found')]")
    private WebElement resultFoundTxt;

    @FindBy(xpath = "//*[contains(text() , 'find any')]")
    private WebElement findAnyTxt;

    /* Getter Methods */
    public static Logger getLogger() {
        return logger;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getHomeLnk() {
        return homeLnk;
    }

    public WebElement getMyWishlistTitleTxt() {
        return myWishlistTitleTxt;
    }

    public WebElement getMyWishlistCountTxt() {
        return myWishlistCountTxt;
    }

    public WebElement getSearchTxtfd() {
        return searchTxtfd;
    }

    public WebElement getEmptyScreenImg() {
        return emptyScreenImg;
    }

    public WebElement getEmptyMainTxt() {
        return emptyMainTxt;
    }

    public WebElement getEmptyDescTxt() {
        return emptyDescTxt;
    }

    public WebElement getStartShoppingBtn() {
        return startShoppingBtn;
    }

    public WebElement getBookCoverImg() {
        return bookCoverImg;
    }

    public WebElement getBookNameTxt() {
        return bookNameTxt;
    }

    public List<WebElement> getBookNamesTxt() {
        return bookNamesTxt;
    }

    public WebElement getBookPriceTxt() {
        return bookPriceTxt;
    }

    public WebElement getBookDeleteBtn() {
        return bookDeleteBtn;
    }

    public WebElement getFirstBookPremium() {
        return firstBookPremium;
    }

    public WebElement getPremiumSec() {
        return premiumSec;
    }

    public WebElement getPremiumIcon() {
        return premiumIcon;
    }

    public WebElement getBookMoveToCartBtn() {
        return bookMoveToCartBtn;
    }

    public WebElement getNoDataFoundImg() {
        return noDataFoundImg;
    }

    public WebElement getResultFoundTxt() {
        return resultFoundTxt;
    }

    public WebElement getFindAnyTxt() {
        return findAnyTxt;
    }

    /**
     * @description this method is used to verify empty wish list.
     */
    public void verifyEmptyWishlist() {
        logger.info("verification of empty wish list is started...");
        elementIsDisplayed(getEmptyScreenImg(), "EmptyScreenImg");
        elementIsDisplayed(getEmptyMainTxt(), "EmptyMainTxt");
        elementIsDisplayed(getEmptyDescTxt(), "EmptyDescTxt");
        elementIsDisplayed(getStartShoppingBtn(), "StartShoppingBtn");
        logger.info("verification of empty wish list is completed successfully.\n");
    }

    /**
     * @description this method is used to verify search function with valid and
     * invalid.
     * @param enteredValue <code>String</code>
     */
    public void verifySearchWithValidAndInvalid(String enteredValue) {
        logger.info("verification of search with valid and invalid is started...");
        enterValue(getSearchTxtfd(), "SearchTxtfd", enteredValue);
        boolean status = waitTillElementIsDisplayedWithinTime(getBookCoverImg(), "BookCoverImg", 3);
        if (status) {
            String bookName = getTextFromElement(getBookNameTxt(), "BookNameTxt");
            if (!(bookName.contains(enteredValue))) {
                Assert.fail("search is not working");
            }
        } else {
            elementIsDisplayed(getNoDataFoundImg(), "NoDataFoundImg");
            elementIsDisplayed(getResultFoundTxt(), "ResultFoundTxt");
            elementIsDisplayed(getFindAnyTxt(), "FindAny");
        }
        clear(getSearchTxtfd(), "SearchTxtfd");
        logger.info("verification of search with valid and invalid is completed successfully.\n");
    }

    /**
     * @description this method is used to verify wish listed book and get the
     * details of the book.
     * @param deleteOrCart <code>String</code>
     * @return wishlistBookData <code>Map</code>
     */
    public Map<String, String> verifyWishlistBookAndGetData(String deleteOrCart) {
        // to store the book details
        Map<String, String> wishlistBookData = new HashMap<>();
        logger.info("verification of wishlist book and get data of the book is started...");
        elementIsDisplayed(getBookCoverImg(), "BookCoverImg");
        elementIsDisplayed(getBookNameTxt(), "BookNameTxt");
        String bookName = getTextFromElement(getBookNameTxt(), "BookNameTxt");
        wishlistBookData.put(BookDetails.BOOK_NAME.getBookDataValue(), bookName);
        elementIsDisplayed(getBookPriceTxt(), "BookPriceTxt");
        String bookPrice = getTextFromElement(getBookPriceTxt(), "BookPriceTxt");
        if (checkIfElementIsDisplayed(getFirstBookPremium(), "FirstBookPremium")) {
            wishlistBookData.put(BookDetails.PREMIUM_EDITION.getBookDataValue(), "true");
            wishlistBookData.put(BookDetails.BOOK_PREMIUM_PRICE.getBookDataValue(), bookPrice);
            elementIsDisplayed(getPremiumSec(), "PremiumSec");
            elementIsDisplayed(getPremiumIcon(), "PremiumIcon");
        } else {
            wishlistBookData.put(BookDetails.BASIC_EDITION.getBookDataValue(), "true");
            wishlistBookData.put(BookDetails.BOOK_BASIC_PRICE.getBookDataValue(), bookPrice);
        }
        elementIsDisplayed(getBookMoveToCartBtn(), "BookMoveToCartBtn");
        elementIsDisplayed(getBookDeleteBtn(), "BookDeleteBtn");
        if (ProfileFields.MY_CART.getProfileFieldName().equals(deleteOrCart)) {
            click(getBookMoveToCartBtn(), "BookMoveToCartBtn");
            logger.info("book is moved to cart.");
        } else if (ProfileFields.MY_CART.getProfileFieldName().equals(deleteOrCart)) {
            click(getBookDeleteBtn(), "BookDeleteBtn");
            logger.info("book is deleted from the wish list.");
        } else {
            logger.info("book is still in the wish list");
        }
        logger.info("verification of wishlist book and get data of the book is completed successfully.\n");
        return wishlistBookData;
    }

    /**
     * @description this method is used to remove all book from wish list and
     * verify the wish list.
     */
    public void removeAllBooksVerifyEmptyWishlist() {
        logger.info("verification of removing books from the wish list and empty page is started...");
        do {
            if (checkIfElementIsDisplayed(getBookDeleteBtn(), "BookDeleteBtn")) {
                clickByActions(getBookDeleteBtn(), "BookDeleteBtn");
                waitTillElementIsDisplayedWithinTime(getBookCoverImg(), "BookCoverImg", 3);
            } else {
                break;
            }
        } while (true);
        verifyEmptyWishlist();
        logger.info("verification of removing books from the wish list and empty page is completed successfully.\n");
    }

}
