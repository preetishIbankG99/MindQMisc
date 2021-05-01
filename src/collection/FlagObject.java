package collection;
//Finding whether the object present or not on the webpage
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlagObject {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		WebElement ele=driver.findElement(By.name("q"));
		//If you want to send the text to the application you need to use sendKeys() method
		//If your requirement is to enter special symbol like Function keys(F1,F2…) and control,alt.. Then
		//you have to use the “Keys” enum
		ele.sendKeys("Selenium Training");
		ele.sendKeys(Keys.F1);
	boolean flag=ele.isDisplayed();
	if(flag){
		System.out.println("Object is present");
	}
	else{
		System.out.println("Object is not present");
	}
	}

}
