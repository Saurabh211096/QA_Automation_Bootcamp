package oopconcepts;

class BasePage {
	String pageUrl = "https://ecommerce.com/";
	
	public void openBrowser() {
		System.out.println("Opening browser and navigating to base URL...");
	}
}
class LoginPage extends BasePage {
	String loginPath = "login";
	
	public void navigateToLogin() {
		System.out.println("Navigating to: " + pageUrl + loginPath);
	}
}

public class Program2_Inheritance {

	public static void main(String[] args) {
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.openBrowser();
		loginPage.navigateToLogin();

	}

}
