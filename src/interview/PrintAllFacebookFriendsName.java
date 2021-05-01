package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllFacebookFriendsName {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("saisha2013@");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@title='Preetish Kumar Bhanjadeo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Friends'])[1]")).click();
		Thread.sleep(4000);
		
		while(true) {
		List<WebElement>friendlistbeforescrolling=driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));
		System.out.println("::Before scroll Total Friends::"+friendlistbeforescrolling.size());
		//scroll to the last friend y coordinate
		WebElement lastfriend=friendlistbeforescrolling.get(friendlistbeforescrolling.size()-1);
		int y=lastfriend.getLocation().y;
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(4000);
		List<WebElement>friendlistafterscrolling=driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));
		System.out.println("::After scroll total friends ::"+friendlistafterscrolling.size());
		if(friendlistbeforescrolling.size()==friendlistafterscrolling.size()) {
			for(WebElement all:friendlistafterscrolling) {
				System.out.println(" "+all.getText());
			}
			break;
			}
		}
	}

}
