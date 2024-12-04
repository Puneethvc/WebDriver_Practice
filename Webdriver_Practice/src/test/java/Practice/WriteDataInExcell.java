package Practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcell {

	public static void main(String[] args) throws IOException {

		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\mydata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet= wb.createSheet("data");
		
		XSSFRow row1 =sheet.createRow(0);
		
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue("123");
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("python");
		row2.createCell(1).setCellValue("123");
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("c#");
		row3.createCell(1).setCellValue("123");
		row3.createCell(2).setCellValue("Automation");
		
		wb.write(file);
		wb.close();
		file.close();
		
		System.out.println("File Created successfully..........");
	}

}
