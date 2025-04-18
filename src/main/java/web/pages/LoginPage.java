package web.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    
    /*element of the login page */
    @FindBy(xpath = "//img[@class = 'logo']")
    private WebElement smartDigiBookImg;

    @FindBy(xpath = "//p[@class = 'login-message']")
    private WebElement loginInToYourAccountTxt;

    @FindBy(xpath = "//*[@alt='indian-flag']")
    private WebElement indiaFlagImg;

    @FindBy(xpath = "//img[@alt='indian-flag']/following-sibling::p")
    private WebElement indiaCoutryCodeTxt;

    @FindBy(id = "contactNumber")
    private WebElement mobileNumberTxtfd;

    @FindBy(xpath = "//*[contains(text() ,'Login PIN')]")
    @SuppressWarnings("unused")
    private WebElement loginPinTxt;

    @FindBy(xpath = "//a[@href='/forgot-password']")
    @SuppressWarnings("unused")
    private WebElement forgotPasswordLnk;

    @FindBy(xpath = "//input[@type='password']")
    private List <WebElement> passwordTxtfd ;

    @FindBy(xpath = "//button[contains(@class , 'sdbLoginBtn-mobile')]")
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
    private WebElement studyPertImg;

    public WebElement getSmartDigiBookImg() {
        return smartDigiBookImg;
    }

    public WebElement getLoginInToYourAccountTxt() {
        return loginInToYourAccountTxt;
    }

    public WebElement getIndiaFlagImg() {
        return indiaFlagImg;
    }

    public WebElement getIndiaCoutryCodeTxt() {
        return indiaCoutryCodeTxt;
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

    public WebElement getStudyPertImg() {
        return studyPertImg;
    }



}
