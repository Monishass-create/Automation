
package captcha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Captcha {
public static void main(String[] args) throws IOException, TesseractException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.operations.irctc.co.in/callcenter/login.in;CJSESSIONID=lcR-eHUd6AcENt73yZxwLxiFW10QO3L8qMIBk3olNFAboLEX8Jv2!-1344870997");
	
	//take ss of captcha
	WebElement ss = driver.findElement(By.id("cimage"));
	File temp = ss.getScreenshotAs(OutputType.FILE);
	File source = new File("C://Users//Asus//Desktop//Maven Project//seleniumm//screenshott/ss.png");
	FileHandler.copy(temp, source);
	
	//tesseract class from tess4j
	Tesseract tess = new Tesseract();
	//setting the path in local storage
	tess.setDatapath("C:\\Users\\Asus\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
	//doOcr convert img to text
	String text1 = tess.doOCR(source);
	
	//remove space
	String actualtext = text1.replace(" ","");
	System.out.println(actualtext);
	driver.findElement(By.id("j_captcha")).sendKeys(actualtext);
}
}
