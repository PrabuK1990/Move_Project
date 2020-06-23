
public class TestScript01 {

	public static void main(String[] args) {

		System.out.println("Scenario 1 : To Verify the naukri Url");

		//Create an instance of class "NaukriLoginPage" and store it in an object and name it as "naukri"
		NaukriLoginPageReusables naukri = new NaukriLoginPageReusables();

		//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl() and closeBrowser() 
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.naukriUrl();
		naukri.closeBrowser();
		
		System.out.println("Naukri Url has been entered successfully");

}

	}