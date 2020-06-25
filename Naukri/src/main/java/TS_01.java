import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_01 {
	
	ProjectReusables naukri;
	NaukriHomePageReusbales naukriHomePage;
	NaukriLoginPageReusables naukriLoginPage;
	
	
	@BeforeTest
	public void instance()
	{
		naukri = new ProjectReusables();
		naukriHomePage = new NaukriHomePageReusbales();
		naukriLoginPage = new NaukriLoginPageReusables();	
	}
	
	@BeforeMethod
	public void instanceCreation()
	{
		naukri = new ProjectReusables();
		naukriHomePage = new NaukriHomePageReusbales();
		naukriLoginPage = new NaukriLoginPageReusables();	
	}
	
	@Test (priority=1)
	public void loginFunctionality()
	{
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.closeAllBrowser();
	}
	
	@Test (priority=2)
	public void loginErrorMessage()
	{
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.waitElement();
		naukriHomePage.naukriLoginLink();
		naukri.waitElement();
		naukriLoginPage.naukriEmailField();
		naukriLoginPage.naurkiPasswordField();
		naukriLoginPage.naukriLoginButton();
		naukri.closeAllBrowser();
	}
	
	@AfterMethod
	public void instances()
	{
		naukri = new ProjectReusables();
		naukriHomePage = new NaukriHomePageReusbales();
		naukriLoginPage = new NaukriLoginPageReusables();	
	}
	
	@AfterTest
	public void last()
	{
		System.out.println("Login Functionality Executed");
	}

}
