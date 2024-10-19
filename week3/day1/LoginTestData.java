package week3.day1;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Enter the username");
	}
	public void enterPassord() {
		System.out.println("Enter the password");
	}

	public static void main(String[] args) {
		LoginTestData obj=new LoginTestData();
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassord();
	

	}

}
