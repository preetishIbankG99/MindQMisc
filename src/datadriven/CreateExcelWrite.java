package datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelWrite {
	public static void main(String[] args) {
		//creating a workbok
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("TestData");
		//This data needs to be written(object[])
		Map<String,Object[]>data=new TreeMap<String,Object[]>();
		data.put("1", new Object[]{"ID","NAME","LASTNAME"});
		data.put("2", new Object[]{1,"GUDU","BHANJA"});	
		data.put("3", new Object[]{2,"SHIBA","DASH"});	
		data.put("4", new Object[]{3,"SAROJ","PARIDA"});
		data.put("5", new Object[]{4,"NIKHIL","SINGH"});	
			Set<String>keyset=data.keySet();
			int rownum=0;
			for(String key:keyset)
			{
			Row row=sh.createRow(rownum++);
			Object[]objArr=data.get(key);
			int cellnum=0;
			for(Object obj:objArr)
			{
				Cell cell=row.createCell(cellnum++);
			if(obj instanceof String)
			{
				cell.setCellValue((String)obj);
				
			}
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
				
			}	
			}
			try{
				File frc=new File("gudunew.xlsx");
				FileOutputStream fout= new FileOutputStream(frc);
				wb.write(fout);
				fout.close();
				System.out.println("gudunew.xlsx written sucessfully on disk");
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			}
}
