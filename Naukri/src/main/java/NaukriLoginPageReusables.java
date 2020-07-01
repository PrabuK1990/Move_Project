import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLoginPageReusables extends ProjectReusables implements LoginPageControls, NaukriHomePageInputs, NaukriHomePageControls {
		
	//Enter Naukri Username/Email in Login Page
	public void naukriEmailField()
	{
		naukri.findElement(By.xpath(LoginPageControls_EmailIDField)).sendKeys(LoginPageInputs_EmailID);
	}
		
	//Enter Naukri Password in Login Page
	public void naurkiPasswordField()
	{
		naukri.findElement(By.xpath(LoginPageControls_PasswordField)).sendKeys(LoginPageInputs_Password);	
	}			
		
	//Click Login Button in Login Page
	public void naukriLoginButton() 
	{
		naukri.findElement(By.xpath(LoginPageControls_LoginButton)).click();
	}
	
	//Validate Credentials Error Message in Login Page
	public void naukriLoginErrMsg()
	{	
		String actualErrorMsgCombination = naukri.findElement(By.xpath(LoginPageControls_NaukriLoginErrMsg)).getText();
		
		if (LoginPageInputs_ExpectedErrorMsgCombination.equals(actualErrorMsgCombination))
		{
			//If expected is eaual to actual condition is true(Then the following code will execute othwise following code will not execute) in Login Page
			System.out.println(LoginPageInputs_CorrectCombiation);
			System.out.println(LoginPageInputs_LineBreak);
			System.out.println(LoginPageInputs_CombinationExp + LoginPageInputs_ExpectedErrorMsgCombination);
			System.out.println(LoginPageInputs_CombinationAct + actualErrorMsgCombination);
			System.out.println(LoginPageInputs_LineBreak);
		}
	
		else 	
		{
			//If expected is eaual to actual condition is false(Then the following code will execute) in Login Page
			System.out.println("INCORRECT COMBINATION ERROR MESSAGE");
			System.out.println(LoginPageInputs_LineBreak);
			System.out.println(LoginPageInputs_CombinationExp + LoginPageInputs_ExpectedErrorMsgCombination);
			System.out.println(LoginPageInputs_CombinationAct + actualErrorMsgCombination);
			System.out.println(LoginPageInputs_LineBreak);
		}
	}
	
	//Validate Email error message in Login Page
	
	public void naukriEmailErrMsg()
	{
		String actualErrorMsgEmailField = naukri.findElement(By.xpath(LoginPageControls_naukriEmailErrMsg)).getText();
		
		if (LoginPageInputs_ExpectedErrorMsgEmailField.equals(actualErrorMsgEmailField))
		{ 
			//If expected is eaual to actual condition is true(Then the following code will execute othwise following code will not execute) in Login Page
			System.out.println(LoginPageInputs_CorrectEmail);
			System.out.println(LoginPageInputs_LineBreak);
			System.out.println(LoginPageInputs_EmailExp + LoginPageInputs_ExpectedErrorMsgEmailField);
			System.out.println(LoginPageInputs_EmailAct + actualErrorMsgEmailField);
			System.out.println(LoginPageInputs_LineBreak);
		}
	
		else 	
		{
			//If expected is eaual to actual condition is false(Then the following code will execute) in Login Page
			System.out.println(LoginPageInputs_IncorrectEmail);
			System.out.println(LoginPageInputs_LineBreak);
			System.out.println(LoginPageInputs_EmailExp + LoginPageInputs_ExpectedErrorMsgEmailField);
			System.out.println(LoginPageInputs_EmailAct + actualErrorMsgEmailField);
			System.out.println(LoginPageInputs_LineBreak);
		}
			
	}
		
	//Validate Password error message in Login Page
	
	public void naukriPasswordErrMsg()
	{
		
		
		String actualErrorMsgPasswordField = naukri.findElement(By.xpath(LoginPageControls_naukriPasswordErrMsg)).getText();
		
		if (LoginPageInputs_ExpectedErrorMsgPasswordField.equals(actualErrorMsgPasswordField))
		{
			System.out.println(LoginPageInputs_CorrectPassword);
			System.out.println(LoginPageInputs_LineBreak);
			System.out.println(LoginPageInputs_PasswordExp + LoginPageInputs_ExpectedErrorMsgPasswordField);
			System.out.println(LoginPageInputs_PasswordAct + actualErrorMsgPasswordField);
			System.out.println(LoginPageInputs_LineBreak);
		}
	
		else 	
		{
			System.out.println(LoginPageInputs_IncorrectPassword);
			System.out.println(LoginPageInputs_LineBreak);
			System.out.println(LoginPageInputs_PasswordExp + LoginPageInputs_ExpectedErrorMsgPasswordField);
			System.out.println(LoginPageInputs_PasswordAct + actualErrorMsgPasswordField);
			System.out.println(LoginPageInputs_LineBreak);
		}
			
	}

}