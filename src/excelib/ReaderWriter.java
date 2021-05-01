package excelib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		File frc=new File("‪‪C:\\Users\\GUDU\\Desktop\\reader.xls");
		
			FileInputStream fis=new FileInputStream(frc);
		
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sh=wb.getSheetAt(0);
			int rowcount=sh.getPhysicalNumberOfRows();
			for(int i=1;i<rowcount;i++){
			int colcount=sh.getRow(i).getPhysicalNumberOfCells();
			for(int j=1;j<colcount;j++){
			String cell=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(" "+cell);
			}
			System.out.println();
			}
		}
	}
