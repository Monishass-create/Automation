package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to dws
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on add to cart
		driver.findElement(By.xpath("(//div[@class='item-box'])[2]//input[@value='Add to cart']")).click();
		
		
		//go to shopping cart
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.navigate().refresh();
		
		
		//click on checkbox
		driver.findElement(By.name("removefromcart")).click();
		
	}

}
