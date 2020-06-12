
public class TestScript01 {

	public static void main(String[] args) {
		
		NaukariLogin test01 = new NaukariLogin();
		
		test01.setPathChromeDriver();
		test01.chromeBrowser();
		test01.maximizeWindow();
		test01.moveUrl();				
		test01.loginButton();
		test01.closeBrowser();

System.out.println("Scenario 1 : To Verify the naukri Url");

//Create an instance of class "NaukriLoginPage" and store it in an object and name it as "naukri"

//Call function - setProperty(), chromeBrowser(), maximizeBrowser(), naukriUrl() and closeBrowser() 

System.out.println("Naukri Url has been entered successfully");

}

	}