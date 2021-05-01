package collection;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelUsingPOI {
	public static void main(String[] args) {
		// Create instance of the class and call the writeExcelFile()
		WriteExcelUsingPOI writeExcelUsingPOI = new WriteExcelUsingPOI();
		writeExcelUsingPOI.writeExcelFile("C:\\Users\\GUDU\\Desktop\\kscodes\\ExcelFillTest.xlsx");
	}
 
	public void writeExcelFile(String fileName) {
		XSSFWorkbook workbook = null;
		FileOutputStream fileOutputStream = null;
		try {
 
			fileOutputStream = new FileOutputStream(new File(fileName));
 
			// Create a Workbook
			workbook = new XSSFWorkbook();
 
			// Create an Empty Sheet
			XSSFSheet sheet = workbook.createSheet("FillTest");
 
			Row row = sheet.createRow(1);
			Cell cell = row.createCell((short) 1);
			cell.setCellValue("Test the Fill - kscodes");
 
			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		    cell.setCellStyle(style);
		    
		    cell = row.createCell((short) 3);
			cell.setCellValue("Test the Color - kscodes");
			style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		    style.setFillPattern(CellStyle.BRICKS);
		    cell.setCellStyle(style);
		    
 
			workbook.write(fileOutputStream);
 
			System.out.println("Excel File created and written !!!!");
 
		} catch (Exception e) {
			System.out.println("An Exception occured while writing Excel" + e);
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (workbook != null) {
					workbook.close();
				}
			} catch (Exception e) {
			}
		}
	}
}
