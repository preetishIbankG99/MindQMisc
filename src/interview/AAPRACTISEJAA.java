package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AAPRACTISEJAA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.nvsp.in/Forms/Forms/form6");
		Thread.sleep(3000);
		
WebElement language=driver.findElement(By.xpath("//select[@id='language']"));
	Select sel1=new Select(language);
	
	sel1.selectByValue("en-GB");
	Thread.sleep(4000);
	driver.findElement(By.name("CURR_HOUSE_NO")).sendKeys("bcdhjfkdh");
	driver.findElement(By.name("CURR_STREET_AREA")).sendKeys("jgdffndk");
	driver.findElement(By.name("CURR_VILLAGE")).sendKeys("bjbgmk");
		driver.findElement(By.name("CURR_POST_OFFICE")).sendKeys("hjkhkl");
		driver.findElement(By.name("CURR_PIN_CODE")).sendKeys("212332");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='CURR_STATE_CODE']"));
		//Thread.sleep(3000);
		Select sel=new Select(dropdown);
		sel.selectByValue("S01");
		Thread.sleep(5000);
		
		
		WebElement dropd2=driver.findElement(By.id("ddCurrrentDist"));
		Select sel3=new Select(dropd2);
		sel3.selectByVisibleText("Anantapur");
		
		WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	    checkbox.click();
	}

}
