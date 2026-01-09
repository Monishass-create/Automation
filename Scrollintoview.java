package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoview 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to dws
		driver.get("https://demowebshop.tricentis.com/");
		
		//locate the we
		//WebElement view = driver.findElement(By.linkText("Facebook"));
		WebElement view = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		
		//perform scrolling actions(0,500)
		   //downcasting
		JavascriptExecutor  jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)",view);
		
	}

}
