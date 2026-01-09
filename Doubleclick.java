package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to zepto
		driver.get("https://www.zepto.com/");
		
		//click on stf
		driver.findElement(By.cssSelector("span[class='flex flex-1 items-center gap-x-1 text-md font-extralight text-gray-700']")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.doubleClick().perform();
		Thread.sleep(3000);
		
		WebElement click = driver.findElement(By.xpath("(//a[@class='B4vNQ'])[2]"));
		Thread.sleep(2000);
		
		act.doubleClick(click).perform();
		
	}

}
