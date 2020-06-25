import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_02 {
	
	//Before all test it is going to execute
	@BeforeTest
	public void instance()
	{
		System.out.println("Before Test");	
	}
	
	//Before each test it is going to execute
	@BeforeMethod
	public void instanceCreation()
	{
		System.out.println("Before Method");
	}
	
	//Test Case 1
	@Test (priority=1)
	public void loginFunctionality()
	{
		System.out.println("Actual Test Case1");
	}
	
	//Test Case 2
	@Test (priority=2)
	public void login()
	{
		System.out.println("Actual Test Case2");
	}
	
	//After each test it is going to execute
	@AfterMethod
	public void instances()
	{
		System.out.println("After Method");
	}
	
	//After all test it is going to execute
	@AfterTest
	public void last()
	{
		System.out.println("After Test");
	}


}
