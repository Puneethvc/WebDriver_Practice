package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException  {
	
	
		// to read all the data from xlsx sheet
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int totalrows = sheet.getLastRowNum();
		int totalcell =sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows"+totalrows);
		System.out.println("Total Number of Cell"+totalcell);
		
		for(int r=0;r<totalrows;r++) {
			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c=0;c<totalcell;c++) {
				XSSFCell currentcell = currentrow.getCell(c);
				System.out.print(currentcell.toString()+"\t");
			}
			
			
			System.out.println();
		}
		wb.close();
		file.close();
		
		
		
		
		
		
		
	}
}
