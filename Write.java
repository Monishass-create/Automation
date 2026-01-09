package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create obj for java representation file
				FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\Maven Project\\seleniumm\\src\\test\\resources\\Write.xlsx");
				
				//call method called create()
				Workbook wb = WorkbookFactory.create(fis);
						
				//take control of sheet
				//Sheet sh = wb.getSheet("sheet1");
						
				//read data from cell
//				String url = sh.getRow(0).getCell(0).getStringCellValue();
//				String mail = sh.getRow(1).getCell(0).getStringCellValue();
//				String pwd = sh.getRow(2).getCell(0).getStringCellValue();
//				
				wb.createSheet("insta").createRow(9).createCell(4).setCellValue("open instragram");
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\Desktop\\Maven Project\\seleniumm\\src\\test\\resources\\Write.xlsx");
				wb.write(fos);
				wb.close();
		
	}

}
