package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println("First Website Title: " + pageTitle);
		
		driver.get("https://demo.opencart.com/");
		String newpageTitle = driver.getTitle();
		System.out.println("Second Website Title: " + newpageTitle);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + currentUrl);
		
		driver.quit();
		
	}
	
}
