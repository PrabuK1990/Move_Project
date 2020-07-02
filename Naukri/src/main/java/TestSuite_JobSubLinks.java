import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite_JobSubLinks implements NaukriHomePageControls {
	
	ProjectReusables naukri;
	NaukriHomePageReusbales HomePagereusables;
	LoginPageInputs lginPageInputs;
	
	@BeforeTest
	public void beforeTest() throws IOException 
	{
		System.out.println("Started Test Suite JobSubLinks : To Verify Naukri Jobs Menu All SubLinks");
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
		HomePagereusables.mousehowerNaukriJobsLink();
	}
	
	@Test (priority=1)
	public void testCase01()
	{
		System.out.println("Scenario 1 : To Verify Naukri Search Jobs Sublink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_SearchJobsLink);
	}
	
	@Test (priority=2)
	public void testCase02()
	{
		System.out.println("Scenario 2 : To Verify Naukri Adavnced Search SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_AdvancedSearchLink);
	}
	
	@Test (priority=3)
	public void testCase03()
	{
		System.out.println("Scenario 3 : To Verify Naukri Create Free Alert SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_CreateFreeJobAlert);
	}
	
	@Test (priority=4)
	public void testCase04()
	{
		System.out.println("Scenario 4 : To Verify Naukri RegisterNow SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_RegisterNowLink);
	}
	
	@Test (priority=5)
	public void testCase05()
	{
		System.out.println("Scenario 5 : To Verify Naukri JobsByLocation SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_JobsByLocationLink);
	}
	
	@Test (priority=6)
	public void testCase06()
	{
		System.out.println("Scenario 6 : To Verify Naukri JobsBySkill SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_JobsBySkillLink);
	}
	
	@Test (priority=7)
	public void testCase07()
	{
		System.out.println("Scenario 7 : To Verify Naukri JobsByDesihnation SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_JobsByDesignationLink);
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
		System.out.println("Completed Test Suite JobSubLinks : Verifification Completed for Jobs Menu All Sublinks");
	}

}
