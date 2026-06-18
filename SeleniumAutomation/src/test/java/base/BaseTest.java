package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		System.out.println("Starting browser...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("Closing browser...");
		if (driver != null) {
			driver.quit();
		}
	}
	
}
