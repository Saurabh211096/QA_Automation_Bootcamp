package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class DashboardPage {

	private WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By searchInputField = By.xpath("//input[@placeholder='Search']");
	private By pimButton = By.xpath("//span[text()='PIM']");
	private By adminButton = By.xpath("//span[text()='Admin']");
	
	public void searchMenu(String text) {
		WaitUtils.waitForVisibility(driver, searchInputField, 10).sendKeys(text);
	}
	public void clickPimMenu() {
		WaitUtils.waitForClickable(driver, pimButton, 10).click();
	}
	public void clickAdminMenu() {
		WaitUtils.waitForClickable(driver, adminButton, 10).click();
	}
}
