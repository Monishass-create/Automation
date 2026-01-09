package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		// locate the dropdown
		WebElement drop = driver.findElement(By.name("multi"));
		// perform all the methods
		Select s = new Select(drop);
		s.deselectByIndex(0);
		Thread.sleep(2000);
				List<WebElement> options = s.getOptions();
		for (WebElement webElement : options)
		{
			System.out.println(webElement.getText());
		}
		s.deselectByIndex(2);
		s.selectByValue("ham");
		Thread.sleep(2000);
		s.selectByVisibleText("Onion gravy");
		Thread.sleep(2000);
		System.out.println("printing of allselected options");
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement Element : all) 
		{
			System.out.println(Element.getText());
		}
		System.out.println("printing of first");
		s.selectByVisibleText("Onion gravy");
		Thread.sleep(2000);
		s.selectByValue("ham");
		Thread.sleep(2000);
       WebElement first = s.getFirstSelectedOption();
       System.out.println(first.getText());
       System.out.println("printing the t or f");
		boolean multi = s.isMultiple();
		System.out.println(multi);
		

	}

}
