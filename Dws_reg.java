package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws_reg
{
	

	public static void main(String[] args) throws IOException 
	{
		//create the obj for fileinputstream
		FileInputStream fis =new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//dws.properties");
		
		//create the obj for properties cls
		Properties prop = new Properties();
		
		//call the method
		prop.load(fis);
		

		//call the method
		 String url = prop.getProperty("Url");
		 
		 //launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		//create the obj for java representation file
		FileInputStream fiss=new FileInputStream("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//Book.xlsx");
		
		//call method called create()
		Workbook wb = WorkbookFactory.create(fiss);
		
		//take control of sheet
		Sheet sh = wb.getSheet("sheet1");
		
		//take control of row
		Row ro = sh.getRow(0);
		
		//take control of cell
		Cell ce = ro.getCell(0);
		
		//read data from cell
		String firstname = ce.getStringCellValue();
		String lastname = sh.getRow(1).getCell(0).getStringCellValue();
		String email = sh.getRow(2).getCell(0).getStringCellValue();
		String pwd = sh.getRow(3).getCell(0).getStringCellValue();
		String confirmpwd = sh.getRow(4).getCell(0).getStringCellValue();
		Demowebshop_register dws = new Demowebshop_register(driver);
		
		dws.getRegisterbtn().click();
		dws.getGenderclk().click();
		dws.getFirstTf().sendKeys(firstname);
		dws.getLastTF().sendKeys(lastname);
		dws.getEmailTF().sendKeys(email);
		dws.getPwdTF().sendKeys(pwd);
		dws.getConfirmpwdTF().sendKeys(confirmpwd);
		dws.getRegisterbutton().click();
		
		
		
		
	}

}
