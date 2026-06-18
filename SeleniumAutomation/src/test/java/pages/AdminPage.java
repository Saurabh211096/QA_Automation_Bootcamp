package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class AdminPage {

	private WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By usernameInputBox = By.xpath("//label[text()='Username']/parent::div/following-sibling::div//input");
	private By searchButton = By.xpath("//button[@type='submit']");
	
	public void searchByUsername(String username) {
		WaitUtils.waitForVisibility(driver, usernameInputBox, 10).sendKeys(username);
	}
	public void clickSearchButton() {
		WaitUtils.waitForClickable(driver, searchButton, 10).click();
	}
}
