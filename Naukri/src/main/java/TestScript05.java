
public class TestScript05 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 5 : To Verify the Naukri Register Page Functionality");
		
		//Create an instance of class "NaukriHomePageReusbales" and store it in an object and name it as "naukriHomePage"
		
		NaukriHomePageReusbales TestScript05 = new  NaukriHomePageReusbales();
		
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//clickRegisterforFreeLink, ClickIamExperiencedButton,  Enter Name, Enter Email, Create Password, Mobile Number and Click Upload resume and close browser
		
		TestScript05.setPathChromeDriver();
		TestScript05.chromeBrowser();
		TestScript05.maximizeWindow();
		TestScript05.naukariUrl();
		TestScript05.waitMethod();
		TestScript05.naukriRegisterButton();
		TestScript05.naukariExperirncedButton();
		TestScript05.naukariNameField();
		TestScript05.naukariPasswordField();
		TestScript05.naukariMobileNumberField();
		TestScript05.waitMethod();
		TestScript05.closeAllBrowser();
		
		System.out.println("***Error Message Validation for ***");

	}

}
