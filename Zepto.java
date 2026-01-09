package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zepto
{
	public static void main(String[] args) throws IOException, InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to zepto
			driver.get("https://www.zepto.com/");
			
			//capture screenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File src = new File("./screenshott/zep.png");
			Thread.sleep(2000);
			FileHandler.copy(temp, src);
			
		}

	}


