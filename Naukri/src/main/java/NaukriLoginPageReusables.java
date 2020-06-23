import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLoginPageReusables implements LoginPageInputs, LoginPageControls {
	
	//Set Path for chrome driver
	public WebDriver move;
		
	//Path setup for chromedriver executable file
	public void setPathChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	
	//Launch Chrome Browser	
	public void chromeBrowser()			
	{				
		move = new ChromeDriver();
	}
		
	//Maximize Browser	
	public void maximizeWindow()
	{
		move.manage().window().maximize();
	}			
		
	//Enter Naukri Url
	public void naukriUrl()
	{
		move.get(LoginPageInputs_Url);
	}
	
	//Click Login Link
	public void naukriLoginLink()
	{
		move.findElement(By.xpath(LoginPageControls_LoginLink)).click();
	}
		
	//Enter Naukri Username/Email
	public void naukriEmailField()
	{
		move.findElement(By.xpath(LoginPageControls_EmailIDField)).sendKeys(LoginPageInputs_EmailID);
	}
		
	//Enter Naukri Password
	public void naurkiPasswordField()
	{
		move.findElement(By.xpath(LoginPageControls_PasswordField)).sendKeys(LoginPageInputs_Password);	
	}			
		
	//Click Login Button
	public void naukriLoginButton() 
	{
		move.findElement(By.xpath(LoginPageControls_LoginButton)).click();
	}
	
	//Validate Credentials Error Message
	public void naukriLoginErrMsg()
	{	
		String actualErrorMsgCombination = move.findElement(By.xpath(LoginPageControls_NaukriLoginErrMsg)).getText();
		
		if (LoginPageInputs_ExpectedErrorMsgCombination.equals(actualErrorMsgCombination))
		{
			//If expected is eaual to actual condition is true(Then the following code will execute othwise following code will not execute)
			System.out.println("CORRECT COMBINATION ERROR MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expecated Combination Error Message : " + LoginPageInputs_ExpectedErrorMsgCombination);
			System.out.println("Actual Combination Error Message : " + actualErrorMsgCombination);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	
		else 	
		{
			//If expected is eaual to actual condition is false(Then the following code will execute)
			System.out.println("INCORRECT COMBINATION ERROR MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Combination Error Message : " + LoginPageInputs_ExpectedErrorMsgCombination);
			System.out.println("Actual Combination Error Message : " + actualErrorMsgCombination);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	//Validate Email error message
	
	public void naukriEmailErrMsg()
	{
		String actualErrorMsgEmailField = move.findElement(By.xpath(LoginPageControls_naukriEmailErrMsg)).getText();
		
		if (LoginPageInputs_ExpectedErrorMsgEmailField.equals(actualErrorMsgEmailField))
		{
			//If expected is eaual to actual condition is true(Then the following code will execute othwise following code will not execute)
			System.out.println("CORRECT EMAIL ERROR MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Email Error Message : " + LoginPageInputs_ExpectedErrorMsgEmailField);
			System.out.println("Actual Email Error Message : " + actualErrorMsgEmailField);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	
		else 	
		{
			//If expected is eaual to actual condition is false(Then the following code will execute)
			System.out.println("INCORRECT EMAIL ERROR MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Email Error Message : " + LoginPageInputs_ExpectedErrorMsgEmailField);
			System.out.println("Actual Email Error Message : " + actualErrorMsgEmailField);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
			
	}
		
	//Validate Password error message
	
	public void naukriPasswordErrMsg()
	{
		
		
		String actualErrorMsgPasswordField = move.findElement(By.xpath(LoginPageControls_naukriPasswordErrMsg)).getText();
		
		if (LoginPageInputs_ExpectedErrorMsgPasswordField.equals(actualErrorMsgPasswordField))
		{
			System.out.println("CORRECT PASSWORD ERROR MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Password Error Message : " + LoginPageInputs_ExpectedErrorMsgPasswordField);
			System.out.println("Actual Password Error Message : " + actualErrorMsgPasswordField);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	
		else 	
		{
			System.out.println("CORRECT PASSWORD ERROR MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Password Error Message : " + LoginPageInputs_ExpectedErrorMsgPasswordField);
			System.out.println("Actual Password Error Message : " + actualErrorMsgPasswordField);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
			
	}
		
	//Close Browser
	public void closeBrowser()
	{
		move.close();
	}
	
	//Close All Browser Instance Opened
	public void closeAllBrowser()
	{
		move.quit();
	}
	
	//Wait for Element to be displayed
	public void waitElement()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}