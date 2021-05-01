package collection;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CellColorExcel {
public static void main (String[]args){
	Workbook wb=new HSSFWorkbook();
	Sheet sh=wb.createSheet("Eggs");
	Cell cl=sh.createRow(0).createCell(1);
	CellStyle cs=wb.createCellStyle();
	cs.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	cs.setFillPattern(CellStyle.SOLID_FOREGROUND);
	cl.setCellStyle(cs);
try{
FileOutputStream fout=new FileOutputStream("C:\\Users\\GUDU\\Desktop\\New folder\\sample.xls");
wb.write(fout);
fout.close();
}
catch(Exception e){
	e.printStackTrace();
}
}
}
