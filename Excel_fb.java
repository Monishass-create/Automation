package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_fb 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create obj for java representation file
		FileInputStream fis = new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//FB.xlsx");
		
		//call method called create()
		Workbook wb = WorkbookFactory.create(fis);
				
		//take control of sheet
		Sheet sh = wb.getSheet("sheet1");
				
		//read data from cell
		String url = sh.getRow(0).getCell(0).getStringCellValue();
		String mail = sh.getRow(1).getCell(0).getStringCellValue();
		String pwd = sh.getRow(2).getCell(0).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.close();
		
		
		
		
	}

}
