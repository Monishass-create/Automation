package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragg 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//locate the draggable
		WebElement drag = driver.findElement(By.xpath("//li[contains(@class,'ui-widget-content ui-corner-tr ui-')]"));
		WebElement drop = driver.findElement(By.id("trash"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
	}

}
