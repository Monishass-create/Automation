package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			
			//navigate to dws
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on log in
			driver.findElement(By.linkText("Log in")).click();
			
			//capture the msg
			WebElement capture = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
			System.out.println(capture.getText());
			
			
			
			
		}

	}



