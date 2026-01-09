package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_url_method 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		 //launch the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to myntra
		driver.navigate().to(new URL("https://www.myntra.com/"));
		
		
	}

}
