package string;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellValue;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utitlity {
	public static void main(String[] args) {
		
	
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.flipkart.com/");
driver.findElement(By.linkText("Signup")).click();

}

}



