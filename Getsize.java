package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize 
{
	public static void main(String[] args)
	{ 
		 //launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//capture the height and width
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		//capture the height separately
		int height = size.getHeight();
		System.out.println(height);
		
		//capture the width separately
		int width = size.getWidth();
		System.out.println(width);
		
	}

}
