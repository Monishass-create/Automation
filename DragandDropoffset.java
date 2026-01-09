package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropoffset
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 1000);
		act.dragAndDropBy(drag, 263, 0).perform();
		
	}

}
