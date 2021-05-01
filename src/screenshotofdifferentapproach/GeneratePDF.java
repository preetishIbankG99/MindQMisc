package screenshotofdifferentapproach;

import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {
	public static void main(String[] args) throws Exception {

		//System.setProperty("webdriver.chrome.driver", "D:\\Eclipse progs\\driverserver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/java/index-selenium-webdriver");

		// take the screenshot and store it in byte[] array format
		byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Document document = new Document();
	    String output = "C:\\Users\\GUDU\\New folder\\" + "nameOfFile" + ".pdf";
	    FileOutputStream fos = new FileOutputStream(output);

	    // Instantiate the PDF writer
	    PdfWriter writer = PdfWriter.getInstance(document, fos);

	    // open the pdf for writing
	    writer.open();
	    document.open();

	    // process content into image
	    Image im = Image.getInstance(input);

	    //set the size of the image
	    im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);

	    // add the image to PDF
	    document.add(im);
	    document.add(new Paragraph(" "));

	    //close the files and write to local system
	    document.close();
	    writer.close();
    }
}
