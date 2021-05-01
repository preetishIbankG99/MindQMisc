package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");

		JavascriptExecutor js=((JavascriptExecutor)driver);
		for(int i=0;i<2;i++){
		js.executeScript("window.scrollBy(0,80)");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath(".//*[@id='droppable']"));
		 act.moveToElement(src).dragAndDrop(src, dest).build().perform();
}
}