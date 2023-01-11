package genricUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUility {
	public String fetchStringDataFromExcelSheets(String SheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{

	   FileInputStream fisExcel= new FileInputStream("./testData/exceldata.xlsx");
  	    Workbook workbook = WorkbookFactory.create(fisExcel);
  	return workbook.getSheet(SheetName).getRow(rowNo).getCell(cellNo).toString();
  	    
	}

}
