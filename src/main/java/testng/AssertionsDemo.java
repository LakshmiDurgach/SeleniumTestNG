package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	void testTitle()
	{
	String exp_title="Opencart";
	String act_title="Opencart1";
	
	Assert.assertEquals(exp_title, act_title);
	}
	

}
