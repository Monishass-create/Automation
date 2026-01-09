package actionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 2500).perform();
		Thread.sleep(2000);
		//act.scrollByAmount(0, -800).perform();
	}

}
