package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class LoginPage extends WebElementActions {

	final static Logger logger = LogManager.getLogger(LoginPage.class);
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//* element of the login page 
	@FindBy(xpath = "//img[@class = 'logo']")
	private WebElement smartDigiBookImg;

	@FindBy(xpath = "//p[@class = 'login-message']")
	private WebElement loginInToYourAccountTxt;

	@FindBy(xpath = "//*[@alt='indian-flag']")
	private WebElement indiaFlagImg;

	@FindBy(xpath = "//img[@alt='indian-flag']/following-sibling::p")
	private WebElement indiaCountryCodeTxt;

	@FindBy(id = "contactNumber")
	private WebElement mobileNumberTxtfd;

	@FindBy(xpath = "//*[contains(text() ,'Login PIN')]")
	private WebElement loginPinTxt;

	@FindBy(xpath = "//a[@href='/forgot-password']")

	private WebElement forgotPasswordLnk;

	@FindBy(xpath = "//input[@type='password']")
	private List<WebElement> passwordTxtfd;

	@FindBy(xpath = "//button[contains(@class , 'sdbLoginBtn')]")
	private WebElement loginBtn;

	@FindBy(xpath = "//*[contains(text(),'a new user')]")
	private WebElement areYouNewUserTxt;

	@FindBy(xpath = "//button[contains(@class , 'undefined')]")
	private WebElement createNewAccountBtn;

	@FindBy(xpath = "//*[@class = 'newUserText']")
	private WebElement howToCreateAccountTxt;

	@FindBy(xpath = "//*[@class = 'newUserText']/following-sibling::div/img")
	private WebElement howToCreateAccountImg;

	@FindBy(xpath = "//a[@class='howToUseText']")
	private WebElement howToUseLnk;

	@FindBy(xpath = "//a[@class='howToUseText']/following-sibling::div/img")
	private WebElement howToUseImg;

	@FindBy(xpath = "//*[@class='bg h-full']/img")
	private WebElement studyPerkImg;

	@FindBy(xpath = "//*[@class='myLibrary-title']")
	private WebElement myLibraryTxt;

	//* element of create account page
	@FindBy(className = "registration-logo")
	private WebElement registrationLogo;

	@FindBy(className = "create-account")
	private WebElement createYourAccountTitleTxt;

	@FindBy(className = "create-account-message")
	private WebElement whenWeLearnTxt;

	@FindBy(id = "firstName")
	private WebElement firstNameTxtfd;

	@FindBy(id = "lastName")
	private WebElement lastNameTxtfd;

	@FindBy(id = "securityPin")
	private WebElement pinTxtFd;

	@FindBy(className = "useDigitsNumbersText")
	private WebElement useDigitsNumberTxt;

	@FindBy(id = "email")
	private WebElement emailTxtFd;

	@FindBy(id = "contactNumber")
	private WebElement contactnumberTxt;

	@FindBy(xpath = "//*[contains(@class,'absolute right')]/button")
	private WebElement getOptBtn;

	@FindBy(id = "state")
	private WebElement stateDropdown;

	@FindBy(xpath = "//*[@role='option']")
	private List<WebElement> stateOrCityDropdownOpt;

	@FindBy(id = "city")
	private WebElement cityDropDown;

	@FindBy(id = "agreement")
	private WebElement agreementCkbx;

	@FindBy(xpath = "//*[contains(text(),'agree')]")
	private WebElement iAgreeWithTxt;

	@FindBy(className = "anchorTagPrivacy")
	private WebElement privacyPoliceLnk;

	@FindBy(xpath = "//*[@class='registration-loginButton']/button")
	private WebElement continueBtn;

	@FindBy(className = "havingTroubleText")
	private WebElement havingTroubleTxt;

	@FindBy(xpath = "//*[@class = 'animation-icon']/img")
	private WebElement havingTroubleImg;

	@FindBy(xpath = "//*[contains(text(),'Already')]")
	private WebElement alreadyYouHaveAccountTxt;

	@FindBy(className = "how-to-use-link")
	private WebElement loginLnk;

	@FindBy(xpath = "//*[@class='registration-right-div ']/img")
	private WebElement rightNavneetPerkImg;

	//* element of forget password page
	@FindBy(xpath = "//a[@href='/login']/img")
	private WebElement passwordSmartStoreLogo;

	@FindBy(className = "forgot-security-pin")
	private WebElement resetLoginPinTxt;

	@FindBy(className = "forgot-security-pin-message")
	private WebElement pleaseEnterTxt;

	@FindBy(id = "contactNumber")
	private WebElement contactNumberTxtfd;

	@FindBy(xpath = "//*[@class='forgot-password-loginButton']/button")
	private WebElement sendVerificationBtn;

	@FindBy(xpath = "//a[@href='/login']/img")
	private WebElement createPasswordLogo;

	@FindBy(className = "create-security-pin")
	private WebElement createSecurityPinTitleTxt;

	@FindBy(id = "verificationCode")
	private WebElement verificationTxtfd;

	@FindBy(id = "password")
	private WebElement passwordTxt;

	@FindBy(id = "confirmPassword")
	private WebElement confirmPasswordTxfd;

	@FindBy(xpath = "//*[@class='forgot-password-loginButton']/button")
	private WebElement changeLoginPinBtn;

	//* element of how to use page
	@FindBy(id = "language")
	private WebElement languageChangDropdown;

	@FindBy(xpath = "//*[@role='option']")
	private List<WebElement> languageDropdownOpts;

	@FindBy(className = "htu-header-button")
	private WebElement languageHeaderTxt;

	@FindBy(className = "htu-title")
	private WebElement titleTxt;

	@FindBy(className= "howtoUseListItems")
	private List<WebElement> howtoUseListTxt;

	@FindBy(className = "send-email-text")
	private WebElement sendEmailTxt;

	@FindBy(xpath = "//a[@href='mailto:support@smartdigibook.com']")
	private WebElement emailLnk;

	public WebElement getSmartDigiBookImg() {
		return smartDigiBookImg;
	}

	public WebElement getLoginInToYourAccountTxt() {
		return loginInToYourAccountTxt;
	}

	public WebElement getIndiaFlagImg() {
		return indiaFlagImg;
	}

	public WebElement getIndiaCountryCodeTxt() {
		return indiaCountryCodeTxt;
	}

	public WebElement getMobileNumberTxtfd() {
		return mobileNumberTxtfd;
	}

	public WebElement getLoginPinTxt() {
		return loginPinTxt;
	}

	public WebElement getForgotPasswordLnk() {
		return forgotPasswordLnk;
	}

	public List<WebElement> getPasswordTxtfd() {
		return passwordTxtfd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getAreYouNewUserTxt() {
		return areYouNewUserTxt;
	}

	public WebElement getCreateNewAccountBtn() {
		return createNewAccountBtn;
	}

	public WebElement getHowToCreateAccountTxt() {
		return howToCreateAccountTxt;
	}

	public WebElement getHowToCreateAccountImg() {
		return howToCreateAccountImg;
	}

	public WebElement getHowToUseLnk() {
		return howToUseLnk;
	}

	public WebElement getHowToUseImg() {
		return howToUseImg;
	}

	public WebElement getStudyPerkImg() {
		return studyPerkImg;
	}

	public static Logger getLogger() {
		return logger;
	}

	public WebElement getMyLibraryTxt() {
		return myLibraryTxt;
	}

	// getter methods for create account
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegistrationLogo() {
		return registrationLogo;
	}

	public WebElement getCreateYourAccountTitleTxt() {
		return createYourAccountTitleTxt;
	}

	public WebElement getWhenWeLearnTxt() {
		return whenWeLearnTxt;
	}

	public WebElement getFirstNameTxtfd() {
		return firstNameTxtfd;
	}

	public WebElement getLastNameTxtfd() {
		return lastNameTxtfd;
	}

	public WebElement getPinTxtFd() {
		return pinTxtFd;
	}

	public WebElement getUseDigitsNumberTxt() {
		return useDigitsNumberTxt;
	}

	public WebElement getEmailTxtFd() {
		return emailTxtFd;
	}

	public WebElement getContactNumberTxt() {
		return contactnumberTxt;
	}

	public WebElement getGetOptBtn() {
		return getOptBtn;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public List<WebElement> getStateDropdownOpt() {
		return stateOrCityDropdownOpt;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getAgreementCkbx() {
		return agreementCkbx;
	}

	public WebElement getiAgreeWithTxt() {
		return iAgreeWithTxt;
	}

	public WebElement getPrivacyPoliceLnk() {
		return privacyPoliceLnk;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getHavingTroubleTxt() {
		return havingTroubleTxt;
	}

	public WebElement getHavingTroubleImg() {
		return havingTroubleImg;
	}

	public WebElement getAlreadyYouHaveAccountTxt() {
		return alreadyYouHaveAccountTxt;
	}

	public WebElement getLoginLnk() {
		return loginLnk;
	}

	public WebElement getRightNavneetPerkImg() {
		return rightNavneetPerkImg;
	}

	// getter methods of forget page
	public WebElement getPasswordSmartStoreLogo() {
		return passwordSmartStoreLogo;
	}

	public WebElement getResetLoginPinTxt() {
		return resetLoginPinTxt;
	}

	public WebElement getPleaseEnterTxt() {
		return pleaseEnterTxt;
	}

	public WebElement getContactNumberTxtfd() {
		return contactNumberTxtfd;
	}

	public WebElement getSendVerificationBtn() {
		return sendVerificationBtn;
	}

	public WebElement getCreatePasswordLogo() {
		return createPasswordLogo;
	}

	public WebElement getCreateSecurityPinTitleTxt() {
		return createSecurityPinTitleTxt;
	}

	public WebElement getVerificationTxtfd() {
		return verificationTxtfd;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getConfirmPasswordTxfd() {
		return confirmPasswordTxfd;
	}

	public WebElement getChangeLoginPinBtn() {
		return changeLoginPinBtn;
	}

	//* getter methods of how to use page
	public WebElement getLanguageChangDropdown() {
		return languageChangDropdown;
	}

	public List<WebElement> getLanguageDropdownOpts() {
		return languageDropdownOpts;
	}

	public WebElement getLanguageHeaderTxt() {
		return languageHeaderTxt;
	}

	public WebElement getTitleTxt() {
		return titleTxt;
	}

	public List<WebElement> getHowtoUseListTxt() {
		return howtoUseListTxt;
	}

	public WebElement getSendEmailTxt() {
		return sendEmailTxt;
	}

	public WebElement getEmailLnk() {
		return emailLnk;
	}

	/*verification methods*/
	/**
	 * @description this method is used to verify login.
	 */
	public void verifyLoginPage() {
		waitTillElementIsDisplayedWithinTime(getLoginInToYourAccountTxt(),"LoginInToYourAccountTxt" , 20);
		logger.info("verification of login page is started...");
		elementIsDisplayed(getSmartDigiBookImg(), "SmartDigiBookImg");
		elementIsDisplayed(getLoginInToYourAccountTxt(), "LoginInToYourAccountTxt");
		elementIsDisplayed(getIndiaFlagImg(), "IndiaFlagImg");
		elementIsDisplayed(getIndiaCountryCodeTxt(),"IndiaCountryCodeTxt");
		elementIsDisplayed(getMobileNumberTxtfd(),"MobileNumberTxtfd");
		elementIsDisplayed(getLoginPinTxt(),"LoginPinTxt");
		elementIsDisplayed(getForgotPasswordLnk(),"ForgotPasswordLnk");
		int i = 1;
		for (WebElement element : getPasswordTxtfd()) {
			elementIsDisplayed(element , "password"+(i++)+"Txtfd");
		}
		elementIsDisplayed(getLoginBtn(),"LoginBtn");
		elementIsDisplayed(getAreYouNewUserTxt(),"AreYouNewUserTxt");
		elementIsDisplayed(getCreateNewAccountBtn(),"CreateNewAccountTxt");
		elementIsDisplayed(getHowToCreateAccountImg(),"HowToCreateAccountVideoImg");
		elementIsDisplayed(getHowToUseLnk(),"HowToUseLnk");
		elementIsDisplayed(getHowToUseImg(),"HowToUseVideoImg");
		elementIsDisplayed(getStudyPerkImg(),"StudentPerkImg");
		logger.info("verification of login page is completed successfully.\n");
	}

	/**
	 * @description this method is used to login into the application.
	 * @param mobileNumber <code>String</code>
	 * @param password <code>String</code>
	 */
	public void loginIntoApplication(String mobileNumber, String password) {
		for (int i = 0; i < 20; i++) {
			if (checkIfElementIsDisplayed(getLoginInToYourAccountTxt(), "LoginInToYourAccountTxt")) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		logger.info("system is trying to login into application...");
		enterValue(getMobileNumberTxtfd(), "MobileNumberTxtfd", mobileNumber);
		int charPosition = 0;
		for (WebElement element : getPasswordTxtfd()) {
			enterValue(element,"passwordTxtFd"+(charPosition+1), password.charAt(charPosition++) + "");
		}
		click(getLoginBtn(),"loginBtn");
		click(getLoginBtn(),"loginBtn");
		waitTillElementIsDisplayedWithinTime(getMyLibraryTxt(),"MyLibraryTxt" , 20);		
		addCookies("App_promotion_popup", "true");
		logger.info("system logined into application with desired capabilities successfully.\n");
	}

	/**
	 * @description this method is used to verify the create account page.
	 */
	public void verifyCreateAccountFeature(){
		click(getCreateNewAccountBtn(), "CreateNewAccountBtn");
		logger.info("verification of create account is started...");
		waitTillElementIsDisplayedWithinTime(getCreateYourAccountTitleTxt(), "getCreateYourAccountTitleTxt", 5);
		elementIsDisplayed(getRegistrationLogo(), "RegistrationLogo");
		elementIsDisplayed(getCreateYourAccountTitleTxt(), "CreateYourAccountTitleTxt");
		elementIsDisplayed(getWhenWeLearnTxt(), "WhenWeLearnTxt");
		elementIsDisplayed(getFirstNameTxtfd(), "FirstNameTxtfd");
		elementIsDisplayed(getLastNameTxtfd(), "LastNameTxtfd");
		elementIsDisplayed(getPinTxtFd(), "PinTxtFd");
		elementIsDisplayed(getUseDigitsNumberTxt(), "UseDigitsNumberTxt");
		elementIsDisplayed(getEmailTxtFd(), "EmailTxtfd");
		elementIsDisplayed(getContactNumberTxt(), "ContactNumberTxtfd");
		elementIsDisplayed(getGetOptBtn(), "GetOptBtn");
		elementIsDisplayed(getStateDropdown(), "StateDropdown");
		click(getStateDropdown(), "StateDropdown");
		logger.info("state names from the state dropdown..");
		List<WebElement> stateOptions = getStateDropdownOpt();
		int i = 1;
		for(WebElement element : stateOptions) {
			elementIsDisplayed(element, (i++)+" "+element.getText());
		}
		click(stateOptions.get(3),stateOptions.get(3).getText() );
		waitTillElementIsDisplayedWithinTime(getCityDropDown(), "getCityDropDown", 5);
		elementIsDisplayed(getCityDropDown(), "CityDropdown");
		click(getCityDropDown(), "CityDropdown");
		List<WebElement> cityOptions = getStateDropdownOpt();
		i = 1;
		for(WebElement element : cityOptions) {
			elementIsDisplayed(element, (i++)+" "+element.getText());
		}
		click(cityOptions.get(3),cityOptions.get(3).getText() );
		waitTillElementIsDisplayedWithinTime(getCityDropDown(), "getCityDropDown", 5);
		scrollToElementByActions(getLoginLnk(), "getLoginLnk");
		elementIsDisplayed(getAgreementCkbx(), "AgreementCkbx");
		elementIsDisplayed(getiAgreeWithTxt(), "IAgreementWithTxt");
		elementIsDisplayed(getPrivacyPoliceLnk(), "PrivacyPoliceLnk");
		elementIsDisplayed(getContinueBtn(), "ContinueBtn");
		elementIsDisplayed(getHavingTroubleTxt(), "HavingTroubleTxt");
		elementIsDisplayed(getHavingTroubleImg(), "HavingTroubleImg");
		elementIsDisplayed(getAlreadyYouHaveAccountTxt(), "AlreadyYouHaveAccountTxt");
		elementIsDisplayed(getLoginLnk(), "LoginLnk");
		elementIsDisplayed(getRightNavneetPerkImg(), "RightNavneetPerkImg");
		navigateBack();
		logger.info("verification of create account is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify forgot password feature.
	 */
	public void verifyForgotPassword() {
		click(getForgotPasswordLnk(),"getForgotPasswordLnk");
		logger.info("verification of forgot password is started...");
		waitTillElementIsDisplayedWithinTime(getResetLoginPinTxt(), "getResetLoginPinTxt", 5);
		elementIsDisplayed(getPasswordSmartStoreLogo(), "getPasswordSmartStoreLogo");
		elementIsDisplayed(getResetLoginPinTxt(), "ResetLoginPinTxt");
		elementIsDisplayed(getPleaseEnterTxt(), "PleaseEnterTxt");
		elementIsDisplayed(getContactNumberTxtfd(), "ContactNumberTxtfd");
		enterValue(getContactNumberTxtfd(),"getContactNumberTxtfd", "7702425817");
		elementIsDisplayed(getSendVerificationBtn(), "SendVerificationBtn");
		click(getSendVerificationBtn(), "getSendVerificationBtn");
		elementIsDisplayed(getCreateSecurityPinTitleTxt(), "CreateSecurityPinTitleTxt");
		elementIsDisplayed(getVerificationTxtfd(), "VerificationTxtfd");
		elementIsDisplayed(getPasswordTxt(), "PasswordTxtfd");
		elementIsDisplayed(getConfirmPasswordTxfd(), "ConfirmPasswordTxfd");
		elementIsDisplayed(getChangeLoginPinBtn(), "ChangeLoginPinBtn");
		navigateBack();
		logger.info("verification of forgot password is completed successfully.\n");
	}

	/**
	 * @description this method is used to verify how to use
	 */
	public void verifyHowToUse() {
		click(getHowToUseLnk(), "getHowToUseLnk");
		logger.info("verification of how to use is started...");
		waitTillElementIsDisplayedWithinTime(getLanguageChangDropdown(), "getLanguageChangDropdown", 5);
		elementIsDisplayed(getLanguageChangDropdown(), "LanguageChangDropdown");
		List<WebElement> languageOptions = getLanguageDropdownOpts();
		for(WebElement element : languageOptions) {
			elementIsDisplayed(element, element.getText());
		}
		elementIsDisplayed(getTitleTxt(), "LanguageTitleTxt");
		List<WebElement> qas = getHowtoUseListTxt();
		for(WebElement element : qas) {
			elementIsDisplayed(element, element.getText());
		}
		elementIsDisplayed(getSendEmailTxt(), "SendEmailTxt");
		elementIsDisplayed(getEmailLnk(), "EmailLnk");
		navigateBack();
		logger.info("verification of how to use is completed successfully.\n");
	}
}