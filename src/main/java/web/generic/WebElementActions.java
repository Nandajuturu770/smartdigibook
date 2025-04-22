package web.generic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class WebElementActions {

	final static Logger logger = LogManager.getLogger(WebElementActions.class);

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
			logger.info(elementName + "is \" not \" is not displayed");
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
	 * @description this method is used to click by using actions class.
	 * @param element <code>WebElement</code>
	 */
	public static void clinkByActions(WebElement element, String elementName) {
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
		for (int i = 0; i < sec; i++) {
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
	public void addCookies(String cookieName, String cookieValue) {
		Cookie cookie = new Cookie(cookieName, cookieValue);
		BaseTest.driver.manage().addCookie(cookie);
		logger.info(cookieName + " is added successfully in " + cookieValue + " status");
	}
	

	/**
	 * @description this method is used to get text of element
	 * @param element <code>WebElement</code>
	 * @param elementName <code>String</code>
	 * @return textOfElement <code>String</code>
	 */

	public String getTextFromElement(WebElement element , String elementName) {
		String elementText = "";
		try {
			elementText = element.getText();
			logger.info(elementText+" is text of "+elementName);
		} catch (Exception exception) {
			Assert.fail(elementName+" is not fount :: please check blow\n"+exception.getMessage());
		}
		return elementText;
	}

}
