package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		String browserType = ConfigReader.getProperty("browser");
		System.out.println("Starting browser: " + browserType);
		
		switch (browserType.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser specified. Defaulting to Chrome");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(ConfigReader.getProperty("url"));
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("Closing browser...");
		if (driver != null) {
			driver.quit();
		}
	}
	
}
