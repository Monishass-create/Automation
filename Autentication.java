package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autentication
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to heroku app
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://user:passwd@httpbin.org/basic-auth/user/passwd");
		
	}

}
