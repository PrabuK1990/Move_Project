
public class TestScript03 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 3 : To Verify the Naukri Login Functionality");
		

		//Create Instance ProjectReusables
		//Create Instance NaukriHomePgaeReusables
		//Create Instance NaukriLoginPageReusables
		
		ProjectReusables naukri = new ProjectReusables();
		NaukriHomePageReusbales naukriHomePage =  new NaukriHomePageReusbales();
		NaukriLoginPageReusables naukriLoginPage = new NaukriLoginPageReusables();		
				
		
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//naukriLoginLink, naukriLoginButton(),  Validate email error message, validate password error message and closeBrowser()
		
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.waitElement();
		naukriHomePage.naukriLoginLink();
		naukri.waitElement();
		naukriLoginPage.naukriLoginButton();
		naukriLoginPage.naukriEmailErrMsg();
		naukriLoginPage.naukriPasswordErrMsg();
		naukri.closeAllBrowser();
		
		System.out.println("***Error Message Validation for Email ID and Password Completed***");
	}

}
