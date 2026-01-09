package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/sub-category/men-shirt");
		
		
		driver.findElement(By.xpath("(//div[@data-aos='zoom-in'])[2]")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("356789");
		
		driver.findElement(By.id("Check")).click();
		
		
		
	}

}
