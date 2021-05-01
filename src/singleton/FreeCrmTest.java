package singleton;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FreeCrmTest {
	@BeforeMethod
public void setUp() {
	PageTest.initialize();
	
}

@Test(priority=1)
public void titleValidation() {
	String title=PageTest.driver.getTitle();
	System.out.println("Page Title is "+title);
	Assert.assertEquals(title, Constant.title);
}
@AfterMethod
public void tearDown() {
	PageTest.close();
}
}
