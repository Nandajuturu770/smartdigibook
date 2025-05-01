package web.generic;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	final static Logger logger = LogManager.getLogger(BaseTest.class);

	public static ChromeOptions options;
	public static String URL = "https://reader.smartdigibook.com/";
	public static WebDriver driver;

	@BeforeClass
	public void setupBrowser(){
		logger.info("system is trying to open browser...");
		options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		logger.info("brower is maximized");
		driver.get(URL);
		logger.info("brower is navigated "+URL);
	}

	@AfterClass
	public void tearDownBwoser(){
		driver.close();
	}

}
