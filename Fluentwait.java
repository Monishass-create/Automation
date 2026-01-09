package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to demoqa dynamic properties
		driver.get("https://demoqa.com/dynamic-properties");
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 387).perform();
		
		//button is enabled after
		WebElement btn = driver.findElement(By.id("enableAfter"));
		
		//create object for fluent wait
	    FluentWait fwait = new FluentWait(driver);
	    
	    //modify the polling time
	    fwait.pollingEvery(Duration.ofSeconds(1));
	    
	    //give fluent wait
	    fwait.withTimeout(Duration.ofSeconds(20));
		
	    //condition
		fwait.until(ExpectedConditions.elementToBeClickable(btn));
		
		btn.click();
		System.out.println("button clicked");
		
		
				
		
	}

}
