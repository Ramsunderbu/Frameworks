package frameWorks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeExcel {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sabari\\eclipse-workspace\\frameWorks\\src\\test\\java\\Excel sheet.xlsx");
	
		
		FileInputStream Stream = new FileInputStream(f);
		
	  Workbook workbook =new XSSFWorkbook(Stream);
	    
	    Sheet sheet = workbook.getSheet("Sheet1");
	    
	    Row row = sheet.getRow(1);
	    
	    Cell cell = row.getCell(1);
	    System.out.println(cell);
	}

}
