package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JqueryTooTip {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/tooltip/");
	WebElement frame1=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame1);
    driver.findElement(By.xpath(".//*[@id='age']")).click();
    WebElement catchTooltip=driver.findElement(By.xpath(".//*[contains(@id,'ui-id')]/div"));
	System.out.println(catchTooltip.getText());

}
}