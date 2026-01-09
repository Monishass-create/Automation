package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_toelement 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement ele = driver.findElement(By.linkText("Myntra"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 2000).perform();
		Thread.sleep(2000);
		act.scrollToElement(ele).perform();
		Thread.sleep(2000);
		//act.scrollByAmount(0, -800).perform();
	}

}
