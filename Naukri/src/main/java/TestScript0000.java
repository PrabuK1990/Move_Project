
public class TestScript0000 {

	public static void main(String[] args) {
		NaukriHomePageReusbales nakuri =  new NaukriHomePageReusbales();
		
		
		
		        nakuri.setPathChromeDriver();
		        nakuri.chromeBrowser();
		        nakuri.maximizeWindow();
		        nakuri.naukriUrl();
		        nakuri.naukriUploadCVLink();
				nakuri.waitElement();
				//nakuri.closeAllBrowser();
	}

}
