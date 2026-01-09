package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enabled 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to instagram
		driver.get("https://www.instagram.com/");
		
		//check button is enabled or not
		WebElement btn = driver.findElement(By.xpath("//div[@role='button']"));
		System.out.println("check button is displayed or not");
		System.out.println(btn.isDisplayed());
		
		System.out.println("before entering the usn and pwd");
		System.out.println(btn.isEnabled());
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dingi123@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dinga@456");
		
		System.out.println("after entering the usn and pwd");
		System.out.println(btn.isEnabled());
		
		
		
		
	}

}
