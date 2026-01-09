package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			
			//navigate to flipkart
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			//driver.navigate().back();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			//capture height and width
			Dimension size = driver.manage().window().getSize();
			int height = size.getHeight();
			System.out.println(height);
			int width = size.getWidth();
			System.out.println(width);
			
			// set browser window
			driver.manage().window().setSize(new Dimension(600, 700));
			
			//position of browser window
			Point position = driver.manage().window().getPosition();
			System.out.println(position);
			
			//capture window id
			String id = driver.getWindowHandle();
			System.out.println(id);
			driver.quit();
		}

	}



