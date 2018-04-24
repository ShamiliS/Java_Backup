import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Grid_2 {

	WebDriver driver;
	String baseURL, nodeURL;
	
	private static final Logger LOGGER = Logger.getLogger(log.get.getName());


	@BeforeTest
	public void setUp() throws MalformedURLException {
		baseURL = "http://demo.guru99.com/test/guru99home/";
		nodeURL = "http://10.36.208.201:3333/wd/hub";
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void sampleTest() {
		driver.get(baseURL);

		if (driver.getPageSource().contains("MOBILE TESTING")) {
			
			Actions ac = new Actions(driver);
			ac.doubleClick((WebElement) By.id("test"));
			ac.doubleClick(By.ById("text"));
			
			Assert.assertTrue(true, "Mobile Testing Link Found");
		} else {
			Assert.assertTrue(false, "Failed: Link not found");
		}

	}
}
