package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prompt
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to demoqa alerts
		driver.get("https://demoqa.com/alerts");
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 400).perform();
		
		//loacte the promt button
		driver.findElement(By.id("promtButton")).click();
		
		//switch to popup
		Alert alt = driver.switchTo().alert();
		
		//capture the text
		System.out.println(alt.getText());
		
		//send the text
		alt.sendKeys("popup is handled");
		
		//click on the btn
		alt.accept();
		
	}

}
