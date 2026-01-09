package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoweb 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			
			//navigate to dws
			driver.get("https://demowebshop.tricentis.com/");
			
			//enter email
			driver.findElement(By.id("newsletter-email")).sendKeys("monishass16@gmail.com");
			
			//clock on subscribe
			driver.findElement(By.id("newsletter-subscribe-button")).click();
			
			//click on books
			driver.findElement(By.partialLinkText("Books")).click();
			
			//add to cart
			driver.findElement(By.className("product-box-add-to-cart-button")).click();
			
			//click on shopping cart
			driver.findElement(By.linkText("Shopping cart")).click();
			Thread.sleep(2000);
			
			//click on any checkbox
			driver.findElement(By.name("removefromcart")).click();
			
			//click on dws
			driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']")).click();
			Thread.sleep(2000);
			
			//click on fb
			driver.findElement(By.linkText("Facebook")).click();
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			for(String allid:child)
			{
				driver.switchTo().window(allid);
			}
			
			//capture title
			String title = driver.getTitle();
			System.out.println(title);
			
			//capture url
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			//enter un & pwd
			driver.findElement(By.id("_r_3_")).sendKeys("dinga");
			driver.findElement(By.id("_r_7_")).sendKeys("dingi@123");
			
			//click on login
			driver.findElement(By.cssSelector("div[aria-label='Log in to Facebook']")).click();
			Thread.sleep(2000);
			
			//close fb
			driver.close();
			
			
		}

	}


