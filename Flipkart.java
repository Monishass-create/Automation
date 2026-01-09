package headless;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart 
{
	public static void main(String[] args)
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		
	
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//locate the stf
		driver.findElement(By.name("q")).sendKeys("puma");
		
		//capture the autosuggestions
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='Sc1DCn']"));
		
		for (WebElement web: ele) 
		{
			System.out.println(web.getText());
		}
	}

}
