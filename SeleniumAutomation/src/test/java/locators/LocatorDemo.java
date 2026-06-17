package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement usernameId = driver.findElement(By.id("username"));
		usernameId.sendKeys("tomsmith");
		
		WebElement passwordByName = 
				driver.findElement(By.name("password"));
		passwordByName.sendKeys("SuperSecretPassword!");
		
		WebElement loginButtonByTag = 
				driver.findElement(By.tagName("button"));

		WebElement subheaderByClass = 
				driver.findElement(By.className("subheader"));
		System.out.println("Subheader test: " 
				+ subheaderByClass.getText());
		
		loginButtonByTag.click();
		
		Thread.sleep(2000);
		
		WebElement successMessageByCss = 
				driver.findElement(By.cssSelector("div.flash.success"));
		System.out.println("Message: " + successMessageByCss.getText());
		
		WebElement logoutButtonByXPath = 
				driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']"));
		logoutButtonByXPath.click();
		Thread.sleep(2000);
		
		WebElement elementalSeleniumLink =
				driver.findElement(By.linkText("Elemental Selenium"));
		WebElement partialLink =
				driver.findElement(By.partialLinkText("Elemental"));
		
		System.out.println("Link Text points to URL: " 
				+ elementalSeleniumLink.getAttribute("href"));
		System.out.println("Partial Link points to URL: " 
				+ partialLink.getAttribute("href"));
		
		driver.quit();
	}

}













