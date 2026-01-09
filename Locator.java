package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();

			
			// navigate to dws
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on register
			driver.findElement(By.linkText("Register")).click();
			
			//enter registration details
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("monisha");
			driver.findElement(By.id("LastName")).sendKeys("s s");
			driver.findElement(By.id("Email")).sendKeys("monishas1605@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Ssmonisha@641");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Ssmonisha@641");
			driver.findElement(By.id("register-button")).click();
			
			// go back to home page
			driver.navigate().back();
			
			//click on electronics
			driver.findElement(By.partialLinkText("Electronics")).click();
			
		}

	}



