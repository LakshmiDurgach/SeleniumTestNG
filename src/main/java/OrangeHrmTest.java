import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	
	WebDriver driver;
	
	/*open the application
	 * test logo presence
	 * login
	 * close
	 */
	@Test(priority=1)
	void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
		
		
	}
	@Test(priority=2)
	void testLogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo dispalyed..."+status);
		
	}
	@Test(priority=3)
	void testLogin()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("lucky");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lucky123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	@Test(priority=4)
	void testLogout()
	{
		//close application
		driver.quit();
		
	}
	
	

}
