import org.openqa.selenium.By;

public class NaukriRegisterPageReusbales extends ProjectReusables implements NaukriHomePageInputs, NaukriHomePageControls{

	//Enter Name Field in Register Page
	public void naukriNameField()
	{
		naukri.findElement(By.xpath(HomePageControls_NameField)).sendKeys(HomePageInputs_Name);
	}
	
	//Enter Email ID in Register Page 
	public void naukriEmailIDField()
	{
		naukri.findElement(By.xpath(HomePageControls_EmailField)).sendKeys(HomePageInputs_EmailID);
	}
	
	//Enter Password in Register Page
	public void naukriPasswordField()
	{
		naukri.findElement(By.xpath(HomePageControls_PasswordField)).sendKeys(HomePageInputs_PasswordField);
	}
	
	//Enter Mobile NUmber in Register Page
	public void naukriMobileNumberField()
	{
		naukri.findElement(By.xpath(HomePageControls_MobileNumberField)).sendKeys(HomePageInputs_MobileNumber);
	}
	
	//Click RegisterButton in Register Page
	public void naukriRegisterNowButton()
	{
		naukri.findElement(By.xpath(HomePageControls_RegisterNowButton)).click();
	}
	
	//Wait method
	public void waitMethod()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void closeAllBrowser() {
		naukri.quit();
		
	}
}
