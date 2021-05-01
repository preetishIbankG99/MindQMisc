package disabledjavasciptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookSynchronization {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//in implicit wait if the element is visible
		//then it will not wait for 10 seconds but 
		//suppose if element not found then definitely it will wait for 10 seconds after that only it will throw exception
		//it is applicable for all element in dom
	//implicitlywait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	//explicitlywait
		long t1=System.currentTimeMillis();
		WebDriverWait wait=new WebDriverWait(driver,20);
		try {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"login_form\\\"]/table/tbody/tr[3]/td[2]/div/a3")));
		}
		catch(Exception e) {
			System.out.println("Element not clickable");
		}
		long t2=System.currentTimeMillis();
		double timetaken=(t2-t1)/1000;
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		System.out.println("Done!:::::"+timetaken);
		driver.close();
		

	}

}
