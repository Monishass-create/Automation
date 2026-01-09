package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Surrounding 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to dws
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on excellent radio button
			driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']")).click();
			
		}

	}



