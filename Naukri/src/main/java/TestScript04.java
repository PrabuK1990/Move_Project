
public class TestScript04 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 4 : To Validate the Naukri Register Page Error Message");
		
		//Create an new instance of class "NaukriHomePageReusbales" and store it in an object and name it as "testScript04" and mention typ/interfacee as "NaukriHomePageReusbales"
		
		NaukriHomePageReusbales testScript04 = new NaukriHomePageReusbales();
		
		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl()
		//clickRegisterforFreeLink, ClickIamExperiencedButton,  ClickRegisterButton, validate Email, work exp, Mobile Number, total exp and createpassword error message
		
		testScript04.setPathChromeDriver();
		testScript04.chromeBrowser();
		testScript04.maximizeWindow();
		testScript04.naukariUrl();
		testScript04.waitMethod();
		testScript04.naukriRegisterButton();
		testScript04.waitMethod();
		testScript04.naukariExperirncedButton();
		testScript04.waitMethod();
		testScript04.naukariEmailIDField();
		testScript04.waitMethod();
		testScript04.naukariPasswordField();
		testScript04.naukariMobileNumberField();
		
		System.out.println("***Error Message Validation for ***");

	}

}
