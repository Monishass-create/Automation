package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to demoqa
		driver.get("https://demoqa.com/buttons");
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 370);
		
		//locate double click btn
		WebElement btn = driver.findElement(By.id("doubleClickBtn"));
		
		//create object for explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		
		//perform double click
		act.doubleClick(btn).perform();
		
		//print the msg
		WebElement msg = driver.findElement(By.id("doubleClickMessage"));
		System.out.println(msg.getText());
		

		
		        


	

		
	}

}
