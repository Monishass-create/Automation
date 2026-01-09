package grooming;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popups
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 1800).perform();
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		
		//switch the driver control from window to popup
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		
	}

}
