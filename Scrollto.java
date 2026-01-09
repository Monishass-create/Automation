package javascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollto 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to dws
		driver.get("https://demowebshop.tricentis.com/");
		
		//perform scrolling actions(0,500)
		   //downcasting
		JavascriptExecutor  jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,200)");
		
	}

}
