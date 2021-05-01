package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class PDFReports {

	
	public static void iTextPdf() throws Exception{
		String file="H:\\photonwp\\MindQ\\test-outputs\\pdfrep.pdf";
		Document doc=new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(file));
		doc.open();
		doc.add(new Paragraph("Testcase Fail:1")); 
		doc.add(new Paragraph("Error Id not Found"));	
		doc.close();
		
	}
	

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.navigate().to("http://www.facebook.com");
        
        try {
        	driver.findElement(By.id("emaili"));
        	
        }
	catch(Exception e) {
		iTextPdf();
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}

}
