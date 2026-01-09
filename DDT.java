package grooming;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT 
{
	public static void main(String[] args) throws IOException 
	{
		//create the obj for fileinputstream
		FileInputStream fis = new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//data.properties");
		
		//create the obj for properties cls
		Properties prop = new Properties();
		
		//call the method
		prop.load(fis);
		
		//call the method
		String url = prop.getProperty("Url");
		String first = prop.getProperty("firstname");
		String last = prop.getProperty("lastname");
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		driver.findElement(By.id("FirstName")).sendKeys(first);
		driver.findElement(By.id("LastName")).sendKeys(last);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		String conf = prop.getProperty("confirm");
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conf);
		
		
	}

}
