package actitime.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File_Utility {
	public String readdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(All_File_path.excelFilepath);
		Workbook book = WorkbookFactory.create(fis);
		String value = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
