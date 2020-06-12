import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariLogin {
	
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
	public void moveUrl()
	{
		move.get("https://www.naukri.com/");
	}
		
	//Enter Naukri Username/Email
	public void emailField()
	{
		move.findElement(By.id("contact_email")).sendKeys("dileep@gmail.com");	
	}
		
	//Enter Naukri Password
	public void passwordField()
	{
		move.findElement(By.id("contact_password")).sendKeys("Dileep@12");	
	}			
		
	//Click Login Button
	public void loginButton()
	{
		move.findElement(By.name("commit")).click();
	}
		
	//closeBrowser()
	public void closeBrowser()
	{
		move.close();
	}
}