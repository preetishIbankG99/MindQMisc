package collection;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi1 {
	public static void main(String[] args) throws IOException {
//		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
////		driver.get("http://google.com");
		 XSSFWorkbook wb=new XSSFWorkbook("‪C:\\Users\\GUDU\\Desktop\\gudu123\\gudu.xlsx");
		 XSSFSheet sh=wb.getSheet("Sheet1");
		 int rowCount=sh.getPhysicalNumberOfRows();
		 for(int i=0;i<rowCount;i++){
			 int colCount=sh.getRow(i).getPhysicalNumberOfCells();
			 for(int j=0;j<colCount;j++){
				 XSSFCell cell=sh.getRow(i).getCell(j);
				 System.out.print(" "+cell);
				 
			 }
		 System.out.println();
		 }
		//write a file into excel
		 FileOutputStream fout=new FileOutputStream("C:\\Users\\GUDU\\Desktop\\imp documents\\write.xlsx");
		 
		 XSSFSheet sh1=wb.getSheet("Sheet1");
		 wb.write(fout);
		 fout.close(); 

	}
}
