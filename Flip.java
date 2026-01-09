package autosuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//locate stf
		driver.findElement(By.name("q")).sendKeys("puma");
		
		//capture the suggestions
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='Sc1DCn']"));
		
		for (WebElement web : ele) 
		{
			System.out.println(web.getText());
			
			if (web.getText().contains("jacket")) 
			{
				web.click();
				break;
				
			}
			
//			if (web.getText().equals("puma jacket")) 
//			{
//				web.click();
//				break;
//				
//			}
			
		}
		
	}

}
