package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModalForm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/dialog/#modal-form");
				WebElement frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath(".//*[@id='create-user']")).click();
		Thread.sleep(5000);
		WebElement userid=driver.findElement(By.xpath(".//*[@id='name']"));
		userid.clear();
		Thread.sleep(5000);
		WebElement newuserid=driver.findElement(By.xpath(".//*[@id='name']"));
		newuserid.sendKeys("preetish");
		Thread.sleep(5000);
		WebElement emailid=driver.findElement(By.xpath(".//*[@id='email']"));
		emailid.clear();
		Thread.sleep(5000);
		WebElement newemailid=driver.findElement(By.xpath(".//*[@id='email']"));
		newemailid.sendKeys("preetish.bhanja@gmail.com");
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath(".//*[@id='password']"));
		password.clear();
		Thread.sleep(5000);
		WebElement newpassword=driver.findElement(By.xpath(".//*[@id='password']"));
		newpassword.sendKeys("gudubabu");

		WebElement submitbutton=driver.findElement(By.xpath("html/body/div[2]/div[3]/div/button[1]"));
		submitbutton.click();
}
}