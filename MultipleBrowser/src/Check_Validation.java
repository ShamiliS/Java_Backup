import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;;

public class Check_Validation {
	static WebDriver driver;
	static Actions action1;

	public static void main(String arg[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://www.gov.uk/get-vehicle-information-from-dvla");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='get-started']/a")).click();

		WebElement elementOldPage = driver
				.findElement(By.xpath("//input[@class='form-control form-control-1-4 input-upper']"));

		Thread.sleep(2000);

		try {
			elementOldPage.sendKeys("CU57ABC");
		} catch (Exception e) {
			try {
				action1 = new Actions(driver);
				action1.moveToElement(elementOldPage).click().keyDown(elementOldPage, Keys.SHIFT).sendKeys("CU57ABC")
						.keyUp(elementOldPage, Keys.SHIFT).doubleClick();
				action1.build().perform();
				System.out.println("used actions1");
			} catch (Exception e1) {
				try {
					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("arguments[0].value='CU57ABC';", elementOldPage);
					System.out.println("used JavaScript type 1");
				} catch (Exception e2) {
					try {
						JavascriptExecutor jse = (JavascriptExecutor) driver;
						jse.executeScript("document.getElementById('elementOldPage').value='CU57ABC';");
						System.out.println("used JavaScript type 2");
					} catch (Exception e3) {
						action1 = new Actions(driver);
						action1.moveToElement(elementOldPage).sendKeys("CU57ABC");
						action1.build().perform();
						System.out.println("used actions2");
					}
				}
			}
		}
	}
}
