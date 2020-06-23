
public class TestScript02 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 1 : To Verify the Naukri Login Functionality");
		
		//Create an instance of class "NaukriLoginPage" and store it in an object and name it as "naukri"
		NaukriLoginPageReusables naukri = new NaukriLoginPageReusables();
		
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//naukriLoginLink, naukriEmail(), naukriPassword(), naukriLogin() and closeBrowser() 
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.naukriLoginLink();
		naukri.waitElement();
		naukri.naukriEmailField();
		naukri.naurkiPasswordField();
		naukri.naukriLoginButton();
		naukri.waitElement();
		naukri.naukriLoginErrMsg();
		naukri.closeAllBrowser();
		
		System.out.println("Login functionaly working as expected");

	}

}
