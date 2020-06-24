import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriHomePageReusbales extends ProjectReusables implements NaukriHomePageInputs, NaukriHomePageControls{
	
	//Read/Validate Alert Message in Home Page
	
	//Click Visit Career Button Link in Home Page
	
	public void naukariCareerButtonLink()
	{
		naukri.findElement(By.xpath("//a[@href='/step-up-job-opportunities-during-coronavirus-covid-19']")).click();
	}
	
	//Click Jobs Link in Home Page
	
	//Click Recuriters Link in Home Page
	public void naukriRecuriterLink()
	{
		naukri.findElement(By.xpath("//a[@title='Search Recruiters']")).click();
	}
	
	//Click Companies Link in Home Page
	
	public void naukariCompanysLink()
	{
		naukri.findElement(By.xpath("//a[@title='Jobs Posted By Top Companies']")).click();
	}
	
	//Click Tools Link in Home Page
	
	public void naukariToolLink()
	{
		naukri.findElement(By.xpath("//a[@href='https://insights.naukri.com']")).click();
	}
	
	//Click Services Link in Home Page
	public void naukariServiceLink()
	{
		naukri.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();
	}
	
	//Click More Link in Home Page
	public void naukariMoreLink()
	{
		naukri.findElement(By.xpath("//span[@class='topIcon jobs More']")).click();
	}
	
	//Click Login Link in Home Page
	public void naukriLoginLink()
	{
		naukri.findElement(By.xpath(LoginPageControls_LoginLink)).click();
	}
	
	//Enter Designation Text in Home Page
	
	public void naukriDesignationText()
	{
		naukri.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']")).sendKeys("QA");
	}
	
	//Enter Locations Text in Home Page
	public void naukriLocationText()
	{
		naukri.findElement(By.xpath("//input[@name='location']")).sendKeys("Hyderabad");
	}
	
	//Click Search Button Link in Home Page
	public void naukriSearchButtonLink()
	{
		naukri.findElement(By.xpath("//div[@class='search-btn']")).click();
	}
	
	//Click Register Button Link in Home Page
	public void naukriRegisterButton()
	{
		naukri.findElement(By.xpath(HomePageControls_RegisterButton)).click();
	}
	
	//Click Upload CV Link in Home Page
	public void naukriUploadCVLink()
	{
		naukri.findElement(By.xpath("//label[@title='Upload your CV to Register']")).click();
	}
	
	//Click Experienced Button in Home Page
	public void naukriExperiencedButton()
	{
		naukri.findElement(By.xpath(HomePageControls_ExperienceButton)).click();
	}
	
	//Click Take Survey Link in Home Page
}
