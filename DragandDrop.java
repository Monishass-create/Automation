package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to interaxtion page
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		//locate the draggable and droppable
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		
	}

}
