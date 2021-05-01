package datadriven;

import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelCon {
public static void main(String[] args) throws IOException {
	ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\GUDU\\Desktop\\myinputdata.xlsx");
XSSFSheet sh;
System.out.print(excel.getData(0, 0,0));
System.out.print("--------------------------");
System.out.println(excel.getData(0, 0, 1));
System.out.println("#######################################");


System.out.print(excel.getData(0, 1,0));
System.out.print("-----------------------");
System.out.println(excel.getData(0, 1,1));

System.out.print(excel.getData(0, 2, 0));

System.out.print("------------------------");
System.out.println(excel.getData(0, 2,1));

}

}
