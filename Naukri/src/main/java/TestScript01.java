
public class TestScript01 {

	public static void main(String[] args) {

		System.out.println("Scenario 1 : To Verify the naukri Url");

		//Create Instance Project Reusables
		
		ProjectReusables naukri = new ProjectReusables();

		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl() and closeBrowser() 
		
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.closeAllBrowser();
		
		System.out.println("Naukri Url has been entered successfully");

}

	}