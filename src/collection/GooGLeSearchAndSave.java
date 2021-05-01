package collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooGLeSearchAndSave {
public static FileWriter fw;
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
			
			for(int i=0;i<10;i++) {
				f = new File("file" + i + ".txt");
				 fw = new FileWriter("C:\\Users\\GUDU\\Desktop\\New folder\\file.txt", true);
				f.createNewFile();
			
            
            
        } 
				
		}
			
		
		
		catch (IOException e) {
            e.printStackTrace();
        }
	
		fw.write(searchtext);	
		
        fw.close();
		
		}}

