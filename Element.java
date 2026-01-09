package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Element 
{
	public static void main(String[] args) throws IOException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to actitime.com
			driver.get("https://www.actitime.com/");
			
			//locate the try for actitime for free
			WebElement element = driver.findElement(By.linkText("Try actiTIME for Free"));
			
			File temp = element.getScreenshotAs(OutputType.FILE);
			File src = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshot web/free.png");
			FileHandler.copy(temp, src);
			
			driver.quit();
			
			
		}

	}



