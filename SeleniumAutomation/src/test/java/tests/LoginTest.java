package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1, groups = {"smoke", "regression"})
	public void verifyValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		
		System.out.println("Entering valid credentials...");
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("dashboard")
				, "Login Failed: Dashboard URL not found.");
		System.out.println("Assertion Passed: Successfully navigated"
				+ " to Dashboard.");
	}
	
	@Test(priority = 2, groups = {"regression"})
	public void verifyInvalidLogin() {
		LoginPage loginpage = new LoginPage(driver);
		
		System.out.println("Entering invalid credentials"
				+ " (invalid password)");
		loginpage.enterUsername("Admin");
		loginpage.enterPassword("wrongpassword");
		loginpage.clickLogin();
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertFalse(currentUrl.contains("dashboard")
				, "(Error!) Login Successful: Dashboard URL found");
		System.out.println("Assertion Passed: Failed to navigate to"
				+ " Dashboard with invalid password.");
	}

//	public static void main(String[] args) {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
//		LoginPage loginPage = new LoginPage(driver);
//		
//		System.out.println("Entering Credentials...");
//		loginPage.enterUsername("Admin");
//		loginPage.enterPassword("admin123");
//		
//		System.out.println("Clicking login...");
//		loginPage.clickLogin();
//		
//		String currentUrl = driver.getCurrentUrl();
//		if (currentUrl.contains("dashboard")) {
//			System.out.println("Test Passed: Successfully navigated to Dashboard.");
//		} else {
//			System.out.println("Test Failed: Not on Dashboard.");
//		}
//		
//		DashboardPage dashboardPage = new DashboardPage(driver);
//		dashboardPage.clickAdminMenu();
//		
//		AdminPage adminPage = new AdminPage(driver);
//		System.out.println("Searching for Admin user...");
//		adminPage.searchByUsername("Admin");
//		adminPage.clickSearchButton();
//		
//		driver.quit();
//		
//	}
	
}
