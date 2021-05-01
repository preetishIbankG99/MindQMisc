package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSHeadlessGhost {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("phantomjs.binary.path", "C:\\Users\\GUDU\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver=new PhantomJSDriver();
        driver.get("https://www.freecrm.com/");
	    String title=driver.getTitle();
	    System.out.println("The Value of title before login:::: "+title);
	    driver.manage().deleteAllCookies();
	    //After login
	    driver.findElement(By.name("username")).sendKeys("naveenk");
	    driver.findElement(By.name("password")).sendKeys("test@123");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(4000);
	    
	    System.out.println("After Login Title is::: "+driver.getTitle());
	
}

}
