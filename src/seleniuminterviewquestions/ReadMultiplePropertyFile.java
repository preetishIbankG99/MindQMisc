package seleniuminterviewquestions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadMultiplePropertyFile {
	public static void main(String[] args) throws IOException {
		// create file input stream object for the properties file
		FileInputStream fis = new FileInputStream("C:\\path\\login.properties");
		FileInputStream fis2 = new FileInputStream("C:\\path\\config.txt");
		// create Properties class object to access properties file
		Properties prop = new Properties();
		// load the properties file
		prop.load(fis);
		//load all the files
		prop.load(fis2);
		// get the property of "url" using getProperty()
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.get("suite"));
	}
}
