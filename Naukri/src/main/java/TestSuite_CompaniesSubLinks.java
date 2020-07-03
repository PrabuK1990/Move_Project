import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite_CompaniesSubLinks implements NaukriHomePageControls {
	
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
		HomePagereusables.mousehowerNaukriCompaniesLink();		
	}
	
	@Test (priority=1)
	public void testCase01()
	{
		System.out.println("Scenario 1 : To Verify Naukri BrowseAllCompanies SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_BrowseAllCompaniesLink);
	}
	@Test (priority=2)
	public void testCase02()
	{
		System.out.println("Scenario 2 : To Verify Naukri AboutCompanies SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_AboutCompaniesLink);
	}
	@Test (priority=3)
	public void testCase03()
	{
		System.out.println("Scenario 3 : To Verify Naukri InterviewQuestions SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_InterviewQuestionsLink);
	}
	@Test (priority=4)
	public void testCase04()
	{
		System.out.println("Scenario 4 : To Verify Naukri CompaniesReview SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_CompaniesReviewLink);
	}
	@Test (priority=5)
	public void testCase05()
	{
		System.out.println("Scenario 5 : To Verify Naukri InterviewAdvice SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_InterviewAdviceLink);
	}
	@Test (priority=6)
	public void testCase06()
	{
		System.out.println("Scenario 6 : To Verify Naukri CompanyReview SubLink Functionality");
		HomePagereusables.clicknaukriAllSubMenuLinks(HomePageControls_CompanyReview);
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
		System.out.println("Completed Test Suite JobSubLinks : Verifification Completed for Companies Menu All Sublinks");
	}

}
