package ddt;

import java.io.FileInputStream;
import java.io.IOException;import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args) throws IOException 
	{
		//create obj for java configuration file
		FileInputStream fis = new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//datas.properties");
		
		//create obj for file type obj
		Properties prop = new Properties();
		
		//load all the keys
		prop.load(fis);
		
		//read data from properties file
		String url = prop.getProperty("Url");
		String first = prop.getProperty("fn");
		String last = prop.getProperty("ln");
		String num = prop.getProperty("mobile");
		String pass = prop.getProperty("pwd");
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to fb
		driver.get(url);
		
		driver.findElement(By.name("firstname")).sendKeys(first);
		driver.findElement(By.name("lastname")).sendKeys(last);
		driver.findElement(By.name("reg_email__")).sendKeys(num);
		driver.findElement(By.id("password_step_input")).sendKeys(pass);
		
	}

}
