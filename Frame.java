package frames;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Frame 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to demoqa
		driver.get("https://demoqa.com/frames");
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 400).perform();
		
		//switching the frame
		driver.switchTo().frame("frame2");
		
		//print the text
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		
		//switching back to the mp 
	   driver.switchTo().defaultContent();
	   
		//switching the another frame
	   driver.switchTo().frame(3);
	   
	   //act.scrollByAmount(0, -400).perform();
	   
	   WebElement txt = driver.findElement(By.id("sampleHeading"));
	   System.out.println(txt.getText());
		
	   driver.switchTo().defaultContent();
	   
	   //take ss of toolsqa
		WebElement img = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		File temp = img.getScreenshotAs(OutputType.FILE);
		File dest = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshot web/img.png");
		FileHandler.copy(temp, dest);
		
		driver.quit();
		
	}

}
