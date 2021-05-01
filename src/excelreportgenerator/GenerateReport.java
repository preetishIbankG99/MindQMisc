package excelreportgenerator;

import org.automationtesting.excelreport.Xl;
import org.testng.annotations.AfterMethod;

public class GenerateReport  {
	 public static void main(String[] args) throws Exception
	    {
	     Xl.generateReport("excel-report.xlsx");
	     System.out.println("Excel Report Generated");
	    }

}
