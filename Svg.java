package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Svg 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to instagram
		driver.get("https://www.instagram.com/");
		
		//locate fb icon and take ss
		WebElement svg = driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Log in with Facebook' ]"));
		
		File temp = svg.getScreenshotAs(OutputType.FILE);
		
		File src = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshot web/fb.png");
		
		FileHandler.copy(temp, src);
	}

}
