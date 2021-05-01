package excelib;

import java.io.IOException;



public class Excelcon {
public static void main(String[] args) throws IOException {
	ExcelDataConfig excel=new ExcelDataConfig("D:\\workspace\\MindQ\\Excel\\testube.xlsx");
	System.out.println(excel.getData(0, 1,1));
	System.out.println(excel.getData(0, 2, 1));
	System.out.println(excel.getData(0, 3, 1));


}
}
