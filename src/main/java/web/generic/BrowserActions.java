package web.generic;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserActions  {

	final static Logger logger = LogManager.getLogger(BrowserActions.class);

	protected static WebDriver driver = BaseTest.driver;
	
	/**
	 * @description this method is used to maximize the browser.
	 */
	public static void maximizeBrower() {
		try {
			driver.manage().window().maximize();
			logger.info("browser is maximixed...");
		} catch (Exception exception) {
			Assert.fail("failed to maximize the browser :: please check below details \n"+exception.getMessage());
		}
	}
	
	/**
	 * @description this method is used to minimize the browser.
	 */
	public static void miniimizeBrower() {
		try {
			driver.manage().window().minimize();
			logger.info("browser is minimized...");
		} catch (Exception exception) {
			Assert.fail("failed to minimize the screnn browser :: please check below details \n"+exception.getMessage());
		}
	}
	


	/**
	 * @description this method is used to refresh the page.
	 */
	public static void refreshBrowser() {
		try {
			driver.navigate().refresh();
			logger.info("browser is refreshed...");
		} catch (Exception exception) {
			Assert.fail("failed to refresh the page :: please check below details \n"+exception.getMessage());
		}	
	}

	/**
	 * @description this method is used to navigate back page.
	 */
	public static void navigateBack() {
		try {
			driver.navigate().back();
			logger.info("browser is navigaeted back...");
		} catch (Exception exception) {
			Assert.fail("failed to navigate back :: please check below details \n"+exception.getMessage());
		}	
	}

	/**
	 * @description this method is used to navigate forward page.
	 */
	public static void navigateForwad() {
		try {
			driver.navigate().forward();
			logger.info("browser is navigated forward...");
		} catch (Exception exception) {
			Assert.fail("failed to navigate forward :: please check below details \n"+exception.getMessage());
		}	
	}

	/**
	 * @description this method is used to get title of page.
	 * @return pageTitle <code>String</code>
	 */
	public static String getTitle() {
		try {
			String title = driver.getTitle();
			logger.info("browser tiltle is :: "+title);
			return title;
		} catch (Exception exception) {
			Assert.fail("failed to fetch title of page :: please check below details \n"+exception.getMessage());
		}
		return null;
	}

	/**
	 * @description this method is used to get current url of page.
	 * @return currentUrl <code>String</code>
	 */
	public static String getCurrentUrl() {
		try {
		
			String currentUrl = driver.getCurrentUrl();
			logger.info("browser current url is :: "+currentUrl);
			return currentUrl;
		} catch (Exception exception) {
			Assert.fail("failed to navigate back :: please check below details \n"+exception.getMessage());
		}
		return null;
	}
	
	/**
	 * @description this method is used to get parent window handle.
	 * @return parentWindowId <code>String</code>
	 */
	public static String getParentWindowHandle() {
		try {
			String parentWindowId = driver.getWindowHandle();
			logger.info("parent window id is :: "+parentWindowId);
			return parentWindowId;
		} catch (Exception exception) {
			Assert.fail("failed to fetch the parent window handle :: please check below details \n"+exception.getMessage());
		}
		return null;
	}
	
	/**
	 * @description this method is used to get all window handles.
	 * @return allWindowIds <code>Set<String></code>
	 */
	public static Set<String> getAllWindowHandles(){
		try {
			return driver.getWindowHandles();
		} catch (Exception exception) {
			Assert.fail("failed to fetch all window handles :: please check below details \n"+exception.getMessage());
		}
		return null;	
	}


}
