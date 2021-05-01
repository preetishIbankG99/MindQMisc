package interview;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooGLeSearchAndSave {
public static File f;
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println(":::::Enter A Text To Search in Google::::");
		String searchtext=sc.nextLine();
		 driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(searchtext);
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("Total number of list::"+list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains(searchtext)) {
				list.get(i).click();
				break;
			
	}
		}
		try {
		
			PrintStream printcurrentdata=new PrintStream(new File("C:\\Users\\GUDU\\Desktop\\New folder\\file2.txt"));
			printcurrentdata.print(searchtext);
				sc.close();
		}
			
		
		
		catch (IOException e) {
            e.printStackTrace();
        }
	
		
		}}

