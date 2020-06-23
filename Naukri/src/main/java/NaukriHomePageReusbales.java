import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriHomePageReusbales implements NaukriHomePageInputs, NaukriHomePageControls{
	
	public WebDriver naukriHomePage;
	
	public void setPathChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}			
	public void chromeBrowser()			
	{				
		naukriHomePage = new ChromeDriver();
	}				
	public void maximizeWindow()
	{
		naukriHomePage.manage().window().maximize();
	}		
	public void naukariUrl()
	{
		naukriHomePage.get(HomePageInputs_Url);
	}		
	public void naukriRegisterButton()
	{
		naukriHomePage.findElement(By.xpath(HomePageControls_RegisterButton)).click();
	}
	public void naukariExperirncedButton()
	{
		naukriHomePage.findElement(By.xpath(HomePageControls_ExperienceButton)).click();
	}
	public void naukariNameField()
	{
		naukriHomePage.findElement(By.xpath(HomePageControls_NameField)).sendKeys(HomePageInputs_Name);
	}
	public void naukariEmailIDField()
	{
		naukriHomePage.findElement(By.xpath(HomePageControls_EmailField)).sendKeys(HomePageInputs_EmailID);
	}
	public void naukariPasswordField()
	{
		naukriHomePage.findElement(By.xpath(HomePageControls_PasswordField)).sendKeys(HomePageInputs_PasswordField);
	}
	public void naukariMobileNumberField()
	{
		naukriHomePage.findElement(By.xpath(HomePageControls_MobileNumberField)).sendKeys(HomePageInputs_MobileNumber);
	}
	public void naukariRegisterNowButton()
	{
		naukriHomePage.findElement(By.xpath(HomePageControls_RegisterNowButton)).click();
	}
	
	public void waitMethod()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void closeAllBrowser() {
		naukriHomePage.quit();
		
	}
}
