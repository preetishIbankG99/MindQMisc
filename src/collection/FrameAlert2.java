package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameAlert2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.landofcode.com/javascript-tutorials/javascript-pop-up-boxes.php");
        driver.findElement(By.cssSelector("input[type='button']")).click();
        String framealert=driver.switchTo().alert().getText();
        System.out.println(framealert);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
	}

}
