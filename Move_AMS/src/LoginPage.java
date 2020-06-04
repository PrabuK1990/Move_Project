import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		//Path setup for chromedriver executable file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//Create and instance of chromedriver class and store it in a object(move) and launch browser
		WebDriver move = new ChromeDriver();
		
		//Maximize chrome browser
		move.manage().window().maximize();

		//Open the move ams Url
		move.get("https://ams.moveoutdoor.com.au/");
		
		//Close pop-up
		move.findElement(By.xpath("//div[text()='Don’t show this message again']/following-sibling::input")).click();
		
		//Enter text in the email id field
		move.findElement(By.id("contact_email")).sendKeys("dileep@gmail.com");
		
		//Enter text in the password field
		move.findElement(By.id("contact_password")).sendKeys("Dileep@12");
		
		//Click login button
		move.findElement(By.name("commit")).click();
		
		//Should close the Browser
		move.close();
		
		System.out.println("Launch browser, maximize browser, enter url, close pop-up, enter email-id, password and close browser");
	}

}
