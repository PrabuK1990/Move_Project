import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriHomePageReusbales extends ProjectReusables implements NaukriHomePageInputs, NaukriHomePageControls{
	
	//Read/Validate/Verify Alert Message in Home Page
	public void naukriAlertMessage()
	{
		String actualAlterMessage = naukri.findElement(By.xpath(HomePageControls_AlertMessage)).getText();
		
		if(HomePageInputs_ExpectedAlertMessage.equals(actualAlterMessage))
		{
			//If expected is eaual to actual condition is true(Then the following code will execute othwise following code will not execute) in Login Page
			System.out.println("CORRECT ALERT MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expecated Alert Message : " + HomePageInputs_ExpectedAlertMessage);
			System.out.println("Actual Alert Message : " + actualAlterMessage);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
		
		else 	
		{
			//If expected is eaual to actual condition is false(Then the following code will execute) in Login Page
			System.out.println("INCORRECT ALERT MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Alert Message : " + HomePageInputs_ExpectedAlertMessage);
			System.out.println("Actual Alert Message : " + actualAlterMessage);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	//Click Visit Career Button Link in Home Page	
	public void naukariCareerButtonLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CareerButtonLink)).click();
	}
	
	//Read/Validate/Verify India's NO1 Job Site
	public void naukriNumberOneJobSite()
	{
		String actualMessage = naukri.findElement(By.xpath("//h1[@class='inline']")).getText();
		
		if(HomePageInputs_ExpectedMessage.equals(actualMessage))
		{
			//If expected is eaual to actual condition is true(Then the following code will execute othwise following code will not execute) in Login Page
			System.out.println("CORRECT ALERT MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expecated Alert Message : " + HomePageInputs_ExpectedMessage);
			System.out.println("Actual Alert Message : " + actualMessage);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
		
		else 	
		{
			//If expected is eaual to actual condition is false(Then the following code will execute) in Login Page
			System.out.println("INCORRECT ALERT MESSAGE");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Expected Alert Message : " + HomePageInputs_ExpectedMessage);
			System.out.println("Actual Alert Message : " + actualMessage);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	//Click Jobs Link in Home Page
	public void clicknaukriJobsLink()
	{
		naukri.findElement(By.xpath(HomePageControls_JobsLink)).click();
	}	
	
	//Mouse Hover Jobs Link in Home Page
	public void mousehowerNaukriJobsLink()
	{
		Actions actions = new Actions(naukri);
		WebElement mousehoverJobLink = naukri.findElement(By.xpath(HomePageControls_JobsLink));
		actions.moveToElement(mousehoverJobLink).perform();
	}
	//Mouse Hover Recruiters Link in Home Page
	public void mousehowerNaukriRecruitersLink()
	{
		Actions actions = new Actions(naukri);
		WebElement mousehowerNaukriRecruitersLink = naukri.findElement(By.xpath(HomePageControls_RecuritersLink));
		actions.moveToElement(mousehowerNaukriRecruitersLink).perform();
	}
	//Mouse Hover Companies Link in Home Page
	public void mousehowerNaukriCompaniesLink()
	{
		Actions actions = new Actions(naukri);
		WebElement mousehowerNaukriCompaniessLink = naukri.findElement(By.xpath(HomePageControls_CompanysLink));
		actions.moveToElement(mousehowerNaukriCompaniessLink).perform();
	}
	//Mouse Hover Tools Link in Home Page
	public void mousehowerNaukriToolsLink()
	{
		Actions actions = new Actions(naukri);
		WebElement mousehowerNaukriToolLink = naukri.findElement(By.xpath(HomePageControls_ToolLink));
		actions.moveToElement(mousehowerNaukriToolLink).perform();
	}
	//Mouse Hover Services Link in Home Page
	public void mousehowerNaukriServicesLink()
	{
		Actions actions = new Actions(naukri);
		WebElement mousehowerNaukriServicesLink = naukri.findElement(By.xpath(HomePageControls_ServiceLink));
		actions.moveToElement(mousehowerNaukriServicesLink).perform();
	}
	//Mouse Hover More Link in Home Page
	public void mousehowerNaukriMoreLink()
	{
		Actions actions = new Actions(naukri);
		WebElement mousehowerNaukriMoreLink = naukri.findElement(By.xpath(HomePageControls_MoreLink));
		actions.moveToElement(mousehowerNaukriMoreLink).perform();
	}
	//Click Alert Later Pop-up
	public void pageRefresh()
	{
		naukri.navigate().refresh();
		/*WebElement alertLater = naukri.findElement(By.id("block"));
		if(alertLater.isDisplayed() == true)
		{
			System.out.println("Alert Message Displayed");
			alertLater.click();
			System.out.println("Clicked Later Button");
		}	
		
		else if(alertLater.isDisplayed() == false)
		{
			System.out.println("No Alert Message Displayed");
		}*/
	}
	
	//Common Function to click all sub menu links
	public void clicknaukriAllSubMenuLinks(String subMenuLink)
	{
		//System.out.println(subMenuLink);
		naukri.findElement(By.xpath(subMenuLink)).click();
	}
	
	//Click Jobs By Company In Home Page
	public void clickFindJobsByCompany()
	{
		naukri.findElement(By.xpath(HomePageControls_JobsByCompanyLink)).click();
	}	
	//Click Jobs Link In Nukri Home Page
	public void naukriJobsBycategory()
	{
		naukri.findElement(By.xpath(HomePageControls_JobsByCategory)).click();
	}
	//Click BrowseAllJobs In naukri Home Page
	public void naukriBrowseAllJobs()
	{
		naukri.findElement(By.xpath(HomePageControls_BrowseAllJobs)).click();
	}
	//Click Recuriters Link in Home Page
	public void naukriRecuriterLink()
	{
		naukri.findElement(By.xpath(HomePageControls_RecuritersLink)).click();
	}
	//Click Browse All Recruiters Link in Home Page
	public void clicknaukriBrowseAllRecruitersLink()
	{
		naukri.findElement(By.xpath(HomePageControls_BrowseAllRecruiters)).click();
	}
	//Click Recruiters Connection Link in Home Page
	public void clicknaukriRecruitersConnectionLink()
	{
		naukri.findElement(By.xpath(HomePageControls_RecruitersConnectionLink)).click();
	}
	//Click Go to  Naukri Recruiters Link in Home Page
	public void clickGotoNaukriRecruitersLink()
	{
		naukri.findElement(By.xpath(HomePageControls_GoToNaukriRecruiterLink)).click();
	}
	//Click Companies Link in Home Page	
	public void naukariCompanysLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CompanysLink)).click();
	}
	//Click Browse All Companies Link In Home Page
	public void naukriBrowseAllCompaniesLink()
	{
		naukri.findElement(By.xpath(HomePageControls_BrowseAllCompaniesLink)).click();
	}
	//Click About  Companies Link In Home Page
	public void naukriAboutCompaniesLink()
	{
		naukri.findElement(By.xpath(HomePageControls_AboutCompaniesLink)).click();
	}
	//Click Interview Questions Link In Home Page
	public void naukriInterviewQuestionsLink()
	{
		naukri.findElement(By.xpath(HomePageControls_InterviewQuestionsLink)).click();
	}
	//Click  Companies Review Link Link In Home Page
	public void naukriCompaniesReviewLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CompaniesReviewLink)).click();
	}
	//Click Browse All Companies Link In Home Page
	public void naukriLink()
	{
		naukri.findElement(By.xpath(HomePageControls_InterviewAdviceLink)).click();
	}
	//Click Browse All Companies Link In Home Page
	public void naukriCompanieReviewLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CompanyReview)).click();
	}
	//Click Tools Link in Home Page	
	public void naukriToolLink()
	{
		naukri.findElement(By.xpath(HomePageControls_ToolLink)).click();
	}
	//Click Salary Trends Link in Home Page	
	public void naukriSalaryTrendsLink()
	{
		naukri.findElement(By.xpath(HomePageControls_SalaryTrendsLink)).click();
	}	
	//Click Carrer Navigator Link in Home Page	
	public void naukriCarrerNavigatorLink()
	{
	   naukri.findElement(By.xpath(HomePageControls_CarrerNavigatorlLink)).click();
	}	
	//Click People Flow Link in Home Page	
	public void naukriPeopleFlowLink()
	{
	 	naukri.findElement(By.xpath(HomePageControls_PeopleFlowLink)).click();
	}	
	//Click Talent Migration Link in Home Page	
	public void naukriTalentMigrationLink()
	{
		naukri.findElement(By.xpath(HomePageControls_TalentMigrationLink)).click();
	}	
	//Click SalaryPrediction Link in Home Page	
	public void naukriSalaryPredictionLink()
	{
		naukri.findElement(By.xpath(HomePageControls_SalaryPredictionLink)).click();
	}	
	//Click Find MyAlumni Link in Home Page	
	public void naukriFindMyAlumniLink()
	{
		naukri.findElement(By.xpath(HomePageControls_FindMyAlumniLink)).click();
	}	
	//Click Carrer Trajectory Link in Home Page	
	public void naukriCareerTrajectoryLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CareertrajectoryLink)).click();
	}	
	//Click Tools Link in Home Page	
	public void naukriBoomerangLink()
	{
		naukri.findElement(By.xpath(HomePageControls_BoomerangLink)).click();
	}	
	//Click Services Link in Home Page
	public void naukriServiceLink()
	{
		naukri.findElement(By.xpath(HomePageControls_ServiceLink)).click();
	}
	//Click NaukariText Resume Link in Home Page
	public void naukriTextResumeLink()
	{
		naukri.findElement(By.xpath(HomePageControls_TextResumeLink)).click();
	}
	//Click Naukri Visual Resume Link in Home Page
	public void naukriVisualResumeLink()
	{
		naukri.findElement(By.xpath(HomePageControls_VisualResumeLink)).click();
	}
	//Click Naukri ResumeQualityScore Link in Home Page
	public void naukriResumeQualityScoreLink()
	{
		naukri.findElement(By.xpath(HomePageControls_ResumeQualityScoreLink)).click();
	}
	//Click Nakuri ResumeSamples Link in Home Page
	public void naukriResumeSamaplesLink()
	{
		naukri.findElement(By.xpath(HomePageControls_ResumeSamplesLink)).click();
	}
	//Click Naukrri Jobs4ULink in Home Page
	public void naukriJobs4ULink()
	{
		naukri.findElement(By.xpath(HomePageControls_Jobs4ULink)).click();
	}
	
	//Click More Link in Home Page
	public void naukariMoreLink()
	{
		naukri.findElement(By.xpath(HomePageControls_MoreLink)).click();
	}
	//Click Naukri BlogLink in Home Page
	public void naukariBlogLink()
	{
		naukri.findElement(By.xpath(HomePageControls_NaukriBlogLink)).click();
	}
	//Click naukri FAQ Link in Home Page
	public void naukariFAQLink()
	{
		naukri.findElement(By.xpath(HomePageControls_NaukriFAQLink)).click();
	}
	//Click naukri TakeHome Clacluator Link in Home Page
	public void naukariTakeHomeClacluatorLink()
	{
		naukri.findElement(By.xpath(HomePageControls_TakeHomeClacluatorLink)).click();
	}
	//Click Naukri StudyAbordMBA Link in Home Page
	public void naukariStudyAbordMBALink()
	{
		naukri.findElement(By.xpath(HomePageControls_StudyAbordMBALink)).click();
	}
	//Click Naukri AbordMCA Link in Home Page
	public void naukariStudyAbordMCALink()
	{
		naukri.findElement(By.xpath(HomePageControls_StudyAbordMCALink)).click();
	}
	//Click Login Link in Home Page
	public void naukriLoginLink()
	{
		naukri.findElement(By.xpath(LoginPageControls_LoginLink)).click();
	}
	//Enter Designation Text in Home Page
	public void naukriDesignationText()
	{
		naukri.findElement(By.xpath(HomePageControls_DeginationText)).sendKeys("QA");
	}	
	//Enter Locations Text in Home Page
	public void naukriLocationText()
	{
		naukri.findElement(By.xpath(HomePageControls_LocationText)).sendKeys("Hyderabad");
	}	
	//Click Search Button Link in Home Page
	public void naukriSearchButtonLink()
	{
		naukri.findElement(By.xpath(HomePageControls_SearchButton)).click();
	}
	//Click Register Button Link in Home Page
	public void naukriRegisterButton()
	{
		naukri.findElement(By.xpath(HomePageControls_RegisterButton)).click();
	}
	//Click Upload CV Link in Home Page
	public void naukriUploadCVLink()
	{
		naukri.findElement(By.xpath(HomePageControls_CVUploadLink)).click();
	}	
	//Click Experienced Button in Home Page
	public void naukriExperiencedButton()
	{
		naukri.findElement(By.xpath(HomePageControls_ExperienceButton)).click();
	}	
	//Click Take Survey Link in Home Page
}
