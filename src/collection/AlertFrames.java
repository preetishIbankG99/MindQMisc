package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.quackit.com/javascript/javascript_alert_box.cfm");
	//driver.findElement(By.xpath("html/body/input")).click();//it will not work first switch to frame
	driver.switchTo().frame("result1");//giving frame name
	driver.findElement(By.xpath("html/body/input")).click();//putting xpath
String alertText=driver.switchTo().alert().getText();
System.out.println(alertText);
Thread.sleep(3000);
driver.switchTo().alert().accept();
//public static boolean isAlertPresent(){
//    boolean presenceOfAlert = false;
//    WebDriverWait wait = new WebDriverWait(driver, 2 /*timeout in seconds*/);
//    try {
//        wait.until(ExpectedConditions.alertIsPresent());
//        presenceOfAlert = true;
//    } catch (TimeoutException e) {
//        presenceOfAlert = false;
//    }
//    return foundAlert;
//}
}
}
