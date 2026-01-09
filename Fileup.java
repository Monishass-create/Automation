package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileup 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to any uploading file website
		driver.get("https://smallpdf.com/png-to-pdf");
		
		//locate the choose file & pass the file path
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//upload.png");
		
	}

}
