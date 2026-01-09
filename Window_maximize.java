package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_maximize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 //launch the browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//fullscreen the webpage
		driver.manage().window().fullscreen();
	}

}
