package web.pages;

import java.util.HashMap;
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
import web.utils.StringUtils;

public class CartPage extends WebElementActions {

	final static Logger logger = LogManager.getLogger(WishlistPage.class);
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//* Empty Screen
	@FindBy(className = "cartlist-titleHome")
	private WebElement homeLnk;

	@FindBy(xpath = "//*[text()='My Cart']")
	private WebElement myCartTitleTxt;

	@FindBy(xpath = "//*[text()='My Cart']/child::span")
	private WebElement myCartCountTxt;

	@FindBy(xpath = " //*[contains(@class,'justify-center')]/child::img")
	private WebElement emptyImg;

	@FindBy(xpath = "//*[contains(text(),'is empty')]")
	private WebElement emptyTitleTxt;

	@FindBy(xpath = "//*[contains(text(),'Explore from')]")
	private WebElement emptyDescTxt;

	@FindBy(xpath = "//*[contains(@class, 'css-1cx4s75')]")
	private WebElement startShoppingBtn;

	//* Cart Progress
	@FindBy(xpath = "//*[@class='step']//*[@xmlns='http://www.w3.org/2000/svg']")
	private WebElement cartProgressIcon;

	@FindBy(xpath = "//*[@class='step']/following-sibling::span")
	private WebElement cartProgressTxt;

	@FindBy(xpath = "//*[@class='step-non-selected']//*[@xmlns='http://www.w3.org/2000/svg']")
	private WebElement paymentProgressIcon;

	@FindBy(xpath = "//*[@class='step-non-selected']/following-sibling::span")
	private WebElement paymentProgressTxt;

	//* Book Details
	@FindBy(xpath = "//*[@class='cart-item-image']")
	private WebElement bookCoverImg;

	@FindBy(className = "cart-item-title")
	private WebElement bookTitleTxt;

	@FindBy(css = ".book-current-price.font-bold")
	private WebElement bookPriceTxt;

	@FindBy(className = "cart-item-grade")
	private WebElement bookGradeTxt;

	@FindBy(className = "cart-item-subject")
	private WebElement bookSubject;

	@FindBy(id = "wishlist-text-span")
	private WebElement bookMoveToWishlistBtn;

	@FindBy(id = "delete-icon")
	private WebElement bookDeleteBtn;

	@FindBy(className = "earn-span-block")
	private WebElement bookEarnTxt;

	@FindBy(xpath = "(//*[@class='cart-price-module-container'])[1]//*[@id='premium-book-div']")
	private WebElement firstBookPremiumCheck;

	@FindBy(xpath = "//*[@class='cart-Item-premium-label']/child::img")
	private WebElement bookPremiumIcon;

	@FindBy(xpath = "//*[@class='cart-Item-premium-label']/child::span")
	private WebElement bookPremiumTxt;

	@FindBy(className = "cart-Item-basic-label")
	private WebElement bookBasicTxt;

	//* Summary
	@FindBy(className = "summary-title")
	private WebElement summaryTitleTxt;

	@FindBy(className = "summary-item")
	private WebElement summaryNoOFItemsTxt;

	@FindBy(xpath = "//*[text()='Subtotal']")
	private WebElement subTotalTxt;

	@FindBy(xpath = "//*[text()='Subtotal']/following-sibling::div")
	private WebElement subTotalAmountTxt;

	@FindBy(xpath = "//*[text()='Discount']")
	private WebElement discountTxt;

	@FindBy(xpath = "//*[text()='Discount']/following-sibling::div")
	private WebElement discountAmountTxt;

	@FindBy(xpath = "//*[text()='Order Total']")
	private WebElement orderTotalTxt;

	@FindBy(xpath = "//*[text()='Order Total']/following-sibling::div")
	private WebElement orderTotalAmountTxt;

	@FindBy(xpath = "//*[text()='Pay Now']")
	private WebElement payNowBtn;

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

	public WebElement getMyCartTitleTxt() {
		return myCartTitleTxt;
	}

	public WebElement getMyCartCountTxt() {
		return myCartCountTxt;
	}

	public WebElement getEmptyImg() {
		return emptyImg;
	}

	public WebElement getEmptyTitleTxt() {
		return emptyTitleTxt;
	}

	public WebElement getEmptyDescTxt() {
		return emptyDescTxt;
	}

	public WebElement getStartShoppingBtn() {
		return startShoppingBtn;
	}

	public WebElement getCartProgressIcon() {
		return cartProgressIcon;
	}

	public WebElement getCartProgressTxt() {
		return cartProgressTxt;
	}

	public WebElement getPaymentProgressIcon() {
		return paymentProgressIcon;
	}

	public WebElement getPaymentProgressTxt() {
		return paymentProgressTxt;
	}

	public WebElement getBookCoverImg() {
		return bookCoverImg;
	}

	public WebElement getBookTitleTxt() {
		return bookTitleTxt;
	}

	public WebElement getBookPriceTxt() {
		return bookPriceTxt;
	}

	public WebElement getBookGradeTxt() {
		return bookGradeTxt;
	}

	public WebElement getBookSubject() {
		return bookSubject;
	}

	public WebElement getBookMoveToWishlistBtn() {
		return bookMoveToWishlistBtn;
	}

	public WebElement getBookDeleteBtn() {
		return bookDeleteBtn;
	}

	public WebElement getBookEarnTxt() {
		return bookEarnTxt;
	}

	public WebElement getFirstBookPremiumCheck() {
		return firstBookPremiumCheck;
	}

	public WebElement getBookPremiumIcon() {
		return bookPremiumIcon;
	}

	public WebElement getBookPremiumTxt() {
		return bookPremiumTxt;
	}

	public WebElement getBookBasicTxt() {
		return bookBasicTxt;
	}

	public WebElement getSummaryTitleTxt() {
		return summaryTitleTxt;
	}

	public WebElement getSummaryNoOFItemsTxt() {
		return summaryNoOFItemsTxt;
	}

	public WebElement getSubTotalTxt() {
		return subTotalTxt;
	}

	public WebElement getSubTotalAmountTxt() {
		return subTotalAmountTxt;
	}

	public WebElement getDiscountTxt() {
		return discountTxt;
	}


	public WebElement getDiscountAmountTxt() {
		return discountAmountTxt;
	}

	public WebElement getOrderTotalTxt() {
		return orderTotalTxt;
	}

	public WebElement getOrderTotalAmountTxt() {
		return orderTotalAmountTxt;
	}

	public WebElement getPayNowBtn() {
		return payNowBtn;
	}

	/**
	 * @description this method is used to verify the header of cart and gives
	 * no of books.
	 * @return noOfBooks <code>int</code>
	 */
	public int verifyHeader() {
		logger.info("verification of header of cart is started...");
		elementIsDisplayed(getHomeLnk(), "HomeLnk");
		elementIsDisplayed(getMyCartTitleTxt(), "MyCartTitleTxt");
		elementIsDisplayed(getMyCartCountTxt(), "MyCartCountTxt");
		String noOfBooks = getTextFromElement(getMyCartCountTxt(), "MyCartCountTxt");
		elementIsDisplayed(getCartProgressIcon(), "CartProgressIcon");
		elementIsDisplayed(getCartProgressTxt(), "CartProgressTxt");
		elementIsDisplayed(getPaymentProgressIcon(), "PaymentProgressIcon");
		elementIsDisplayed(getPaymentProgressTxt(), "PaymentProgressTxt");
		logger.info("verification of header of cart is completed successfully.");
		return StringUtils.getNumberFromString(noOfBooks);
	}

	/**
	 * @description this method is used to verify empty cart.
	 */
	public void verifyEmptyCart() {
		logger.info("verification of empty cart is started...");
		elementIsDisplayed(getEmptyImg(), "EmptyImg");
		elementIsDisplayed(getEmptyTitleTxt(), "EmptyTitleTxt");
		elementIsDisplayed(getEmptyDescTxt(), "EmptyDescTxt");
		elementIsDisplayed(getStartShoppingBtn(), "StartShoppingBtn");
		logger.info("verification of empty cart is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify details in cart and get the details of the book.
	 * @param deleteOrWishlist <code>String</code>
	 * @return bookDetails <code>Map</code>
	 */
	public Map<String, String> verifyBookAndGetBookDetails(String deleteOrWishlist) {
		logger.info("verification of cart book is started...");
		// to store the data
		Map<String, String> bookDetails = new HashMap<>();
		elementIsDisplayed(getBookCoverImg(), "BookCoverImg");
		elementIsDisplayed(getBookTitleTxt(), "BookTitleTxt");
		String bookName = getTextFromElement(getBookTitleTxt(), "BookTitleTxt");
		bookDetails.put(BookDetails.BOOK_NAME.getBookDataValue(), bookName);
		elementIsDisplayed(getBookPriceTxt(), "BookPriceTxt");
		elementIsDisplayed(getBookEarnTxt(), "BookEarnTxt");
		String earnedNavCoins = getTextFromElement(getBookEarnTxt(), "BookEarnTxt");
		int noOfCoins = StringUtils.getNumberFromString(earnedNavCoins);
		String bookPrice = getTextFromElement(getBookPriceTxt(), "BookPriceTxt");
		boolean status = checkIfElementIsDisplayed(getFirstBookPremiumCheck(), "FirstBookPremiumCheck");
		if (status) {
			elementIsDisplayed(getBookPremiumIcon(), "BookPremiumIcon");
			elementIsDisplayed(getBookPremiumTxt(), "BookPremiumTxt");
			bookDetails.put(BookDetails.PREMIUM_EDITION.getBookDataValue(), "true");
			bookDetails.put(BookDetails.BOOK_PREMIUM_PRICE.getBookDataValue(), bookPrice);
			if (!(noOfCoins == 70 || noOfCoins == 20)) {
				Assert.fail("system is showing wrong number of coins : " + noOfCoins + " instead of 70 or 20.");
			}
		} else {
			elementIsDisplayed(getBookBasicTxt(), "BookBasicTxt");
			bookDetails.put(BookDetails.BASIC_EDITION.getBookDataValue(), "true");
			bookDetails.put(BookDetails.BOOK_BASIC_PRICE.getBookDataValue(), bookPrice);
			if (!(noOfCoins == 50)) {
				Assert.fail("system is showing wrong number of coins : " + noOfCoins + " instead of 50.");
			}
		}
		elementIsDisplayed(getBookGradeTxt(), "BookGradeTxt");
		String bookGrade = getTextFromElement(getBookGradeTxt(), "BookGradeTxt");
		bookDetails.put(BookDetails.BOOK_GRADE.getBookDataValue(), bookGrade);
		elementIsDisplayed(getBookSubject(), "BookSubject");
		String bookSubject = getTextFromElement(getBookSubject(), "BookSubject");
		bookDetails.put(BookDetails.BOOK_SUBJECT.getBookDataValue(), bookSubject);
		elementIsDisplayed(getBookMoveToWishlistBtn(), "BookMoveToWishlistBtn");
		elementIsDisplayed(getBookDeleteBtn(), "BookDeleteBtn");
		if (ProfileFields.MY_CART.getProfileFieldName().equals(deleteOrWishlist)) {
			click(getBookMoveToWishlistBtn(), "BookMoveToWishlistBtn");
			logger.info("book is moved to wish list.");
		} else if (ProfileFields.MY_CART.getProfileFieldName().equals(deleteOrWishlist)) {
			click(getBookDeleteBtn(), "BookDeleteBtn");
			logger.info("book is deleted from the wish list.");
		} else {
			logger.info("book is still in the  cart");
		}
		logger.info("verification of cart book is is completed successfully.\n");
		return bookDetails;
	}

	/**
	 * @description this method is used to verify the summary.
	 */
	public void verifySummary(){
		logger.info("verification of cart summary is started.");
		elementIsDisplayed(getSummaryTitleTxt(), "SummaryTitleTxt");
		elementIsDisplayed(getSummaryNoOFItemsTxt(), "SummaryNoOFItemsTxt");
		elementIsDisplayed(getSubTotalTxt(), "SubTotalTxt");
		elementIsDisplayed(getSubTotalAmountTxt(), "SubTotalAmountTxt");
		elementIsDisplayed(getDiscountTxt(), "DiscountTxt");
		elementIsDisplayed(getDiscountAmountTxt(),"DiscountAmountTxt" );
		elementIsDisplayed(getOrderTotalTxt(), "OrderTotalTxt");
		elementIsDisplayed(getOrderTotalAmountTxt(), "OrderTotalAmountTxt");
		logger.info("verification of cart summary is completed successfully.\n");
	}

	/**
	 * @description this method is used to remove all the books from the cart and verify empty cart.
	 */
	public void removeAllBooksAndVerifyEmptyCart(){
		logger.info("verification of removing books from the wish list and empty page is started...");
		do {
			if (checkIfElementIsDisplayed(getEmptyImg(), "getEmptyImg")) {
				break;
			} else {
				clickByActions(getBookDeleteBtn(), "BookDeleteBtn");
				waitTillElementIsDisplayedWithinTime(getBookCoverImg(),"BookCoverImg", 5);
			}
		} while (true);
		verifyEmptyCart();
		logger.info("verification of removing books from the wish list and empty page is completed successfully.\n");
	}

}
