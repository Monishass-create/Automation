package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshott 
{
	
		public static void main(String[] args) throws InterruptedException, IOException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to wikipedia
			driver.get("https://www.wikipedia.org/");
			
			//search the selenium software
			driver.findElement(By.id("searchInput")).sendKeys("selenium software");
			
			//click the stf
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//takescreenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File src = new File("./screenshott/wikki.png");
			Thread.sleep(2000);
			FileHandler.copy(temp, src);
			driver.quit();
			
		}

	}



