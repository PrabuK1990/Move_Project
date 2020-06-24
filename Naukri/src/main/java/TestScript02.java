
public class TestScript02 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 1 : To Verify the Naukri Login Functionality");
		
		//Create Instance ProjectReusables
		//Create Instance NaukriHomePageReusables
		//Create Instance NaukriLoginPageReusables
		
		ProjectReusables naukri= new ProjectReusables();
		NaukriHomePageReusbales naukriHomePage = new NaukriHomePageReusbales();
		NaukriLoginPageReusables naukriLoginPage = new NaukriLoginPageReusables();		
		
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//naukriLoginLink, naukriEmail(), naukriPassword(), naukriLogin() and closeBrowser() 
		
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.waitElement();
		naukriHomePage.naukriLoginLink();
		naukri.waitElement();
		naukriLoginPage.naukriEmailField();
		naukriLoginPage.naurkiPasswordField();
		naukriLoginPage.naukriLoginButton();
		naukri.closeAllBrowser();
		
		System.out.println("Login functionaly working as expected");

	}

}
