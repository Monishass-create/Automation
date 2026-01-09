package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hiddendivision
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("(//div[@class='tp-dt-header-icon'])[2]")).click();
		driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
		
	    driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();
	    driver.findElement(By.cssSelector("span[class='coachmark']")).click();
	    driver.findElement(By.xpath("(//div[@class='tp-dt-header-icon'])[2]")).click();
	
	    
	   
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		WebElement month = driver.findElement(By.cssSelector("span[aria-label='Next Month']"));
//		 Actions act = new Actions(driver);
//		 act.doubleClick(month).perform();
		//driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
		//String target = "March 2026";
		for(;;)
		{
			try
			{
			driver.findElement(By.cssSelector("div[aria-label='Thu Mar 26 2026']")).click();
			break;
			}
			catch(Exception e)
			{
				driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
			}
			//driver.findElement(By.cssSelector("div[aria-label='Thu Mar 26 2026']")).click();
			
		}
		
		
	}

}
