import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite_RecruitersSubLinks implements NaukriHomePageControls {
	
	ProjectReusables naukri;
	NaukriHomePageReusbales HomePagereusables;
	LoginPageInputs lginPageInputs;
	
	@BeforeTest
	public void beforeTest() throws IOException 
	{
		System.out.println("Started Test Suite RecruitersSubLinks : To Verify Naukri Recruiters Menu All SubLinks");
		naukri = new ProjectReusables();
		HomePagereusables =  new NaukriHomePageReusbales();
		lginPageInputs = new LoginPageInputs();
		lginPageInputs.loadNaukriInputs();
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.waitElement();
		naukri.naukriUrl();
		naukri.waitElement();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{	
		HomePagereusables.pageRefresh();
		HomePagereusables.mousehowerNaukriRecruitersLink();		
	}
	
	@Test (priority=1)
	public void testCase01()
	{
		System.out.println("Scenario 1 : To Verify Naukri BrowseAllRecryiters SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_BrowseAllRecruiters);
	}
	@Test (priority=2)
	public void testCase02()
	{
		System.out.println("Scenario 2 : To Verify Naukri RecruitersConnection SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_RecruitersConnectionLink);
	}
	@Test (priority=3)
	public void testCase03()
	{
		System.out.println("Scenario 3 : To Verify Naukri GoToNuaukriRecruiter SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_GoToNaukriRecruiterLink);
	}
	
	@AfterMethod
	public void afterMethod() throws AWTException
	{	
		naukri.waitElement();
		naukri.closeCurrentBrowser();
		naukri.waitElement();
	}
	
	@AfterTest
	public void afterTest()
	{
		naukri.closeAllBrowser();
		System.out.println("Completed Test Suite JobSubLinks : Verifification Completed for Recrcuiters Menu All Sublinks");
	}

}
