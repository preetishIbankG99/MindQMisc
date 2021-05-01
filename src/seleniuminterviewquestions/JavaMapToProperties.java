package seleniuminterviewquestions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class JavaMapToProperties {
	public static void main(String[] args) throws IOException {
		// declare a map which store string as key and string as value
		Map mapProp = new HashMap();

		mapProp.put("Name", "unknow");
		mapProp.put("Age", "27");
		mapProp.put("Gende", "Male");

		File file = new File("C:\\path\\map-to-file.properties");
		// create file input stream object for the properties file
		FileOutputStream fos = new FileOutputStream(file);
		// create Properties class object to access properties file
		Properties prop = new Properties();
		// load the properties file

		Iterator keys = mapProp.keySet().iterator();

		while (keys.hasNext()) {
			//String key = keys.next();
			//prop.setProperty(key, mapProp.get(key));
		}
		prop.store(fos, null);
	}
}
