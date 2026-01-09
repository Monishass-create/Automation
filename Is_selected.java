package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigate to dws
		driver.get("https://demowebshop.tricentis.com/");

		// click on poor radio button
		driver.findElement(By.xpath("//label[@for='pollanswers-3']/preceding-sibling::input")).click();

		driver.findElement(By.partialLinkText("Books")).click();

		// add any product to cart
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(3000);

		// go to shopping cart
		driver.findElement(By.linkText("Shopping cart")).click();

		// check the checkbox is selected or not
		boolean checkbox = driver.findElement(By.name("removefromcart")).isSelected();
		System.out.println(checkbox);

	}

}
