package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SRCAutomation {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.radiusagent.com/login");
		WebElement img = driver.findElement(By.xpath("//button[@class='GoogleSignIn__"
				+ "StyledButton-sc-2dy3kf-0 izigjt Button-sc-12smwpy-0 gyNNPF' "
				+ "and//@class='GoogleSignIn__StyledImg-sc-2dy3kf-1 kjLrzP']"));
		
        img.click();
	}

}
