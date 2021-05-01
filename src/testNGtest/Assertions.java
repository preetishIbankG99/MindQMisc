package testNGtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
  @Test(priority=2)
  public void FacebookLogin() {
	  System.out.println("Welcome to Facebook");
  }
@Test(priority=1,enabled=false)
public void GmailLogin(){
	System.out.println("Welcome to Gmail");
}
@Test(priority=3)//alwaysRun=true will not work in priority it will only work in dependsupon  
public void TwitterLogin(){
	System.out.println("Welcome to Twitter");
	//Assert.assertEquals("preetish", "shiba");//testcase fails if actual and expected not match
	Assert.assertEquals("gudu", "gudu");//now matches its pass
}
}
