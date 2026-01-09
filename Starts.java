package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starts
{
		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to dws
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on log in
			driver.findElement(By.linkText("Log in")).click();
			
			//click on login button
			driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
			
			//capture error msg
			WebElement text = driver.findElement(By.xpath("//span[starts-with(text(),'Login')]"));
	        System.out.println(text.getText());
			
		}

	}


