package keywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadObject {
	private static final Properties p = null;

	public void testconfig() throws Exception{
		File src=new File("./Configuration/Object.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties p=new Properties();
		p.load(fis);
		System.out.println("Propertyclass loaded");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url")); 
		   driver.findElement(By.name(p.getProperty("username"))).sendKeys("preetish");
		   driver.findElement(By.name(p.getProperty("password"))).sendKeys("gudu123");
			driver.findElement(By.xpath(p.getProperty("html/body/form/table/tbody/tr[3]/td[2]/input[1]"))).click();

	}

	public Properties getObjectRepository() {
		
		return p;
	}

}
