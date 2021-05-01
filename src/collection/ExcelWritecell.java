package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritecell {
public static void main(String[] args) throws IOException {
	File frc=new File("H:\\testing tools videos\\Mukesh selenium\\DataDriven\\myxlsx.xlsx");
	FileInputStream fis=new FileInputStream(frc);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh=wb.getSheet("Sheet1");
sh.getRow(0).createCell(2).setCellValue("pass");
sh.getRow(1).createCell(2).setCellValue("pass");
sh.getRow(2).createCell(2).setCellValue("fail");
FileOutputStream fout=new FileOutputStream(frc);
wb.write(fout);
wb.close();

int rowcount=sh.getPhysicalNumberOfRows();
for(int i=0;i<rowcount;i++){
	int colcount=sh.getRow(i).getPhysicalNumberOfCells();
	for(int j=0;j<colcount;j++){
	XSSFCell cell=sh.getRow(i).getCell(j);
	System.out.print("--"+cell);
	}
System.out.println();
}
}
}
