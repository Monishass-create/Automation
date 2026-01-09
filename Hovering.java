package actionsclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Hovering 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//navigate to flipkart
	driver.get("https://www.flipkart.com/");
	
	//locate login
	WebElement ele = driver.findElement(By.linkText("Login"));
	
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(2000);
	
	//locate more options (kebab menu)
	WebElement off = driver.findElement(By.cssSelector("a[title='Dropdown with more help links']"));
	
	act.moveByOffset(415, 0).perform();
	Thread.sleep(2000);
	
	//take screenshot
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//Screenshot/hovering.png");
	FileHandler.copy(src, dest);
	

	}

}
