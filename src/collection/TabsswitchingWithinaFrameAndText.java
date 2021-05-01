package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabsswitchingWithinaFrameAndText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/tabs/");
		WebElement frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		WebElement tab1=driver.findElement(By.xpath(".//*[@id='ui-id-1']"));
		tab1.click();
		Thread.sleep(7000);
		WebElement text=driver.findElement(By.xpath(".//*[@id='tabs-1']/p"));
		System.out.print(text.getText());

		WebElement tab2=driver.findElement(By.xpath(".//*[@id='ui-id-2']"));
		tab2.click();
		Thread.sleep(5000);
		WebElement text2=driver.findElement(By.xpath(".//*[@id='tabs-2']/p"));
		System.out.println();
		System.out.print(text2.getText());
}}
