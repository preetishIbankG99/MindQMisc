package configurationDemo;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.testng.annotations.Test;

public class TestFacebook {

	@Test
	public void testconfig() throws Exception{
		File src=new File("./Configuration/config.property");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
		String chromepath=pro.getProperty("ChromeDriver");
		System.out.println("Chrome browser Tested its path is"+chromepath);
		
	}

}
