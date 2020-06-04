
public class TestScript04 {

	public static void main(String[] args) {
		LoginPage test04 =  new LoginPage();
		test04.setPath();
		test04.chromeBrowser();
		test04.maximizeWindow();
		test04.moveUrl();
		test04.browserPopup();
		test04.emailField();
		test04.passwordField();
		test04.loginButton();
		test04.closeBrowser();
		
		System.out.println("Scenario 4: Launch browser, maximize browser, enter url, close pop-up, enter email-id, enter password, click login button and close browser");
		

	}

}
