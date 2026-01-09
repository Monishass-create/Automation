package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleattribute 
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//navigate to yt
			driver.get("https://www.youtube.com/");
			
			//search any song
			driver.findElement(By.xpath("//input[@type='text' and @role='combobox']")).sendKeys("monica song");
			
			//click stf
			driver.findElement(By.xpath("//button[@title='Search']")).click();
			Thread.sleep(2000);
			
			//play the video
			driver.findElement(By.xpath("//a[@id='video-title' and @title='Monica - Video Song | COOLIE | Superstar Rajinikanth | Sun Pictures | Lokesh | Anirudh | Pooja Hegde']")).click();
			
			
		}

	}



