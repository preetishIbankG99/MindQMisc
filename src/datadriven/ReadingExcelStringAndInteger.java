package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelStringAndInteger {

public static void main(String[] args) {

	try{
		File frc=new File("D:\\workspace\\MindQ\\Excel\\demo.xlsx");
		FileInputStream fis=  new FileInputStream(frc);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		Iterator<Row>rowIterator=sh.iterator();
		while(rowIterator.hasNext())
		{
			Row row=rowIterator.next();
			Iterator<Cell>cellIterator=row.cellIterator();
		while(cellIterator.hasNext()){
			Cell cell=cellIterator.next();
			switch(cell.getCellType())
			{
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println(cell.getNumericCellValue()+"");
				break;
				
			case Cell.CELL_TYPE_STRING:
				System.out.println(cell.getStringCellValue()+"");
				break;
		}
		
		
		}
		System.out.println();
		
		}
		fis.close();
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
}
}
