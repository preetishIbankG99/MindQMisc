package collection;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import collection.ExcelDataConfig;

public class ExcelCon {
public static void main(String[] args) throws IOException {
	ExcelDataConfig excel=new ExcelDataConfig("H:\\testing tools videos\\Mukesh selenium\\DataDriven\\myxlsx.xlsx");
XSSFSheet sh;
System.out.println(excel.getData(0, 0, 0));//gudu
System.out.println(excel.getData(0, 2, 2));//fail
}
}
