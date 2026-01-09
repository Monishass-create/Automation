package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
		public static void main(String[] args) 
		{
			//launch the browser
			WebDriver driver=new ChromeDriver();
			
			//navigate to amazon
			driver.get("https://www.amazon.in/");
			
			//
			driver.findElement(By.cssSelector("form[method='get']")).click();
			
			
	     	//locate search text field
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
			
			
			//click on search button
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			
			
			//click on first product
			driver.findElement(By.cssSelector("img[class='s-image']")).click();
			
			
			//capture parent id
		    String parent = driver.getWindowHandle();
		    
		    
		    //capture all id
		    Set<String> child = driver.getWindowHandles(); 
		    
		    
		    //remove the particular id
		    child.remove(parent);
		    
		    
		    //switching the driver control
		    for(String allchild:child)
		    {
		    	driver.switchTo().window(allchild);
		    }
		    
		    
			//add to cart
			driver.findElement(By.id("add-to-cart-button")).click();
		
		}

	}



