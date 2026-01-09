package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		driver.findElement(By.cssSelector("span[class='ng-tns-c2785778308-3 icon-cancel']")).click();
		driver.findElement(By.id("password")).sendKeys("dingidinga123");
		WebElement img = driver.findElement(By.cssSelector("button[tabindex='0']"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.clickAndHold(img).perform();
		
	}
	
}
