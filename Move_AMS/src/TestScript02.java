
public class TestScript02 {

	public static void main(String[] args) {
		
		LoginPage test02 = new LoginPage();
		test02.setPath();
		test02.chromeBrowser();
		test02.maximizeWindow();
		test02.moveUrl();
		test02.browserPopup();
		test02.emailField();
		test02.loginButton();
		test02.browserPopup();
		//test02.closeBrowser();
		System.out.println("Scenario 2: Launch browser, maximize browser, enter url, close pop-up, enter email-id, click login button and close browser");

	}

}
