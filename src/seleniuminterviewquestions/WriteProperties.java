package seleniuminterviewquestions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	public static void main(String[] args) throws IOException {
		// create file output stream object for the properties file
		FileOutputStream fis = new FileOutputStream("D:\\workspace\\MindQ\\src\\seleniuminterviewquestions\\Writeconfig.properties");
		// create Properties class object to access properties file
		Properties prop = new Properties();
		// load the properties file
		// set the properties
		prop.setProperty("Selenium", "https://chercher.tech");
		prop.setProperty("Google", "http://google.com");
		prop.setProperty("Yahoo", "http://yahoo.com");
		// store the file into local system
		prop.store(fis, null);
	}
}
