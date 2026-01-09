package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Webelement
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to dws
		driver.get("https://demowebshop.tricentis.com/");
		
		//search for computers
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		
		//capture height,width,x and y
		 Rectangle check = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).getRect();
		System.out.println("height : " + check.getHeight());
		System.out.println("width : " + check.getWidth());
		System.out.println("x : " + check.getX());
		System.out.println("y : " + check.getY());
		
		//check add to cart is enabled or not
		WebElement btn = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		System.out.println("is enabled : " );
		System.out.println(btn.isEnabled());
		
		//click on add to cart
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='400 GB  [+100.00]']/preceding-sibling::input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		//go to shopping cart
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.navigate().refresh();
		
		
		//check whether the checkbox is selected or not
		boolean box = driver.findElement(By.name("removefromcart")).isSelected();
		System.out.println("is selected : " );
		System.out.println(box);
		
		
		//take ss of entire remove box
		WebElement screen = driver.findElement(By.cssSelector("tr[class='cart-item-row']"));
		 File temp = screen.getScreenshotAs(OutputType.FILE);
		 File src = new File("./screenshott/dws.png");
		 FileHandler.copy(temp, src);
		 
		 //check whether it is displayed or not apply coupon button
		boolean display = driver.findElement(By.name("applydiscountcouponcode")).isDisplayed();
		System.out.println("is displayed : " );
		System.out.println(display);
		
		//click on apply button
		driver.findElement(By.cssSelector("input[value='Apply coupon']")).click();
		
		//capture error msg
		String text = driver.findElement(By.xpath("//div[@class='message']")).getText();
		System.out.println("error msg : " );
		System.out.println(text);
		
		driver.navigate().refresh();
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 2000).perform();
		
		//capture ss of error msg box
		WebElement shott = driver.findElement(By.xpath("//div[@class='coupon-box']"));
		File source = shott.getScreenshotAs(OutputType.FILE);
		File dest = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshott/msg.png");
		FileHandler.copy(source, dest);
		
		//capture css properties of checkout(3)
		WebElement properties = driver.findElement(By.id("checkout"));
		System.out.println("css properties : " );
		System.out.println(properties.getCssValue("font"));
		System.out.println(properties.getCssValue("border-radius"));
		System.out.println(properties.getCssValue("text-decoration"));
		
		//click on facebook
		driver.findElement(By.linkText("Facebook")).click();
	
      	String parent = driver.getWindowHandle();
	   Set<String> child = driver.getWindowHandles();
	   child.remove(parent);
	   for (String allchild: child) 
	   {
		   driver.switchTo().window(allchild);	
		   System.out.println("window switched");
	   }
		
		//enter usn and pwd
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dingi@gmail.com");
	   driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("dingi@123");
	   
	   //capture ss of entire window
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File capture = ts.getScreenshotAs(OutputType.FILE);
	   File win = new File("./screenshott/window.png");
	   FileHandler.copy(capture, win);
	   
	   //close facebook
	   driver.close();
	   
	   //come back to previous window
	    //driver.navigate().back();
	   // Thread.sleep(2000);
	   driver.switchTo().window(parent);
	   
	   //take ss of entire window
	    TakesScreenshot ss=(TakesScreenshot)driver;
		File cart = ss.getScreenshotAs(OutputType.FILE);
		File cap = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshott/entire.png");
		FileHandler.copy(cart, cap);
		
		//quit
		driver.quit();
	 
	   

		
		
		
		
		
		
	}

}
