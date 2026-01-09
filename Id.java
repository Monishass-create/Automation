package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			
			//navigate to dws
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on good radio button
			driver.findElement(By.id("pollanswers-2")).click();
			Thread.sleep(2000);
			
			//click on very bad radio button
			driver.findElement(By.id("pollanswers-4")).click();
			
		}

	}



