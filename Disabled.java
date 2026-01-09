package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to oracle jdk se documentation
		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		
		//locate the we
		driver.findElement(By.partialLinkText("jdk-23.0.2_doc-all.zip")).click();
		
		//perform action on  disabled element
		WebElement ele = driver.findElement(By.partialLinkText("Download jdk-23.0.2_doc-all.zip"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
	}

}
