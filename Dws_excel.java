package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws_excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create obj for java configuration file
		FileInputStream fis = new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//web.properties");
				
		//create obj for file type obj
		Properties prop = new Properties();
				
		//load all the keys
		prop.load(fis);
				
		//read data from properties file
		String url = prop.getProperty("Url");
		
		//create obj for java representation file
		FileInputStream fiss = new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//dws.xlsx");
				
		//call method called create()
		Workbook wb = WorkbookFactory.create(fiss);
						
		//take control of sheet
		Sheet sh = wb.getSheet("sheet1");
		
		//read the dat from cell
		String search = sh.getRow(0).getCell(0).getStringCellValue();
		String mail = sh.getRow(1).getCell(0).getStringCellValue();
		String pwd = sh.getRow(2).getCell(0).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		//driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.findElement(By.linkText("Log in")).click();
	
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		
	}

}
