package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axes 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to dws
			driver.get("https://demowebshop.tricentis.com/");
			
			//enter laptop
			driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
			
			 //click on search button(axes)
			driver.findElement(By.xpath("//input[@value='Search store']/following-sibling::input")).click();
			
			//again comeback to home page
			driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']")).click();
			
			
			//click on good radio button(axes)
			driver.findElement(By.xpath("//label[@for='pollanswers-2']/preceding-sibling::input")).click();
			
		}

	}


