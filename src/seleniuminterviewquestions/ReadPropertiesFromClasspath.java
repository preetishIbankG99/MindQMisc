package seleniuminterviewquestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFromClasspath {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream("D:\\workspace\\MindQ\\src\\seleniuminterviewquestions\\guduprop.properties");
	// create Properties class object to access properties file
	
	//FileInputStream fis = new FileInputStream(this.getClass().getResourceAsStream("/test.properties"));
	
	Properties prop = new Properties();
	
	// load the properties file
	prop.load(fis);
	// get the property of "url" using getProperty()
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("author"));
	// get the property of "url" using get()
	System.out.println(prop.get("user"));
}
}
