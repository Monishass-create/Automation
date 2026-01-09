package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
	public static void main(String[] args) throws InterruptedException
	{ 
		 //launch the browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		//navigate to myntra
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//again comeback to chrome
		driver.navigate().back();
		Thread.sleep(2000);
		
		//go back to myntra
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//refresh the page
		driver.navigate().refresh();
		
		
	}

}
