package commonutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excw {

	public void Rowcoung() throws IOException{
		FileInputStream File= new FileInputStream("");
		XSSFWorkbook Workbook=new XSSFWorkbook(File);
		XSSFSheet sheet=Workbook.getSheet("test");
		int Row=sheet.getLastRowNum()+1;
		
	}
}
