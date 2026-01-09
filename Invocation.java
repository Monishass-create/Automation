package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invocation
{
	@org.testng.annotations.Test(priority = 2,invocationCount = 3)
	public void abc()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zepto.com/search");
		org.testng.Reporter.log("open the application",true);
	}
	@org.testng.annotations.Test(priority = -1,invocationCount = 0)
	public void abcd()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://blinkit.com/");
		org.testng.Reporter.log("open the blinkit ",true);
	}
	@org.testng.annotations.Test(priority = 1)
	public void ab()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiomart.com/");
		org.testng.Reporter.log("open the jiomart ",true);
	}
	


}
