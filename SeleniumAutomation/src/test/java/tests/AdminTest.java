package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;

public class AdminTest extends BaseTest {

	@Test(groups = {"smoke"})
	public void verifyAdminSearch() {
		
		LoginPage loginPage = new LoginPage(driver);
		System.out.println("Entering valid credentials...");
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		System.out.println("Clicking on Admin menu...");
		dashboardPage.clickAdminMenu();
		
		AdminPage adminPage = new AdminPage(driver);
		System.out.println("Searching for user named 'Admin'..");
		adminPage.searchByUsername("Admin");
		adminPage.clickSearchButton();		
	}
	
}
