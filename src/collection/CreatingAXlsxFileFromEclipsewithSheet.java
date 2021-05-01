package collection;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingAXlsxFileFromEclipsewithSheet {
public static void main(String[] args) {
	
	try{
		XSSFWorkbook wb=new XSSFWorkbook();
		FileOutputStream fout=new FileOutputStream(new File("D:\\workspace\\MindQ\\src\\collection\\createfile.xlsx"));
		
		XSSFSheet sh=wb.createSheet("gudubhanja");
		wb.write(fout);
		fout.close();
		
		
	}
	catch(Exception e){
e.printStackTrace();		
	}
	System.out.println("Excel file created");
}
}
