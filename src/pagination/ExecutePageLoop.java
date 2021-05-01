package pagination;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecutePageLoop {

	
	public static void main(String[] args) throws IOException, InterruptedException { 
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.w3schools.com/howto/howto_css_pagination.asp"); 
		driver.manage().window().maximize();
		List pagination =driver.findElements(By.xpath("//*[@id=\"main\"]/ul/li/a")); 
		int size= pagination.size(); 
		System.out.println(pagination.size()); 
		
		if(size>0)
		{ 
		System.out.println("pagination exists");
		// click on pagination link
		
		for(int i=2; i<size; i++){ 
       // JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[\"+i+\"]/a"));
//		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element); 
//		element.click() ;
		element.click();
		Thread.sleep(5000); 
		System.out.println("Page "+i);
		
		
		}
		 
		//driver.quit();
		} 
		else 
		{ 
		System.out.println("pagination not exists"); 
		}
		} 


}
//List<WebElement> pagination = driver.findElements(By.xpath("//div[@class='pagination-container']//a"));
//int s = pagination.size();
//for(int i=0;i<=s;i++){
//    this.getAuthors();
//        driver.get(Constants.url);
//        Thread.sleep(5000);
//
//    pagination = driver.findElements(By.xpath("//div[@class='pagination-container']//a"));
//    pagination.get(i).click();
//    Thread.sleep(5000);


//new WebDriverWait(
//        driver, TIME_TO_WAIT).until(
//                ExpectedConditions.presenceOfElementLocated(
//                        By.tagName("a")));
//List<WebElement> elements = driver.findElements(By.tagName("a"));
//for (int i = 0; i < elements.size(); i++) {
//String title = elements.get(i).getAttribute("title");
//if (title.equals("Next Page")) {
//    elements.get(i).click();
//    break;
//}
