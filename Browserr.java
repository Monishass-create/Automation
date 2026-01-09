package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser
{
	 public static void main(String[] args) throws InterruptedException
	 {
		 //launch the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to myntra
		driver.get("https://www.myntra.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//capture the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//capture the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.quit();

}
}