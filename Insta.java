package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//without this or any waiting cmd it throw nosuchelementexception
		
		//navigate to instagram
		driver.get("https://www.instagram.com/");
		
		//locate usn&pwd
		driver.findElement(By.name("username")).sendKeys("monisha_003");
		driver.findElement(By.name("password")).sendKeys("monisha@1614");
		
	}

}
