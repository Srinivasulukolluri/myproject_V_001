package genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import genericlib.constants;

public class excelllib {
static File file = null;
	
	public static String getexcellData(String sheetName,int rowNum,int cellNum) throws Exception {
		
		 
		  file = new File(constants.testdatafilepath);		  
		  FileInputStream fis = new FileInputStream(file);
		  
		  XSSFWorkbook workbook = new XSSFWorkbook(fis);
		  
		  XSSFSheet sheet = workbook.getSheet("sheetName");
		  
		  XSSFRow row = sheet.getRow(rowNum);
		  
		  String data = row.getCell(cellNum).getStringCellValue();
		
		  return data;	
		  }
	
	public static void setExcelData(String sheetname,int rownum,int cellnum,String setData) throws Exception {
		
		 FileInputStream fis = new FileInputStream(file);
		  
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
		  
		  XSSFSheet sheet = workbook.getSheet("sheetname");
		  
		  XSSFRow row = sheet.getRow(rownum);
		  
		  XSSFCell cell = row.createCell(cellnum);
		  
		  FileOutputStream fos = new FileOutputStream(file);
		  
		  cell.setCellValue("cellnum");
		  
		  workbook.write(fos);
		  
		  workbook.close();
	}
	
	

}
