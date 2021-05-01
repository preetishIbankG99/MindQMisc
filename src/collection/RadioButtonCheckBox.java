package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonCheckBox {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
WebElement checkbox=driver.findElement(By.name("permission"));
checkbox.click();
if(checkbox.isSelected()){
	System.out.println("checkbox is selected");
}
else{
	checkbox.click();
}	
	
	}
}