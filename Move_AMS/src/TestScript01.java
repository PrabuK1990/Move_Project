
public class TestScript01 {

	public static void main(String[] args) {
		
		LoginPage test01 = new LoginPage();
		
		test01.setPath();
		test01.chromeBrowser();
		test01.maximizeWindow();
		test01.moveUrl();
		test01.browserPopup();
		test01.loginButton();
		test01.closeBrowser();
		
		System.out.println("Scenario 1: Launch browser, maximize browser, enter url, close pop-up, click login button and close browser");

	}

}
