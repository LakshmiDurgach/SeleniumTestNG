import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTestNG {
	WebDriver driver;
	
	public void LaunchApp()
	{
		//WebDriverManager.chromedriver().setup;
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");
	}

	@Test
	public void LoginDetails()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public void NavigateMyInfo()
	{
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
		 
		 
	}
	@Test
	public void VerifyMyInfo()
	{
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
		driver.quit();
	}
	
	
	public void VerifyLogin()
	{
		WebElement element=driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
		
		
	}
	
	

}
