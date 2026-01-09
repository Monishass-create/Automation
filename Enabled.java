package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled 
{
	@org.testng.annotations.Test(enabled = false)
	public void abc()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zepto.com/search");
		org.testng.Reporter.log("open the application",true);
	}
	@org.testng.annotations.Test
	public void abcd()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://blinkit.com/");
		org.testng.Reporter.log("open the blinkit ",true);
	}
	
	


}
