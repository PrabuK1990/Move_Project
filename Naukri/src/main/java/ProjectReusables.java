import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectReusables implements LoginPageInputs, LoginPageControls, NaukriHomePageInputs, NaukriHomePageControls{
	
	//Set Path for chrome driver
	public static WebDriver naukri;
		
	//Path setup for chromedriver executable file
	public void setPathChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
	}
	public void setPropertyFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	}
	//Launch Chrome Browser	
	public void chromeBrowser()			
	{				
		naukri = new ChromeDriver();
	}
	public void FirefoxBrowser()
	{
	   naukri = new FirefoxDriver();
	}
	//Maximize Browser	
	public void maximizeWindow()
	{
		naukri.manage().window().maximize();
	}			
		
	//Enter Naukri Url
	public void naukriUrl()
	{
		naukri.get(LoginPageInputs_Url);
	}
	
	//Close Browser
	public void closeBrowser()
	{
		naukri.close();
	}
	
	//Close All Browser Instance Opened
	public void closeAllBrowser()
	{
		naukri.quit();
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
