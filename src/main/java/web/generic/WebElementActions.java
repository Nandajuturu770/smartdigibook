package web.generic;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebElementActions extends BrowserActions {

	final static Logger logger = LogManager.getLogger(WebElementActions.class);

	private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public static Actions actions = new Actions(BaseTest.driver);

	/**
	 * @description this method is used to verify the element is displayed or
	 * not.
	 * @param element <code>WebElement</code>
	 * @return <code>boolean</code>
	 */
	public static boolean elementIsDisplayed(WebElement element, String elementName) {
		boolean result = false;
		try {
			result = element.isDisplayed();
			logger.info(elementName + " is displayed");
		} catch (Exception exception) {
			Assert.fail(elementName + " is not displayed :: please check below details \n" + exception.getMessage());
		}
		return result;
	}

	/**
	 * @description this method is used to check the element is displayed.
	 * @param element <code>WebElement</code>
	 * @return <code>boolean</code>
	 */
	public static boolean checkIfElementIsDisplayed(WebElement element, String elementName) {
		boolean status = false;
		try {
			status = element.isDisplayed();
			logger.info(elementName + " is displayed");
		} catch (Exception e) {
			logger.info(elementName + " is \" not \" displayed");
		}
		return status;

	}

	/**
	 * @description this method is used to enter the value into the element.
	 * @param element <code>WebElement</code>
	 * @param value <code>String</code>
	 */
	public static void enterValue(WebElement element, String elementName, String value) {
		try {
			element.sendKeys(value);
			logger.info(value + " is entered into the " + elementName);
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to click on element.
	 * @param element <code>WebElement</code>
	 */
	public static void click(WebElement element, String elementName) {
		try {
			element.click();
			logger.info(elementName + " is clicked");
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to clear field.
	 * @param element <code>WebElement</code>
	 */
	public static void clear(WebElement element, String elementName) {
		try {
			element.clear();
			logger.info(elementName + " is cleared");
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to verify check box is selected or not.
	 * @param element <code>WebElement</code>
	 * @param elementName <code>String</code>
	 * @return status <code>boolean</code>
	 */
	public static boolean checkElementIsSelected(WebElement element, String elementName) {
		try {
			String result = element.getDomProperty("value");
			if(result.equals("true")) {
				logger.info(elementName + " is selected");
				return true;
			}
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
		logger.info(elementName + " is \" not \" selected");
		return false;
	}

	/**
	 * @description <bold>this method is used to verify element is enabled or not</bold>
	 * @param element <code>WebElement</code>
	 * @param elementName <code>String</code>
	 * @return <code>boolean</code> -> true if element is enabled otherwise false
	 */
	public static boolean checkElementIsEnabled(WebElement element , String elementName) {
		try {
			boolean result = element.isEnabled();
			if(result) {
				logger.info(elementName + " is enabled");
				return true;
			}
		} catch (Exception exception) {

		}
		logger.info(elementName + " is \" not \" enabled");
		return false;
	}

	/**
	 * @description this method is used to click by using actions class.
	 * @param element <code>WebElement</code>
	 */
	public static void clickByActions(WebElement element, String elementName) {
		try {
			actions.click(element).perform();
			logger.info(elementName + " is clicked");
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to move the cursor to the element and
	 * double click on it.
	 * @param element
	 */
	public static void moveCursorAndDoubleClick(WebElement element, String elementName) {
		try {
			actions.moveToElement(element).doubleClick().perform();
			logger.info("cursor is moved to " + elementName + " and double clicked");
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to move cursor to element and click by
	 * using actions class.
	 * @param element <code>WebElement</code>
	 */
	public static void moveCursorAndClick(WebElement element, String elementName) {
		try {
			actions.moveToElement(element).click().perform();
			logger.info("cursor is mover to " + elementName);
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to double on element by using actions
	 * class.
	 * @param element <code>WebElement</code>
	 */
	public static void doubleClickByActions(WebElement element, String elementName) {
		try {
			actions.doubleClick(element).perform();
			logger.info(elementName + " is double clicked by actions");
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to scroll to element by using actions
	 * class.
	 * @param element <code>WebElement</code>
	 */
	public static void scrollToElementByActions(WebElement element, String elementName) {
		try {
			actions.scrollToElement(element).perform();
			logger.info("page is scrolled to " + elementName + " by actions");
		} catch (Exception exception) {
			Assert.fail("element is not found \n" + exception.getMessage());
		}
	}

	/**
	 * @description this method is used to wait until the given time to find the
	 * element
	 * @param element <code>WebElement</code>
	 * @param elementName <code>String</code>
	 * @param sec <code>int</code>
	 */
	public static boolean waitTillElementIsDisplayedWithinTime(WebElement element, String elementName, int sec) {
		boolean status = false;
		for (int i = 1; i <= sec; i++) {
			logger.info("loading...");
			try {
				status = element.isDisplayed();
				logger.info(elementName + " is displayed within given " + sec + " time period at " + i + " sec");
				return status;
			} catch (Exception e) {
				if (i == sec - 1) {
					logger.error(elementName + " is \"not\" displayed within given " + sec + "time period :: please check below :\n" + e.getMessage());
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		return status;
	}

	/**
	 * @description this method is used to add cookie.
	 * @param cookieName <code>String</code>
	 * @param cookieValue <code>String</code>
	 */
	public static void addCookies(String cookieName, String cookieStatus) {
		Cookie cookie = new Cookie(cookieName, cookieStatus);
		BaseTest.driver.manage().addCookie(cookie);
		logger.info(cookieName + " is added successfully in " + cookieStatus + " status");
	}


	/**
	 * @description this method is used to get text of element
	 * @param element <code>WebElement</code>
	 * @param elementName <code>String</code>
	 * @return textOfElement <code>String</code>
	 */
	public static String getTextFromElement(WebElement element , String elementName) {
		String elementText = "";
		try {
			elementText = element.getText();
			logger.info(elementText+" is text of "+elementName);
		} catch (Exception exception) {
			Assert.fail(elementName+" is not fount :: please check blow\n"+exception.getMessage());
		}
		return elementText;
	}

	/**
	 * @description this method is used to wait till element ready to click
	 * @param element <code>WebElement</WebElement>
	 * @param elementName <code>String</code>
	 */
	public static void waitTillElementClickable(WebElement element , String elementName) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception exception) {
			Assert.fail(elementName+" is not fount :: please check blow\n"+exception.getMessage());
		}
	}

}
