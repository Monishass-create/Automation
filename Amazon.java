package actionsclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to amazon
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//locate  country
		WebElement code = driver.findElement(By.xpath("(//button[@tabindex='0'])[1]"));
		
		//create object for actions class
		Actions act = new Actions(driver);
		
		//double click on country code
		act.doubleClick(code).perform();
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		//right click on cart
		act.contextClick().perform();
		Thread.sleep(2000);
		
		//take ss of cart
		WebElement cartt = driver.findElement(By.id("nav-cart"));
		File temp = cartt.getScreenshotAs(OutputType.FILE);
		File dest = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshot web/cart.png");
	    FileHandler.copy(temp, dest);
	}

}
