package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class LoginPage {

	private WebDriver driver;
	
	private By usernameInput = By.xpath("//input[@name='username']");
	private By passwordInput = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		WaitUtils.waitForVisibility(driver, usernameInput, 10).sendKeys(username);
	}
	public void enterPassword(String password) {
		WaitUtils.waitForVisibility(driver, passwordInput, 10).sendKeys(password);
	}
	public void clickLogin() {
		WaitUtils.waitForClickable(driver, loginButton, 10).click();
	}
}
