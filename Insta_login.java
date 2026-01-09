package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_login
{
	public static void main(String[] args) throws IOException 
	{
			//create the obj for fileinputstream
			FileInputStream fis =new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//login.properties");
			
			//create the obj for properties cls
			Properties prop = new Properties();
			
			//call the method
			prop.load(fis);
			
			//call the method
			 String url = prop.getProperty("Url");
			 String un = prop.getProperty("un");
			 String pwd = prop.getProperty("pwd");
			 
			 //launch the browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
			Login log = new Login(driver);
			log.getUserTF().sendKeys(un);
			log.getPswdTF().sendKeys(pwd);
			log.getLoginbtn().click();
			
	
		
	}

}
