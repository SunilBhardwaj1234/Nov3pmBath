package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TofetchDataFromExcel {


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
FileInputStream fis= new FileInputStream("./testData/exceldata.xlsx");
 Workbook workbook = WorkbookFactory.create(fis);
 Sheet sheet = workbook.getSheet("sheet1");
 Row row = sheet.getRow(1);
 Cell cell = row.getCell(0);
 url=
 
 


	}

}


