import java.io.IOException;

public class TestRun {

	public static void main(String[] args) throws IOException {
		
		ProjectReusables naukri;
		NaukriHomePageReusbales HomePagereusables;
		
		naukri = new ProjectReusables();
		HomePagereusables =  new NaukriHomePageReusbales();
		naukri.setPathChromeDriver();
		naukri.chromeBrowser();
		naukri.maximizeWindow();
		naukri.waitElement();
		naukri.naukriUrl();
		naukri.waitElement();
		
		
	}

}
