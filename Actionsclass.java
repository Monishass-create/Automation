package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        // Buttons Page 
	        driver.get("https://demoqa.com/buttons");
	        Thread.sleep(2000);

	        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
	        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

	        Actions act = new Actions(driver);
	        
	        act.scrollByAmount(0, 160).perform();  //  scroll amount
	        Thread.sleep(2000);
	        
	        // moveToElement
	        act.moveToElement(doubleClickBtn).perform();
	        Thread.sleep(2000);

	        // contextClick
	        act.contextClick(rightClickBtn).perform();
	        Thread.sleep(2000);

	        // doubleClick
	        act.doubleClick(doubleClickBtn).perform();
	        Thread.sleep(2000);

	        // Droppable Page 
	        driver.get("https://demoqa.com/droppable");
	        Thread.sleep(2000);

	        WebElement drag = driver.findElement(By.id("draggable"));
	        WebElement drop = driver.findElement(By.id("droppable"));
	        
	        act.scrollByAmount(0, 145).perform(); 
	        Thread.sleep(2000);

	        // clickAndHold + moveToElement + release
	        act.clickAndHold(drag).perform();
	        Thread.sleep(2000);
	        act.moveToElement(drop).perform();
	        Thread.sleep(2000);
	        act.release() .perform();
	        Thread.sleep(2000);
	       

	        // moveByOffset
	        act.clickAndHold(drag).perform();
	        Thread.sleep(2000);
	        act.moveByOffset(100, 50).perform();
	        Thread.sleep(2000);
	        act.release().perform();
	        Thread.sleep(2000);

	        // dragAndDrop
	        act.dragAndDrop(drag, drop).perform();
	        Thread.sleep(2000);

	        // dragAndDropby
	        act.dragAndDropBy(drag, 259, 0).perform();
	        Thread.sleep(2000);

	        //Scroll Actions
	        act.scrollByAmount(0, 500).perform();

	   

	        // driver.quit();
	    		
	
	
	
	

	}
}
