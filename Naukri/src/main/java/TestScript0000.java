
public class TestScript0000 {

	public static void main(String[] args) {
		
		
		NaukriHomePageReusbales naukri = new NaukriHomePageReusbales();
				
				naukri.setPathChromeDriver();
				naukri.chromeBrowser();
				naukri.maximizeWindow();
				naukri.naukriUrl();
				naukri.waitElement();
				naukri.naukriJobsLink();
				//naukri.naukariCompanysLink();

	}

}
