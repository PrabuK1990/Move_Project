import java.awt.AWTException;
import java.io.IOException;

public class TestScript08 {

	public static void main(String[] args) throws IOException, AWTException {
		
		ProjectReusables naukri= new ProjectReusables();
		NaukriHomePageReusbales HomePagereusables = new NaukriHomePageReusbales();
		LoginPageInputs lginPageInputs = new LoginPageInputs();
		
		lginPageInputs.loadNaukriInputs();
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.waitElement();
		naukri.naukriUrl();
		naukri.waitElement();
		HomePagereusables.mousehowerNaukriJobsLink();
		naukri.waitElement();
		HomePagereusables.clicknaukriSearchJobsLink();
		naukri.waitElement();
		naukri.closeCurrentBrowser();
		naukri.waitElement();
		HomePagereusables.clicknaukriAlertLater();
		HomePagereusables.mousehowerNaukriJobsLink();
		HomePagereusables.clicknaukriAdvancedSearchLink();
		naukri.waitElement();
		naukri.closeCurrentBrowser();
		naukri.waitElement();
	}

}
