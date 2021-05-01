package datadriven;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class APacheReader {
	public static void main(String[] args) throws Exception {
		File frc=new File("C:\\Users\\GUDU\\Desktop\\facebbook.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(frc);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getPhysicalNumberOfRows();
		for (int i=0;i<rowCount;i++){
			int colCount=sh.getRow(i).getPhysicalNumberOfCells();
			for(int j=0;j<colCount;j++){
				XSSFCell cell=sh.getRow(i).getCell(j);
				System.out.print("--"+cell);
			
			
			}
		System.out.println();
		}
	    
		
	}

}
