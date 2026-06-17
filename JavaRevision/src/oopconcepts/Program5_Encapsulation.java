package oopconcepts;

class TestEnvironment {
	private String browser = "Chrome";
	private String baseUrl = "";
	
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String newBrowser) {
		if (newBrowser.equals("Chrome") || newBrowser.equals("Firefox")) {
			this.browser = newBrowser;
			System.out.println("Browser set to: " + this.browser);
		} else {
			System.out.println("Invalid browser: " + newBrowser 
					+ ". Keeping current: " + this.browser);
		}
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String newUrl) {
		this.baseUrl = newUrl;
		System.out.println("URL set: " + newUrl);
	}
}

public class Program5_Encapsulation {

	public static void main(String[] args) {
		
		TestEnvironment env = new TestEnvironment();
		
		env.setBrowser("Opera");
		env.setBrowser("Firefox");
		env.setBaseUrl("https://qa-env.com");

	}

}















