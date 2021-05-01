package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class GetCurrenturl {
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	String url=	driver.getCurrentUrl();
	System.out.println(url);
	driver.findElement(By.id("Email")).sendKeys("preetish.bhanja@gmail.com");
	driver.findElement(By.id("next")).click();
	Thread.sleep(3000);
    driver.findElement(By.id("Passwd")).sendKeys("12345");	
	
    if(url.equals("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier")){
	System.out.println("Logged in");
     }
    else{
	System.out.println("Logged in Unsuccesful");
}
}
}
