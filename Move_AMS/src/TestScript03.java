
public class TestScript03 {

	public static void main(String[] args) {
		
		LoginPage test03 = new LoginPage();
		test03.setPath();
		test03.chromeBrowser();
		test03.maximizeWindow();
		test03.moveUrl();
		test03.browserPopup();
		test03.passwordField();
		test03.loginButton();
		test03.closeBrowser();	
		
		System.out.println("Scenario 3: Launch browser, maximize browser, enter url, close pop-up, enter password, click login button and close browser");
		

	}

}
