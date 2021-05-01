package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("@@@@");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("@@@@@");
		//driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//Thread.sleep(10000);
		
		driver.findElement(By.id("u_0_1")).sendKeys("preetish");
		driver.findElement(By.id("u_0_3")).sendKeys("bhanja");
		driver.findElement(By.id("u_0_6")).sendKeys("993879076");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("993879076");
		driver.findElement(By.id("u_0_d")).sendKeys("gudubhanja");
		driver.findElement(By.className("_58mt")).click();
		
		
		
		
}

}