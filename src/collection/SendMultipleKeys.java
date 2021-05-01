package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendMultipleKeys {
	public static void main(String[] args) {
		// set chrome driver exe path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		// enter text with capital letters by pressing Shift
		 driver.findElement(By.xpath("//input[@id='textbar']")).sendKeys(Keys.chord(Keys.SHIFT, "UserName"));
	}
}
/*//You can run the JUnit tests using TestNG by 1. Placing JUnit library on the TestNG classpath, so it can locate and use JUnit classes
//
//2. Change your test runner from JUnit to TestNG in Ant and then run TestNG in “mixed mode᾿ . This will bring all your test in the same
//
//3. This approach also enables you to convert your existing JUnit test to TestNG
*/

//@Test (threadPoolSize=?): The threadPoolSize attributes tell TestNG to form a thread pool to run the test method through multiple threads. With threadpool, the running time of the test method reduces greatly.
//
//@Test(invocationCount=?): The invocationcount tells how many times TestNG should run this test method
