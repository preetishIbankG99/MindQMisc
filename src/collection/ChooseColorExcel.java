package collection;


import java.io.File;

import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ChooseColorExcel {
	static Workbook wbook;
	static WritableWorkbook wwbCopy;
	static String ExecutedTestCasesSheet;
	static WritableSheet shSheet;
	
	public void readExcel()
	{
	try{
	wbook = Workbook.getWorkbook(new File("C:/Users/GUDU/Desktop/New folder/sample.xls"));
	wwbCopy = Workbook.createWorkbook(new File("C:/Users/GUDU/Desktop/New folder/samplecopy.xls"), wbook);
	shSheet = wwbCopy.getSheet(0);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}	

	public void setValueIntoCell(String strSheetName,int iColumnNumber, int iRowNumber,String strData) throws WriteException
	{
		WritableSheet wshTemp = wwbCopy.getSheet(strSheetName);
		WritableFont cellFont = null;
		WritableCellFormat cellFormat = null;
		
		if(strData.equalsIgnoreCase("PASS"))
		{
			cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.GREEN);
			cellFont.setBoldStyle(WritableFont.BOLD);
			
			cellFormat = new WritableCellFormat(cellFont);
			cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);			
		}
		
		else if(strData.equalsIgnoreCase("FAIL"))
		{
			cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.RED);
			cellFont.setBoldStyle(WritableFont.BOLD);
				
			cellFormat = new WritableCellFormat(cellFont);
			cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
		}
		
		else
		{
			cellFont = new WritableFont(WritableFont.TIMES, 12);
			cellFont.setColour(Colour.BLACK);
				
			cellFormat = new WritableCellFormat(cellFont);
			cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
			cellFormat.setWrap(true);		
		}
		
		Label labTemp = new Label(iColumnNumber, iRowNumber, strData, cellFormat);	
		try {
			wshTemp.addCell(labTemp);
			
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
	}
	
	public void closeFile()
	{
		try {
			// Closing the writable work book
			wwbCopy.write();
			wwbCopy.close();

			// Closing the original work book
			wbook.close();
		} catch (Exception e)
		{
			e.printStackTrace();

		}
	 }

	public void main(String[] args) throws WriteException
	{
		ChooseColorExcel chs = new ChooseColorExcel();
		chs.readExcel();
		chs.setValueIntoCell("Sheet1", 5, 1, "PASS");
		chs.setValueIntoCell("Sheet1", 5, 2, "FAIL");
        chs.setValueIntoCell("Sheet1", 5, 3, "N/A");

	}
}
