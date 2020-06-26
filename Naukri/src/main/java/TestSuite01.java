import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite01 {
	
	ProjectReusables naukri;
	NaukriHomePageReusbales naukriHomePage;
	NaukriLoginPageReusables naukriLoginPage;
	NaukriRegisterPageReusbales naukriRegisterPage;
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Started Test Suite 1 : TestCase01, TestCase02 & TestCase03");
		naukri = new ProjectReusables();
		naukriHomePage =  new NaukriHomePageReusbales();
		naukriLoginPage = new NaukriLoginPageReusables();
		naukriRegisterPage= new NaukriRegisterPageReusbales();
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{	
		naukri.naukriUrl();
		naukri.waitElement();
	}
	
	@Test (priority=1)
	public void testCase01()
	{
		System.out.println("Scenario 1 : To Verify the naukri Url");
		System.out.println("Naukri Url has been entered successfully");
	}
	
	@Test (priority=2)
	public void testCase02()
	{
		System.out.println("Scenario 2 : To Verify the Naukri Login Functionality");
		naukriHomePage.naukriLoginLink();
		naukri.waitElement();
		naukriLoginPage.naukriEmailField();
		naukriLoginPage.naurkiPasswordField();
		naukriLoginPage.naukriLoginButton();
		System.out.println("Login functionaly working as expected");
	}
	
	@Test (priority=3)
	public void testCase03()
	{
		System.out.println("Scenario 3 : To Verify the Naukri Login Functionality");
		naukriHomePage.naukriLoginLink();
		naukri.waitElement();
		naukriLoginPage.naukriLoginButton();
		naukriLoginPage.naukriEmailErrMsg();
		naukriLoginPage.naukriPasswordErrMsg();
		System.out.println("***Error Message Validation for Email ID and Password Completed***");
	}
	
	@Test (priority=4)
	public void testCase04()
	{
		System.out.println("Scenario 4 : To Verify the Naukri Experience Button Functionality");
		naukriHomePage.naukriRegisterButton();
		naukri.waitElement();
		naukriHomePage.naukriExperiencedButton();
		naukri.waitElement();
		naukriRegisterPage.naukriNameField();
		naukriRegisterPage.naukriEmailIDField();
		naukriRegisterPage.naukriPasswordField();
		naukriRegisterPage.naukriMobileNumberField();
		System.out.println("***Naukri Experience Sucessfully Completed***");
	}
	
	@Test (priority=5)
	public void testCase05()
	{
		System.out.println("Scenario 5 : To Verify the Naukri register Page Functionality");
		naukriHomePage.naukriRegisterButton();
		naukri.waitElement();
		naukriHomePage.naukriExperiencedButton();
		naukri.waitElement();
		naukriRegisterPage.naukriNameField();
		naukriRegisterPage.naukriEmailIDField();
		naukriRegisterPage.naukriPasswordField();
		naukriRegisterPage.naukriMobileNumberField();
		System.out.println("***Naukri register Page Sucessfully vailidated***");
	}
	
	@Test (priority=6)
	public void testCase06()
	{
		System.out.println("Scenario 6 : To Verify the Naukri Search Button Functionality");
		naukriHomePage.naukriNumberOneJobSite();
		naukriHomePage.naukriDesignationText();
		naukriHomePage.naukriLocationText();
		naukriHomePage.naukriSearchButtonLink();
		System.out.println("***Search Button and Skill Button Verified Sucessfully Completed***");
	}
	
	@AfterMethod
	public void afterMethod()
	{	
		naukri.waitElement();
		naukri.refreshBrowser();
	}
	
	@AfterTest
	public void afterTest()
	{
		naukri.closeAllBrowser();
		System.out.println("Completed Test Suite 1 : TestCase01, TestCase02 & TestCase03, TestCase04 and TestCase05 and TestCase06");
	}

}
