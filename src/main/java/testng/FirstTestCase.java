package testng;

/* 1)open app
 * 2)login
 * 3)Logout
 */

import org.testng.annotations.Test;

public class FirstTestCase {
	
	//here testng executes the tests in alphabetical order
	@Test(priority=-1)
	void login()
	{
		System.out.println("Login application");
	}
	
	@Test(priority=0)
	void openapp()
	{
		System.out.println("opening application");
		
	}
	
	@Test(priority=1)
	void logout()
	{
		System.out.println("Logout application");
	}
	

}
