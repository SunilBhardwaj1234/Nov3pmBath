package basicTestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genricUtility.FileUtility;
import pomRepo.loginPage;

public class ToVerifyHomePageTest {

			public static void main(String[] args) throws IOException  {
				 FileInputStream fis = new FileInputStream("./testData/data.properties");  
			        
			        Properties property = new Properties();
			        property.load(fis);
			        //String url = property.getProperty("url");
			        //String username = property.getProperty("username");
			       	//String password = property.getProperty("password");
			      		
			       	   FileInputStream fisExcel= new FileInputStream("./testData/exceldata.xlsx");
			       	    Workbook workbook = WorkbookFactory.create(fisExcel);
			       	    
			    	
			     
			}

		

		
	}


