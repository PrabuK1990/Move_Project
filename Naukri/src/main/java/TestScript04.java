
public class TestScript04 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 4 : To Validate Email Id and Password in Naukri Register");
		
		//Create an new instance of class "NaukriHomePageReusbales" and store it in an object and name it as "naukriHomePage" and mention typ/interfacee as "NaukriHomePageReusbales"
		
		ProjectReusables naukri = new ProjectReusables();
		NaukriHomePageReusbales naukriHomePage = new NaukriHomePageReusbales();
		NaukriRegisterPageReusbales naukriRegisterPage = new NaukriRegisterPageReusbales();
		
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//clickRegisterforFreeButton, ClickIamExperiencedButton, validate Email, work exp, Mobile Number, total exp and createpassword error message
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.waitElement();
		naukriHomePage.naukriRegisterButton();
		naukri.waitElement();
		naukriHomePage.naukriExperiencedButton();
		naukri.waitElement();
		naukriRegisterPage.naukriEmailIDField();
		naukriRegisterPage.naukriMobileNumberField();
		naukri.closeAllBrowser();
		
		
		System.out.println("***Validation for Email ID and Mobile Number register fields***");

	}

}
