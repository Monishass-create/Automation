package selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getposition
{
	public static void main(String[] args)
	{
		 //launch the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//  capture the x and y co-ordinates
//		Point position = driver.manage().window().getPosition();
//		System.out.println(position);
		
		driver.manage().window().setPosition(new Point(-10,-6));
		
	}

}
