package testNGtest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void abcd(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in/");
		
		Assert.assertEquals(driver.getTitle(),"Google" );//by default test executes in Alphabetical Order
	}
	@Test(priority=2)
	public void pqrs(){
		
		Assert.assertEquals("Yahoo","Yahoo" );//but if you want to test execute by your way give priority 
	}
	@Test(priority=3,enabled=false)//wont execute
	public void wxyz(){
		
		//Assert.assertEquals("Google","Google" );
		Assert.assertEquals("Google","Gmail" );//but if it is wrong with high priority then bydefault choose 2nd one
}
}