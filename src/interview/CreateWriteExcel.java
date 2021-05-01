package interview;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class CreateWriteExcel {

	public static void main(String[] args) {
		//create a blank workbook
		HSSFWorkbook wb=new HSSFWorkbook();
		//create blank sheet
		HSSFSheet sh=wb.createSheet("Test Data");
		
		//This data need to be written in(object[])
		Map<String,Object[]>data=new TreeMap<String,Object[]>();
		data.put("1", new Object[] {"ID","NAME","LASTNAME"});
		data.put("2", new Object[] {1,"GUDU","BHANJA"});
		data.put("3", new Object[] {2,"BENU","PARIDA"});
		data.put("4", new Object[] {3,"LIKU","DAS"});
		data.put("5", new Object[] {4,"RUBU","SINGH"});
		data.put("6", new Object[] {5,"SILU","NAYAK"});
		//iterating over data and write to sheet
		Set<String>keyset=data.keySet();
		int rownum=0;
		for(String key:keyset){
			Row row=sh.createRow(rownum++);
			Object[]objArr=data.get(key);
			int cellnum=0;
			for(Object obj:objArr){
				Cell cell=row.createCell(cellnum++);
				if(obj instanceof String)
					
				cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		
		try{
			File f=new File("demo.xls");  
			FileOutputStream fout=new FileOutputStream(f);
		wb.write(fout);
		fout.flush();
		fout.close();
		wb.close();
		System.out.println("demo.xls succesfully created");
		}
		catch(Exception e){
			e.printStackTrace();
			
		
		}
	}

}
