//package screenshotofdifferentapproach;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//
//import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
//import com.gargoylesoftware.htmlunit.javascript.host.html.Image;
//import com.itextpdf.text.PageSize;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
//public class ScreenshotPDF {
//	static Document document = new Document();
//	public static PdfWriter writer ;
//
//	static {
//		FileOutputStream fos;
//		try {
//			fos = new FileOutputStream("C:\\PATH\\Zip\\" + "series of screenshots" + ".pdf");
//			writer = PdfWriter.getInstance(document, fos);
//
//			// open the pdf for writing
//			writer.open();
//			document.open();
//		} catch (Exception e) {
//			System.out.println("Exception occured");
//			e.printStackTrace();
//		}
//	}
//
//	public static void writeScreenShotToDocument(ArrayList byteArray) throws Exception {
//		System.out.println("writeScreenShotToDocument started########## : "+byteArray.size());
//		Image im = null;
//		for (byte[] bytes : byteArray) {
//
//			// process content into image
//			im = Image.getInstance(bytes);
//			//set the size of the image
//			im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);
//
//			document.add(new Paragraph(" "));
//			document.add(new Paragraph("Chercher Tech website"));
//
//			// add the image to PDF
//			document.add(im);
//			System.out.println("added");
//		}
//	}
//
//	public static void writeScreenShotDocumentToPDF() throws Exception {
//		System.out.println("writeScreenShotDocumentToPDF started@@@@@@@@@ ");
//
//		//close the files and write to local system
//		document.close();
//		writer.close();
//	}
//}
