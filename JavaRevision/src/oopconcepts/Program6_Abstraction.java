package oopconcepts;

interface BrowserDriver {
	void openBrowser();
	void navigateTo(String url);
	void takeScreenshot();
}
class MyChromeDriver implements BrowserDriver {
	@Override
	public void openBrowser() {
		System.out.println("Starting ChromeDriver.exe behind the scenes...");
		System.out.println("Chrome Browser opened.");
	}
	@Override
	public void navigateTo(String url) {
		System.out.println("Chrome is routing network traffic to: " + url);
	}
	@Override
	public void takeScreenshot() {
		System.out.println("Saving .png using ChromeDevTools");
	}
}
class MyFirefoxDriver implements BrowserDriver {
	@Override
	public void openBrowser() {
		System.out.println("Starting GeckoDriver.exe behind the scenes...");
		System.out.println("Firefox Browser opened.");
	}
	@Override
	public void navigateTo(String url) {
		System.out.println("Firefox is routing network traffic to: " + url);
	}
	@Override
	public void takeScreenshot() {
		System.out.println("Saving .png using Firefox internal API");
	}
}

public class Program6_Abstraction {

	public static void main(String[] args) {

		BrowserDriver driver = new MyChromeDriver();
		driver.openBrowser();
		driver.navigateTo("https://ecommerce.com");
		driver.takeScreenshot();
		
	}

}
