package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	public WaitUtils() {
		// To Defeat the Instantiation of this class!
	}

	public static WebElement waitForClickable(WebDriver driver
			, By locator, int timeoutInSeconds) {
		
		WebDriverWait wait = new WebDriverWait(driver
				, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static WebElement waitForVisibility(WebDriver driver
			, By locator, int timeoutInSeconds) {
		
		WebDriverWait wait = new WebDriverWait(driver
				, Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
