package csvdatadriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import au.com.bytecode.opencsv.CSVReader;

public class DataDrivenCSV {

public static WebDriver driver;
public static void main(String[]args) throws IOException{
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://hploadrunnertutorial.blogspot.in");
CSVReader reader=new CSVReader(new FileReader("D:\\workspace\\MindQ\\demo2.csv"));	
String cell[];
while((cell=reader.readNext())!=null){
	for(int i=0;i<1;i++){
		String name=cell[i];
		String email=cell[i+1];
	    String mssg=cell[i+2];
	    driver.findElement(By.name("email")).sendKeys(email);
	}
}


	
}
}