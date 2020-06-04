import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public WebDriver move;
	
	//Path setup for chromedriver executable file
	public void setPath()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}

	//Create and instance of chromedriver class and store it in a object(move) and launch browser
	public void chromeBrowser()
	{
		move = new ChromeDriver();
	}
	
	//Maximize browser
	public void maximizeWindow()
	{
		move.manage().window().maximize();
	}
	
	//Open the move ams Url
	public void moveUrl()
	{
		move.get("https://ams.moveoutdoor.com.au/");
	}
	
	//Close pop-up
	public void browserPopup()
	{
		move.findElement(By.xpath("//div[text()='Don’t show this message again']/following-sibling::input")).click();
	}
	
	//Enter text in the email id field
	public void emailField()
	{
		move.findElement(By.id("contact_email")).sendKeys("dileep@gmail.com");	
	}
	
	//Enter text in the password field
	public void passwordField()
	{
		move.findElement(By.id("contact_password")).sendKeys("Dileep@12");	
	}
	
	//Click login button
	public void loginButton()
	{
		move.findElement(By.name("commit")).click();
	}
	
	//Should close the Browser
	public void closeBrowser()
	{
		move.close();
	}
}
