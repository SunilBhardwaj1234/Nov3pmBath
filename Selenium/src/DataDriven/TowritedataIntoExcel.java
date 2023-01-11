package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TowritedataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis =new FileInputStream("./testData/excelData.xlsx");

Workbook workbook = WorkbookFactory.create(fis);
workbook.getSheet("sheet1").getRow(0).createCell(3).setCellValue("name");
FileOutstream

	}

}
