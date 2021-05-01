package seleniuminterviewquestions;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class ReadAllProperties {
	public static void main(String[] args) throws Exception{
		// create file input stream object, to make file as readable by machine
		FileInputStream fis = new FileInputStream("D:\\workspace\\MindQ\\src\\seleniuminterviewquestions\\readallproperties.properties");
		// create properties class object to access all non-static methods
		Properties properties = new Properties();
		// load the required .properties file
		properties.load(fis);
		// close the file as Properties class object have all the details
		fis.close();
		// Properties work like HashTable, so we have to handle like hash table only
		Enumeration enumKeys = properties.keys();
		// iterate till the enumKeys has keys
		while (enumKeys.hasMoreElements()) {
			// move from null to first element(key), by default it will not point to first element
			String key = (String) enumKeys.nextElement();
			// fetch the property for the key
			String value = properties.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}
}
