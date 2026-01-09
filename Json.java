package json;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Json
{
	public static void main(String[] args) throws IOException, ParseException
	{
		//create obj for filereader
		FileReader fir = new FileReader("C://Users//Asus//Desktop//Maven Project//seleniumm//src//test//resources//log.json");
		
		//create obj for JSONParser
		JSONParser parser = new JSONParser();
		
		//Convert json into java
	Object jObject = parser.parse(fir);
		
		//convert java into jsonobject
		//downcasting
		JSONObject obj = (JSONObject)jObject;
		
		//read data from json file using get()
		String URL = obj.get("url").toString();
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
	}

}
