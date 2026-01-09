package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle 
{
public static void main(String[] args) 
{
	 //launch the browser
	WebDriver driver=new ChromeDriver();
	
	//navigate to flipkart
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	// capture parent id
	String id = driver.getWindowHandle();
	System.out.println(id);
}
}
