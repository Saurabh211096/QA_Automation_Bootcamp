package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage loginPage = new LoginPage(driver);
		
		System.out.println("Entering Credentials...");
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		
		System.out.println("Clicking login...");
		loginPage.clickLogin();
		
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("dashboard")) {
			System.out.println("Test Passed: Successfully navigated to Dashboard.");
		} else {
			System.out.println("Test Failed: Not on Dashboard.");
		}
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		dashboardPage.clickAdminMenu();
		
		AdminPage adminPage = new AdminPage(driver);
		System.out.println("Searching for Admin user...");
		adminPage.searchByUsername("Admin");
		adminPage.clickSearchButton();
		
		driver.quit();
		
	}
	
}
