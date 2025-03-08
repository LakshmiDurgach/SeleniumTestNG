package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*login------@BeforeMethod
 * search-----@Test
 * logout-----@AfterMethod
 * login
 * advanced search------@Test
 * logout
 */

public class TestngAnnotations {
	
	//@BeforeMethod is executed before @Test-------login is executed 2 times
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search");
		
	}
	
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("This is  advanced search");
	}
	
	//@AfterMethod is executed before @Test-------logout is executed 2 times
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
		
	}

}
