package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiNEw {
	public static void main(String[] args) {
		File f=new File("H:\\testing tools videos\\Mukesh selenium\\Selenium Easy.xlsx");
		try {
			FileInputStream fis=new FileInputStream(f);
		try {
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		    
			XSSFSheet sh= wb.getSheetAt(0);
		    
			int rows=sh.getPhysicalNumberOfRows();
		    for(int i=0;i<rows;i++){
			int cols=sh.getRow(i).getPhysicalNumberOfCells();
			for(int j=0;j<cols;j++){
			XSSFCell cell=sh.getRow(i).getCell(j);
			System.out.print("--"+cell);
				
				
			}

		    System.out.println();
		    }




		} catch (IOException e) {
			
			e.printStackTrace();
		}






		} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		}
}
