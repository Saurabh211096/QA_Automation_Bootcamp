package oopconcepts;

class WaitHelper {
	public void waitForElement(int timeoutInSeconds) {
		System.out.println("Waiting for " + timeoutInSeconds 
				+ " seconds.");
	}
	public void waitForElement(int timeoutInSeconds, String elementName) {
		System.out.println("Waiting for " + timeoutInSeconds 
				+ " seconds for element: " + elementName);
	}
}

public class Program3_Polymorphism {

	public static void main(String[] args) {

		WaitHelper wait = new WaitHelper();
		
		wait.waitForElement(5);
		wait.waitForElement(10, "Login Button");
		
	}

}
