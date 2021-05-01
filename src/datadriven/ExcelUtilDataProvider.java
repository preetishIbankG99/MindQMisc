package datadriven;



public class ExcelUtilDataProvider {
	
	public static void main(String[] args) {
		String excelPath="H:\\testing tools videos\\Mukesh selenium\\DataDriven\\data.xlsx";
		testData(excelPath,"Sheet1");
	}
	
public static void testData(String excelPath,String sheetName) {
	ExcelUtils excel=new ExcelUtils(excelPath,sheetName);
	int rowCount=excel.getRowCount();
	int colCount=excel.getColCount();
	
	for(int i=0;i<rowCount;i++) {
		for(int j=0;j<colCount;j++) {
			String cellData=excel.getCellDataString(i, j);
			System.out.print(cellData+" | ");
		}
		System.out.println();
	}
}
}
