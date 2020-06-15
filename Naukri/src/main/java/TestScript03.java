
public class TestScript03 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 1 : To Verify the Naukri Login Functionality");
		
		//Create an instance of class "NaukriLoginPage" and store it in an object and name it as "naukri"
		NaukariLogin naukri = new NaukariLogin();
		
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//naukriLoginLink, naukriLoginButton(),  Validate email error message, validate password error message and closeBrowser()
		
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.naukriLoginLink();
		naukri.waitElement();
		naukri.naukriLoginButton();
		naukri.waitElement();
		naukri.naukriEmailErrMsg();
		naukri.naukriPasswordErrMsg();
		naukri.closeAllBrowser();
		
		System.out.println("***Error Message Validation for Email ID and Password Completed***");
	}

}
