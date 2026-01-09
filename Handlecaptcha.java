package captcha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Handlecaptcha 
{
	public static void main(String[] args) throws IOException, TesseractException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to irctc
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-align-justify'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='LOGIN / REGISTER']")).click();
		
		//take ss
		WebElement ele = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File src = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshot web/cap.png");
		org.openqa.selenium.io.FileHandler.copy(temp, src);
		
		//tessract cls from tess4j
		Tesseract tess = new Tesseract();
		
		//set the data path
		tess.setDatapath("C:\\Users\\Asus\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		
		// use method doOcr to convert img to text
		String text1 = tess.doOCR(src);
		
		//remove space from text
		String actualtext = text1.replace(" ","");
		System.out.println(actualtext);
		
		driver.findElement(By.id("captcha")).sendKeys(actualtext);
        
		
		
		
		
	}

}
