package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart 
{
		public static void main(String[] args) throws IOException, InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to flipkart
			driver.get("https://www.flipkart.com/");
			
			//search for samsung
			 driver.findElement(By.name("q")).sendKeys("samsung");
	         driver.findElement(By.cssSelector("button[type='submit']")).click();
			
			
			
			//capture the text
			WebElement pro = driver.findElement(By.xpath("//span[text()='samsung']"));
			System.out.println(pro.getText());
			
		
			//click on first product
			driver.findElement(By.xpath("//div[text()='Samsung Galaxy S24 5G Snapdragon (Marble Gray, 128 GB)']")).click();
			
			//take screenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File src = new File("./Screenshot/fl.png");
			FileHandler.copy(temp, src);
			
			//switching the window
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			for(String allchild:child)
			{
				driver.switchTo().window(allchild);
			}
			
			//click on compare
			driver.findElement(By.xpath("//label[text()='Compare']")).click();
			
			driver.findElement(By.xpath("//span[text()='COMPARE']")).click();
			
			Thread.sleep(3000);
			
			//take screenshot
			TakesScreenshot s=(TakesScreenshot)driver;
			File source = s.getScreenshotAs(OutputType.FILE);
			File dest = new File("C://Users//Asus//Desktop//Maven Project//Selenium//Screenshot/comp.png");
			FileHandler.copy(source,dest);
			
			
			
			
			
			
		}

	}


