import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TstNG_Notes {

	//Framework : Framework is a setup which include code libraries and other programs to develop java project. 
	//TestNG Framework is a inbuild framework which is a open source, by including in our project we can use the annotations available.
	//Annotaion - we are going to mention annotation to the above functions.
	//Most commonly used annotation is @Test - It is going to execute the function when declared.
	//@BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest, @BeforeSuite, @AfterSUite
	
	//Before all test it is going to execute
		@BeforeTest
		public void beforTest()
		{
			System.out.println("Before Test");	
		}
		
		//Before each test it is going to execute
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Method");
		}
		
		//Test Case 1
		@Test (priority=1)
		public void testOne()
		{
			System.out.println("Actual Test Case1");
		}
		
		//Test Case 2
		@Test (priority=2)
		public void testTwo()
		{
			System.out.println("Actual Test Case2");
		}
		
		//After each test it is going to execute
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After Method");
		}
		
		//After all test it is going to execute
		@AfterTest
		public void afterTest()
		{
			System.out.println("After Test");
		}
}
