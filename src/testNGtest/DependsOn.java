package testNGtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
  @Test
  public void gmaillogin() {
	  System.out.println("gmail login with credentials ");
  }

@Test(dependsOnMethods={"gmaillogin"})
public void checkinbox(){
	System.out.println("inbox should be checked");
	Assert.assertEquals("google", "google1");
	}

@Test(dependsOnMethods={"checkinbox"})
public void composemail(){
	System.out.println("mail should composed");
	
}
@Test(dependsOnMethods={"composemail"},alwaysRun=true)
public void Jenkins(){
	System.out.println("jenkins is created");
}




}
