import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriHomePageReusbales extends ProjectReusables implements NaukriHomePageInputs, NaukriHomePageControls{
	
	//Read/Validate/Verify Alert Message in Home Page
	public void naukriAlertMessage()
	{
		String actualAlterMessage = naukri.findElement(By.xpath("//span[@class='_stepUpHeaderTitle']")).getText();
		
		if(HomePageInputs_ExpectedAlertMessage.equals(actualAlterMessage))
		{
			//If expected is eaual to actual condition is true(Then the following code will execute othwise following code will not execute) in Login Page
			System.out.println("CORRECT ALERT MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expecated Alert Message : " + HomePageInputs_ExpectedAlertMessage);
			System.out.println("Actual Alert Message : " + actualAlterMessage);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
		
		else 	
		{
			//If expected is eaual to actual condition is false(Then the following code will execute) in Login Page
			System.out.println("INCORRECT ALERT MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Alert Message : " + HomePageInputs_ExpectedAlertMessage);
			System.out.println("Actual Alert Message : " + actualAlterMessage);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	//Click Visit Career Button Link in Home Page	
	public void naukariCareerButtonLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CareerButtonLink)).click();
	}
	
	//Click Jobs Link in Home Page
	public void naukriJobsLink()
	{
		naukri.findElement(By.xpath(HomePageControls_JobsLink)).click();
	}	
	//Click Recuriters Link in Home Page
	public void naukriRecuriterLink()
	{
		naukri.findElement(By.xpath(HomePageControls_RecuritersLink)).click();
	}	
	//Click Companies Link in Home Page	
	public void naukariCompanysLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CompanysLink)).click();
	}	
	//Click Tools Link in Home Page	
	public void naukariToolLink()
	{
		naukri.findElement(By.xpath(HomePageControls_ToolLink)).click();
	}	
	//Click Services Link in Home Page
	public void naukariServiceLink()
	{
		naukri.findElement(By.xpath(HomePageControls_ServiceLink)).click();
	}	
	//Click More Link in Home Page
	public void naukariMoreLink()
	{
		naukri.findElement(By.xpath(HomePageControls_MoreLink)).click();
	}	
	//Click Login Link in Home Page
	public void naukriLoginLink()
	{
		naukri.findElement(By.xpath(LoginPageControls_LoginLink)).click();
	}	
	//Enter Designation Text in Home Page
	public void naukriDesignationText()
	{
		naukri.findElement(By.xpath(HomePageControls_DeginationText)).sendKeys("QA");
	}	
	//Enter Locations Text in Home Page
	public void naukriLocationText()
	{
		naukri.findElement(By.xpath(HomePageControls_LocationText)).sendKeys("Hyderabad");
	}	
	//Click Search Button Link in Home Page
	public void naukriSearchButtonLink()
	{
		naukri.findElement(By.xpath(HomePageControls_SearchButton)).click();
	}
	//Click Register Button Link in Home Page
	public void naukriRegisterButton()
	{
		naukri.findElement(By.xpath(HomePageControls_RegisterButton)).click();
	}
	//Click Upload CV Link in Home Page
	public void naukriUploadCVLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CVUploadLink)).click();
	}	
	//Click Experienced Button in Home Page
	public void naukriExperiencedButton()
	{
		naukri.findElement(By.xpath(HomePageControls_ExperienceButton)).click();
	}	
	//Click Take Survey Link in Home Page
}
