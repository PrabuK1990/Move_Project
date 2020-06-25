
public class TestScript06 {

	public static void main(String[] args) {
		
		ProjectReusables naukri = new ProjectReusables();
		NaukriHomePageReusbales naukriHomePage = new NaukriHomePageReusbales();
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.waitElement();
		//naukriHomePage.naukriNumberOneJobSite();
		naukriHomePage.naukriDesignationText();
		naukriHomePage.naukriLocationText();
		naukriHomePage.naukriSearchButtonLink();
		naukri.waitElement();
		naukri.closeAllBrowser();
		

	}

}
