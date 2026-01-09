package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//browser window maximize
		driver.manage().window().maximize();
		//navigate to selnium dev formpage
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		//locate the dropdown
		WebElement drop = driver.findElement(By.name("select_empty_multiple"));
		//perform all the methods
		Select s=new Select(drop);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("select_3");
		Thread.sleep(2000);
		s.selectByValue("select_4");
		Thread.sleep(2000);
		
		
		s.deselectByVisibleText("select_4");
		Thread.sleep(2000);
		
		WebElement down = driver.findElement(By.id("multi"));
		Select se=new Select(down);
		se.deselectByIndex(0);
		Thread.sleep(2000);
		se.deselectByValue("sausages");
		Thread.sleep(2000);
		se.selectByVisibleText("Ham");
		Thread.sleep(2000);
		se.selectByValue("onion gravy");
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.name("multi_true"));
		Select sel=new Select(dropdown);
		sel.selectByValue("select_1");
		Thread.sleep(2000);
		sel.selectByVisibleText("select_2");
		Thread.sleep(2000);
		sel.deselectAll();
		
	}

}
