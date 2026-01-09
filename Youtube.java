package autosuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to yt
		driver.get("https://www.youtube.com/");
		
		//locate stf
		driver.findElement(By.name("search_query")).sendKeys("api testing");
		
		//capture the suggestions
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@role='presentation']"));
		
		for (WebElement ele : suggestions)
		{
			System.out.println(ele.getText());
			
		}
		
		
	}

}
