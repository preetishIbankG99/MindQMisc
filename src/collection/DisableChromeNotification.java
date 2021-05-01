package collection;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DisableChromeNotification {
public static void main(String[] args) {
	
	Map<String,Object>prefs=new HashMap<String,Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	//creating object of chrome class
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	//pass option object in chrome driver
System.setProperty("webdriver.chrome.driver","H:\\lattttaaast\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options);
//WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement username=driver.findElement(By.id("email"));

username.sendKeys("preetishbhanja@gmail.com");
WebElement password=driver.findElement(By.id("pass"));

password.sendKeys("$$$$$$$$");

WebElement login=driver.findElement(By.cssSelector("input[type='submit']"));
login.click();

WebElement logoutarrow=driver.findElement(By.xpath(".//*[@id='userNavigationLabel']"));
logoutarrow.click();
//Bootstrap Handle
WebElement lo=driver.findElement(By.xpath(".//*[@id='js_cw']/div/div/ul/li[12]/a/span/span"));

Actions act=new Actions(driver);
act.moveToElement(lo);

}
}
