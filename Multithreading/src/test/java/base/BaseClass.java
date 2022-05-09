package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	private static void setDriver(WebDriver driver) {
		BaseClass.driver.set(driver);
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	@Parameters({ "browser" })
	@BeforeMethod
	synchronized public void initBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			setDriver(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			setDriver(new FirefoxDriver());
		}
		getDriver().get("https://linkedin.com");
	}

	@AfterMethod
	public void closeBowser() {
		if (getDriver() != null) {
			getDriver().quit();
		}
	}
}
