package seleniuminterviewquestions;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesToJavaMap {
	public static void main(String[] args) throws Exception {
		// declare a map which store string as key and string as value
		Map mapProp = new HashMap();
		// create file input stream object, to make file as readable by machine
		FileInputStream fis = new FileInputStream("D:\\workspace\\MindQ\\src\\seleniuminterviewquestions\\readallproperties.properties");
		// create properties class object to access all non-static methods
		Properties prop = new Properties();
		// load the required .properties file
		prop.load(fis);
		// close the file as Properties class object have all the details
		fis.close();
		// Properties work like HashTable, so we have to handle like hash table only
		Enumeration enumKeys = prop.keys();
		// iterate till the enumKeys has keys
		while (enumKeys.hasMoreElements()) {
			// move from null to first element(key), by default it will not point to first element
			String key = (String) enumKeys.nextElement();
			// fetch the property for the key
			String value = prop.getProperty(key);
			// store the key and value in map
			mapProp.put(key, value);
		}
		System.out.println("Value stored to Map are : "+mapProp);
	}
}
