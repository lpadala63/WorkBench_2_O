//Sreeram
package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {
	//"C:\\Users\\"+System.getProperty("user.name")+"\\Desktop\\"+Excelname+".xlsx"
	//"Testdata/"+filename+".xlsx"
	//"\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\EzappAutomationtestdata\\"+filename+".xlsx";
	public String path=System.getProperty("user.dir")+"\\Testdata\\EzApp_WholeLife_TestData.xlsx";
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
    private static String s1 = "Testdata/EzApp_WholeLife_TestData.xlsx";
	private static Map<String, String> map = new HashMap<>();
	
	final String exceldata = System.getenv("Excelfile");
	
	
	public String get(String testcasename, String filename, String sheetName, String columnname) throws IOException {
		FileInputStream fis; //"Testdata/"+Excelname+".xlsx"
		int k = 0;
		try {
			//fis = new FileInputStream(("Testdata\\"+filename+".xlsx"));
			//fis = new FileInputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\EZ-App\\"+filename+".xlsx");
			//fis = new FileInputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\EZ-App\\"+System.getenv("inputtestdata"));
			fis = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\"+filename+".xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet(sheetName);
			int rows = ws.getPhysicalNumberOfRows();
			for (int i = 0; i < rows; i++) {
				int cols = ws.getRow(0).getPhysicalNumberOfCells();
				for (int j = 0; j < cols; j++) {
					if (ws.getRow(i).getCell(j).toString().replace(".0", "").equalsIgnoreCase(columnname)) {

						k = j;
					}
					map.put(ws.getRow(i).getCell(0).toString().replace(".0", ""),ws.getRow(i).getCell(k).toString().replace(".0", ""));
				}
			}
			wb.close();
			fis.close();
		} catch (Exception e) {
		}
	   	return map.get(testcasename);
	}
	
	
	/*public String get(String testcasename, String filename, String sheetName, String columnname) throws IOException {
		FileInputStream fis; 
		int k = 0;
		try {
			//fis = new FileInputStream(("Testdata\\"+filename+".xlsx"));
			fis = new FileInputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\EZ-App\\"+filename+".xlsx");
			//fis = new FileInputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\EZ-App\\"+System.getenv("inputtestdata"));
			//fis = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\"+filename+".xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet(sheetName);
			int rows = ws.getPhysicalNumberOfRows();
			for (int i = 0; i < rows; i++) {
				int cols = ws.getRow(0).getPhysicalNumberOfCells();
				for (int j = 0; j < cols; j++) {
					if (ws.getRow(i).getCell(j).toString().replace(".0", "").equalsIgnoreCase(columnname)) {
						
						k = j;
					}
					map.put(ws.getRow(i).getCell(0).toString().replace(".0", ""),ws.getRow(i).getCell(k).toString().replace(".0", ""));
				}
			}
			wb.close();
			fis.close();
		} catch (Exception e) {
		}
	   	return map.get(testcasename);
	}*/
	
	
	
	public boolean setCellData(String filename,String sheetName, String colName, int rowNum, String data) {
		try {
			fis = new FileInputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\EZ-App\\"+filename+".xlsx");
			//fis = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\"+filename+".xlsx");
			workbook = new XSSFWorkbook(fis);
			if (rowNum <= 0)
				return false;
			int index = workbook.getSheetIndex(sheetName);
			int colNum = -1;
			if (index == -1)
				return false;
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return false;
			sheet.autoSizeColumn(colNum);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				row = sheet.createRow(rowNum - 1);
			cell = row.getCell(colNum);
			if (cell == null)
				cell = row.createCell(colNum);
			cell.setCellValue(data);
			fileOut = new FileOutputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\EZ-App\\"+filename+".xlsx");
			//fileOut = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\"+filename+".xlsx");
			workbook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public boolean writedata(String filename,String sheetName, String colName, int rowNum, String data) {
		try {
			fis = new FileInputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\"+filename+".xlsx");
			//fis = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\"+filename+".xlsx");
			workbook = new XSSFWorkbook(fis);
			if (rowNum <= 0)
				return false;

			int index = workbook.getSheetIndex(sheetName);
			int colNum = -1;
			if (index == -1)
				return false;

			sheet = workbook.getSheetAt(index);

			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return false;

			sheet.autoSizeColumn(colNum);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				row = sheet.createRow(rowNum - 1);

			cell = row.getCell(colNum);
			if (cell == null)
				cell = row.createCell(colNum);
			
			
			cell.setCellValue(data);

			fileOut = new FileOutputStream("\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\"+filename+".xlsx");
			//fileOut = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\"+filename+".xlsx");
			workbook.write(fileOut);

			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}