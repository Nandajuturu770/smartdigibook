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

import web.enums.ProfileFields;
import web.generic.WebElementActions;
import web.utils.StringUtils;

public class ProfilePage extends WebElementActions {

	final static Logger logger = LogManager.getLogger(HomePage.class);
	WebDriver driver;

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//* Profile Page
	@FindBy(xpath = "//*[@data-testid='ArrowBackIcon']")
	private WebElement backBtn;

	@FindBy(xpath = "//*[contains(@class, 'avatar-logo')]")
	private WebElement profileMainImg;

	@FindBy(className = "change-avtar-text")
	private WebElement changePictureTxt;

	@FindBy(xpath = "//*[@alt='upload-profile']")
	private WebElement uploadImageImg;

	@FindBy(xpath = "//*[contains(text(), 'Upload')]")
	private WebElement uploadAnImageTxt;

	@FindBy(xpath = "//*[@alt='upload-profile']/parent::span/following-sibling::span")
	private WebElement uploadImageArrowBtn;

	@FindBy(xpath = "//*[@alt='select-avatar']")
	private WebElement selectAvatarImg;

	@FindBy(xpath = "//*[text()='Select Avatar']")
	private WebElement selectAvatarTxt;

	@FindBy(xpath = "//*[text()='Select Avatar']/parent::span/following-sibling::span")
	private WebElement selectAvatarArrowBtn;

	@FindBy(xpath = "//*[@alt='settings']")
	private WebElement notificationSettingsImg;

	@FindBy(xpath = "//*[contains(text(),'Settings')]")
	private WebElement notificationSettingsTxt;

	@FindBy(xpath = "//*[@alt='settings']/parent::span/following-sibling::*")
	private WebElement notificationSettingsArrowBtn;

	@FindBy(className = "language-options-div")
	private WebElement languageOptionsTxt;

	@FindBy(className = "change-language-name")
	private WebElement changePreferredLanguageTxt;

	@FindBy(id = "language-label")
	private WebElement SelectedlanguageBtn;

	@FindBy(xpath = "//*[@role='option']")
	private List<WebElement> languageOpts;

	@FindBy(className = "redeem-books-count")
	private WebElement redeemedBooksCountTxt;

	@FindBy(className = "redeem-books-message")
	private WebElement redeemedBooksTxt;

	//* Personal Info
	@FindBy(xpath = "//*[contains(text(), 'Personal')]")
	private WebElement personInfoTxt;

	@FindBy(xpath = "//*[text()='Full Name']")
	private WebElement fullNameTxt;

	@FindBy(xpath = "//*[text()='Email']")
	private WebElement emailTxt;

	@FindBy(xpath = "//*[text()='Phone Number']")
	private WebElement phoneNumberTxt;

	@FindBy(xpath = "//*[text()='State']")
	private WebElement stateTxt;

	@FindBy(xpath = "//*[text()='City']")
	private WebElement cityTxt;

	@FindBy(xpath = "//*[text()='Board']")
	private WebElement boardTxt;

	@FindBy(xpath = "//*[text()='Medium']")
	private WebElement mediumTxt;

	@FindBy(xpath = "//*[text()='Grade']")
	private WebElement gradeTxt;

	@FindBy(xpath = "//*[text()='School Name']")
	private WebElement schoolNameTxt;

	@FindBy(xpath = "//*[text()='Full Name']/following-sibling::p")
	private WebElement fullNameValueTxt;

	@FindBy(xpath = "//*[text()='Email']/following-sibling::p")
	private WebElement emailValueTxt;

	@FindBy(xpath = "//*[text()='Phone Number']/following-sibling::p")
	private WebElement phoneNumberValueTxt;

	@FindBy(xpath = "//*[text()='State']/following-sibling::p")
	private WebElement stateValueTxt;

	@FindBy(xpath = "//*[text()='City']/following-sibling::p")
	private WebElement cityValueTxt;

	@FindBy(xpath = "//*[text()='Board']/following-sibling::p")
	private WebElement boardValueTxt;

	@FindBy(xpath = "//*[text()='Medium']/following-sibling::p")
	private WebElement mediumValueTxt;

	@FindBy(xpath = "//*[text()='Grade']/following-sibling::p")
	private WebElement gradeValueTxt;

	@FindBy(xpath = "//*[text()='School Name']/following-sibling::p")
	private WebElement schoolNameValueTxt;

	@FindBy(xpath = "//button[text()='Edit Info']")
	private WebElement editInfoBtn;

	@FindBy(className = "footer-security-name")
	private WebElement securityTxt;

	@FindBy(className = "security-pin-name")
	private WebElement loginPinTxt;

	@FindBy(className = "security-asterik")
	private WebElement passwordTxt;

	@FindBy(xpath = "//*[@alt='lock']")
	private WebElement lockImg;

	@FindBy(xpath = "//button[text()='Change Login Pin']")
	private WebElement changeLoginPin;

	//* Change Password Pop up
	@FindBy(className = "changePasswordTitle")
	private WebElement changePasswordTitle;

	@FindBy(className = "changePasswordTitleTwo")
	private WebElement numericOnlyTxt;

	@FindBy(xpath = "//*[text()='Old Login Pin']")
	private WebElement oldLoginPinTxt;

	@FindBy(xpath = "(//*[@class='otp-group'])[1]/child::input")
	private List<WebElement> oldLoginPinTxtfd;

	@FindBy(xpath = "//*[text()='New Login Pin']")
	private WebElement newLoginPinTxt;

	@FindBy(xpath = "(//*[@class='otp-group'])[2]/child::input")
	private List<WebElement> newLoginPinTxtfd;

	@FindBy(xpath = "//*[text()='Confirm New Login Pin']")
	private WebElement confirmNewLoginPinTxt;

	@FindBy(xpath = "(//*[@class='otp-group'])[3]/child::input")
	private List<WebElement> confirmLoginPinTxtfd;

	@FindBy(className = "changePasswordBtn")
	private WebElement changePasswordBtn;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement changePasswordPopupCloseBtn;

	//* Edit Profile Page
	@FindBy(id = "firstName")
	private WebElement firstNameTxtfd;

	@FindBy(id = "lastName")
	private WebElement lastNameTxtfd;

	@FindBy(id = "email")
	private WebElement emailTxtfd;// to get email use attribute value

	@FindBy(id = "mobile")
	private WebElement mobileTxtfd;

	@FindBy(id = "state")
	private WebElement stateDropdownBtn;

	@FindBy(id = "city")
	private WebElement cityDropdownBtn;

	@FindBy(id = "board")
	private WebElement boardDropdownBtn;

	@FindBy(id = "medium")
	private WebElement mediumDropdownBtn;

	@FindBy(id = "grade")
	private WebElement gradeDropdownBtn;

	@FindBy(id = "school")
	private WebElement schoolTxtfd;

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelBtn;

	@FindBy(xpath = "//button[text()='Update']")
	private WebElement updateBtn;

	//* Getter Methods
	public static Logger getLogger() {
		return logger;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getProfileMainImg() {
		return profileMainImg;
	}

	public WebElement getChangePictureTxt() {
		return changePictureTxt;
	}

	public WebElement getUploadImageImg() {
		return uploadImageImg;
	}

	public WebElement getUploadAnImageTxt() {
		return uploadAnImageTxt;
	}

	public WebElement getUploadImageArrowBtn() {
		return uploadImageArrowBtn;
	}

	public WebElement getSelectAvatarImg() {
		return selectAvatarImg;
	}

	public WebElement getSelectAvatarTxt() {
		return selectAvatarTxt;
	}

	public WebElement getSelectAvatarArrowBtn() {
		return selectAvatarArrowBtn;
	}

	public WebElement getNotificationSettingsImg() {
		return notificationSettingsImg;
	}

	public WebElement getNotificationSettingsTxt() {
		return notificationSettingsTxt;
	}

	public WebElement getNotificationSettingsArrowBtn() {
		return notificationSettingsArrowBtn;
	}

	public WebElement getLanguageOptionsTxt() {
		return languageOptionsTxt;
	}

	public WebElement getChangePreferredLanguageTxt() {
		return changePreferredLanguageTxt;
	}

	public WebElement getSelectedlanguageBtn() {
		return SelectedlanguageBtn;
	}

	public List<WebElement> getLanguageOpts() {
		return languageOpts;
	}

	public WebElement getRedeemedBooksCountTxt() {
		return redeemedBooksCountTxt;
	}

	public WebElement getRedeemedBooksTxt() {
		return redeemedBooksTxt;
	}

	public WebElement getPersonInfoTxt() {
		return personInfoTxt;
	}

	public WebElement getFullNameTxt() {
		return fullNameTxt;
	}

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPhoneNumberTxt() {
		return phoneNumberTxt;
	}

	public WebElement getStateTxt() {
		return stateTxt;
	}

	public WebElement getCityTxt() {
		return cityTxt;
	}

	public WebElement getBoardTxt() {
		return boardTxt;
	}

	public WebElement getMediumTxt() {
		return mediumTxt;
	}

	public WebElement getGradeTxt() {
		return gradeTxt;
	}

	public WebElement getSchoolNameTxt() {
		return schoolNameTxt;
	}

	public WebElement getFullNameValueTxt() {
		return fullNameValueTxt;
	}

	public WebElement getEmailValueTxt() {
		return emailValueTxt;
	}

	public WebElement getPhoneNumberValueTxt() {
		return phoneNumberValueTxt;
	}

	public WebElement getStateValueTxt() {
		return stateValueTxt;
	}

	public WebElement getCityValueTxt() {
		return cityValueTxt;
	}

	public WebElement getBoardValueTxt() {
		return boardValueTxt;
	}

	public WebElement getMediumValueTxt() {
		return mediumValueTxt;
	}

	public WebElement getGradeValueTxt() {
		return gradeValueTxt;
	}

	public WebElement getSchoolNameValueTxt() {
		return schoolNameValueTxt;
	}

	public WebElement getEditInfoBtn() {
		return editInfoBtn;
	}

	public WebElement getSecurityTxt() {
		return securityTxt;
	}

	public WebElement getLoginPinTxt() {
		return loginPinTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLockImg() {
		return lockImg;
	}

	public WebElement getChangeLoginPin() {
		return changeLoginPin;
	}

	public WebElement getChangePasswordTitle() {
		return changePasswordTitle;
	}

	public WebElement getNumericOnlyTxt() {
		return numericOnlyTxt;
	}

	public WebElement getOldLoginPinTxt() {
		return oldLoginPinTxt;
	}

	public List<WebElement> getOldLoginPinTxtfd() {
		return oldLoginPinTxtfd;
	}

	public WebElement getNewLoginPinTxt() {
		return newLoginPinTxt;
	}

	public List<WebElement> getNewLoginPinTxtfd() {
		return newLoginPinTxtfd;
	}

	public WebElement getConfirmNewLoginPinTxt() {
		return confirmNewLoginPinTxt;
	}

	public List<WebElement> getConfirmLoginPinTxtfd() {
		return confirmLoginPinTxtfd;
	}

	public WebElement getChangePasswordBtn() {
		return changePasswordBtn;
	}

	public WebElement getChangePasswordPopupCloseBtn() {
		return changePasswordPopupCloseBtn;
	}

	public WebElement getFirstNameTxtfd() {
		return firstNameTxtfd;
	}

	public WebElement getLastNameTxtfd() {
		return lastNameTxtfd;
	}

	public WebElement getEmailTxtfd() {
		return emailTxtfd;
	}

	public WebElement getMobileTxtfd() {
		return mobileTxtfd;
	}

	public WebElement getStateDropdownBtn() {
		return stateDropdownBtn;
	}

	public WebElement getCityDropdownBtn() {
		return cityDropdownBtn;
	}

	public WebElement getBoardDropdownBtn() {
		return boardDropdownBtn;
	}

	public WebElement getMediumDropdownBtn() {
		return mediumDropdownBtn;
	}

	public WebElement getGradeDropdownBtn() {
		return gradeDropdownBtn;
	}

	public WebElement getSchoolTxtfd() {
		return schoolTxtfd;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	/* Verification Methods */
	/**
	 * @description this method is used to verify right side of profile page.
	 */
	public void verifyRightSideOfProfilePage() {
		logger.info("verification of profile page is started...");
		elementIsDisplayed(getBackBtn(), "BackBtn");
		elementIsDisplayed(getProfileMainImg(), "ProfileMainImg");
		elementIsDisplayed(getChangePictureTxt(), "ChangePictureTxt");
		elementIsDisplayed(getUploadImageImg(), "UploadImageImg");
		elementIsDisplayed(getUploadAnImageTxt(), "UploadAnImageTxt");
		elementIsDisplayed(getUploadImageArrowBtn(), "UploadImageArrowBtn");
		elementIsDisplayed(getSelectAvatarImg(), "SelectAvatarImg");
		elementIsDisplayed(getSelectAvatarTxt(), "SelectAvatarTxt");
		elementIsDisplayed(getSelectAvatarArrowBtn(), "SelectAvatarArrowBtn");
		elementIsDisplayed(getNotificationSettingsImg(), "NotificationSettingsImg");
		elementIsDisplayed(getNotificationSettingsTxt(), "NotificationSettingsTxt");
		elementIsDisplayed(getNotificationSettingsArrowBtn(), "NotificationSettingsArrowBtn");
		elementIsDisplayed(getSelectedlanguageBtn(), "SelectedlanguageBtn");
		elementIsDisplayed(getRedeemedBooksCountTxt(), "RedeemedBooksCountTxt");
		elementIsDisplayed(getRedeemedBooksTxt(), "RedeemedBooksTxt");
		String numberOfBooks = getTextFromElement(getRedeemedBooksTxt(), "RedeemedBooksTxt");
		logger.info("no of book redeemed are :: " + numberOfBooks);
		logger.info("verification of profile page is completed successfully\n");

	}

	/**
	 * description this method is used to verify profile info fields.
	 */
	public void verifyProfileInfoFields() {
		logger.info("verification of profile info fields is started...");
		elementIsDisplayed(getPersonInfoTxt(), "PersonInfoTxt");
		elementIsDisplayed(getFullNameTxt(), "FullNameTxt");
		elementIsDisplayed(getEmailTxt(), "EmailTxt");
		elementIsDisplayed(getPhoneNumberTxt(), "PhoneNumberTxt");
		elementIsDisplayed(getStateTxt(), "StateTxt");
		elementIsDisplayed(getCityTxt(), "CityTxt");
		elementIsDisplayed(getBoardTxt(), "BoardTxt");
		elementIsDisplayed(getMediumTxt(), "MediumTxt");
		elementIsDisplayed(getGradeTxt(), "GradeTxt");
		elementIsDisplayed(getSchoolNameTxt(), "SchoolNameTxt");
		logger.info("verification of profile page info fields completed successfully\n");
	}

	/**
	 * @description this method is used to get profile details.
	 * @return profileDetails <code>Map</code>
	 */
	public Map<String, String> getProfileDetails() {
		Map<String, String> profileDetails = new HashMap<>();
		logger.info("system is trying to get all fields data of profile...");
		profileDetails.put(ProfileFields.FULL_NAME.getProfileFieldName(), getTextFromElement(getFullNameValueTxt(), "FullNameValueTxt"));
		profileDetails.put(ProfileFields.EMAIL.getProfileFieldName(), getTextFromElement(getEmailValueTxt(), "EmailValueTxt"));
		profileDetails.put(ProfileFields.PHONE_NUMBER.getProfileFieldName(), getTextFromElement(getPhoneNumberValueTxt(), "PhoneNumberValueTxt"));
		profileDetails.put(ProfileFields.STATE.getProfileFieldName(), getTextFromElement(getStateValueTxt(), "StateValueTxt"));
		profileDetails.put(ProfileFields.CITY.getProfileFieldName(), getTextFromElement(getCityValueTxt(), "CityValueTxt"));
		profileDetails.put(ProfileFields.BOARD.getProfileFieldName(), getTextFromElement(getBoardValueTxt(), "BoardValueTxt"));
		profileDetails.put(ProfileFields.MEDIUM.getProfileFieldName(), getTextFromElement(getMediumValueTxt(), "MediumValueTxt"));
		profileDetails.put(ProfileFields.GRADE.getProfileFieldName(), getTextFromElement(getGradeValueTxt(), "GradeValueTxt"));
		profileDetails.put(ProfileFields.SCHOOL_NAME.getProfileFieldName(), getTextFromElement(getSchoolNameValueTxt(), "SchoolNameValueTxt"));
		logger.info("system got all filed data of profile successfully.\n");
		return profileDetails;
	}

	/**
	 * @description this method is used to update the profile and returns the
	 * update details.
	 * @return updatedDetails <code>Map</code>
	 */
	public Map<String, String> updateProfile() {
		click(getEditInfoBtn(), "EditInfo");
		Map<String, String> updatedDetails = new HashMap<>();
		String firstName = StringUtils.generateRandomString(6);
		clear(getFirstNameTxtfd(), "FirstNameTxtfd");
		enterValue(getFirstNameTxtfd(), "FirstNameTxtfd", firstName);	
		String lastName = StringUtils.generateRandomString(6);
		clear(getLastNameTxtfd(), "LastNameTxtfd");
		enterValue(getLastNameTxtfd(), "LastNameTxtfd", lastName);	
		updatedDetails.put(ProfileFields.FULL_NAME.getProfileFieldName(), firstName + " " + lastName);
		String emailName = getAttributeValueOfElement(getEmailTxtfd(), "EmailTxtFd", "value");
		updatedDetails.put(ProfileFields.EMAIL.getProfileFieldName(), emailName);
		String mobileValue = getAttributeValueOfElement(getMobileTxtfd(), "MobileTxtfd", "value");
		updatedDetails.put(ProfileFields.PHONE_NUMBER.getProfileFieldName(), mobileValue);
		String stateValue = getTextFromElement(getStateDropdownBtn(), "StateDropdownBtn");
		updatedDetails.put(ProfileFields.STATE.getProfileFieldName(), stateValue);
		scrollButtonOfPage();
		String cityValue = getTextFromElement(getCityDropdownBtn(), "CityDropdownBtn");
		updatedDetails.put(ProfileFields.CITY.getProfileFieldName(), cityValue);
		String boardValue = getTextFromElement(getBoardDropdownBtn(), "BoardDropdownBtn");
		updatedDetails.put(ProfileFields.BOARD.getProfileFieldName(), boardValue);
		String mediumValue = getTextFromElement(getMediumDropdownBtn(), "MediumDropdownBtn");
		updatedDetails.put(ProfileFields.MEDIUM.getProfileFieldName(), mediumValue);
		String gradeValue = getTextFromElement(getGradeDropdownBtn(), "GradeDropdownBtn");
		updatedDetails.put(ProfileFields.GRADE.getProfileFieldName(), gradeValue);
		String randomSchool =  StringUtils.generateRandomString(6);
        updatedDetails.put(ProfileFields.SCHOOL_NAME.getProfileFieldName(), randomSchool);
        clear(getSchoolTxtfd(), "SchollTxtfd");
        enterValue(getSchoolTxtfd(), "SchoolTxtfd", randomSchool);
        elementIsDisplayed(getCancelBtn(), "CancelBtn");
        elementIsDisplayed(getUpdateBtn(), "UpdateBtn");
        click(getUpdateBtn(), "UpdateBtn");
		return updatedDetails;

	}

}
