package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Jxlread {
public void readexcell() throws BiffException, IOException{
	String Filepath="C:\\Users\\GUDU\\Desktop\\selenium e learn\\testread.xls";
	FileInputStream fis=new FileInputStream(Filepath);
	Workbook wb=Workbook.getWorkbook(fis);
	Sheet sh=wb.getSheet("Sheet1");
	int TotalRows=sh.getRows();
	int TotalCols=sh.getColumns();
	
	for(int row=0;row<TotalRows;row++){
		
		for(int col=0;col<TotalCols;col++){
	
	System.out.println(sh.getCell(col, row).getContents()+"\t");
	}
	System.out.println();
	}
}
public static void main(String[] args) throws JXLException, IOException {
	Jxlread jx=new Jxlread();
	jx.readexcell();
}
}