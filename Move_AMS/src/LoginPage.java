import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		//Path setup for chromedriver executable file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//Create and instance of chromedriver class and store it in a object(move) and launch browser
		WebDriver move = new ChromeDriver();
		
		move.manage().window().maximize();
		//Disconnect team viewr and share your screen in skype ok? ok
		//Open the move ams Url
		move.get("https://ams.moveoutdoor.com.au/");
		
		//Close pop-up
		move.findElement(By.xpath("//div[text()='Don�t show this message again']/following-sibling::input")).click();
		
		//Enter text in the email id field
		move.findElement(By.id("contact_email")).sendKeys("dileep@gmail.com");
		
		//Should close the Browser
		//move.close();
		
		System.out.println("Launch browser, maximize browser, enter url, close pop-up, enter email-id and close browser");
	}

}
