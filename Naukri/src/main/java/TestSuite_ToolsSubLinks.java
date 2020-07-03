import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite_ToolsSubLinks implements NaukriHomePageControls {
	
	
		ProjectReusables naukri;
		NaukriHomePageReusbales HomePagereusables;
		LoginPageInputs lginPageInputs;
		
		@BeforeTest
		public void beforeTest() throws IOException 
		{
			System.out.println("Started Test Suite RecruitersSubLinks : To Verify Naukri Tools Menu All SubLinks");
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
			HomePagereusables.mousehowerNaukriToolsLink();	
		}
		
		@Test (priority=1)
		public void testCase01()
		{
			System.out.println("Scenario 1 : To Verify Naukri SalaryTrends SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_SalaryTrendsLink);
		}
		@Test (priority=2)
		public void testCase02()
		{
			System.out.println("Scenario 2 : To Verify Naukri CarrerNavigator SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_CarrerNavigatorlLink);
		}
		@Test (priority=3)
		public void testCase03()
		{
			System.out.println("Scenario 3 : To Verify Naukri PeopleFlow SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_PeopleFlowLink);
		}
		@Test (priority=4)
		public void testCase04()
		{
			System.out.println("Scenario 4 : To Verify Naukri TalentMigration SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_TalentMigrationLink);
		}
		@Test (priority=5)
		public void testCase05()
		{
			System.out.println("Scenario 5 : To Verify Naukri SalaryPredicition SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_SalaryPredictionLink);
		}
		@Test (priority=6)
		public void testCase06()
		{
			System.out.println("Scenario 6 : To Verify Naukri FindMyAlumni SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_FindMyAlumniLink);
		}
		@Test (priority=7)
		public void testCase07()
		{
			System.out.println("Scenario 7 : To Verify Naukri CarrerTrajectoty SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_CareertrajectoryLink);
		}
		@Test (priority=8)
		public void testCase08()
		{
			System.out.println("Scenario 8 : To Verify Naukri Boomerang SubLink Functionality");
			HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_BoomerangLink);
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
			System.out.println("Completed Test Suite JobSubLinks : Verifification Completed for Tools Menu All Sublinks");
		}

	}

