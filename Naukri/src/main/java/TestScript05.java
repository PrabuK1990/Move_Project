
public class TestScript05 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 5 : To Verify the Naukri Register Page Functionality");
		
		
		//Create Instance for ProjectReusables
		//Create Instance for NaukriHomePageReusables
		//Create Instance for NaukriRegisterReusables
		
		ProjectReusables naukri = new ProjectReusables();
		NaukriHomePageReusbales naukriHomePage = new NaukriHomePageReusbales();
		NaukriRegisterPageReusbales naukriRegisterPage = new NaukriRegisterPageReusbales();		
				
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//clickRegisterforFreeLink, ClickIamExperiencedButton,  Enter Name, Enter Email, Create Password, Mobile Number and Click Upload resume and close browser
				
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.waitElement();
		naukriHomePage.naukriRegisterButton();
		naukri.waitElement();
		naukriHomePage.naukriExperiencedButton();
		naukri.waitElement();
		naukriRegisterPage.naukriNameField();
		naukriRegisterPage.naukriEmailIDField();
		naukriRegisterPage.naukriPasswordField();
		naukriRegisterPage.naukriMobileNumberField();
		naukri.closeAllBrowser();			
		
		System.out.println("***Error Message Validation for ***");

	}

}
