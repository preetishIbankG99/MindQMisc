package collection;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.log.SysoCounter;



public class DynamicWeBTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(3000);
		driver.navigate().refresh();
	List<WebElement> table=driver.findElements(By.xpath(".//*[@class='ng-isolate-scope' ]/div"));
	Scanner sc=new Scanner(System.in);
	System.out.println("User please Enter a Valid Username::");
	String input=sc.nextLine();
	
	
	for(WebElement t:table) {
		
		
	if(t.getText().contains(input)) {
		
		System.out.println("User Exists");
   break;
		
	}
	

	}
	
	

driver.close();
	}
}
