package oopconcepts;

class UserAccount {
	String username;
	String password;
	
	public void login() {
		System.out.println("Logging in with user: " + username);
	}
}

public class Program1_ClassesObjects {

	public static void main(String[] args) {
		
		UserAccount admin = new UserAccount();
		
		admin.username = "admin@store.com";
		admin.password = "Admin123";
		
		admin.login();

	}

}
