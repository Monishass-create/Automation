package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to dws
		driver.get("https://demowebshop.tricentis.com/");
		
		//locate search btn
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		//switch to popup
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		
		//capture the text
		System.out.println(alt.getText());
		
		//click on the btn
		alt.accept();
		
	}

}
