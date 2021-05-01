package testNGtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
  @Test
  public void LaunchApp() {
	  System.out.println("App launched successful");
  }
  @Test(dependsOnMethods={"LaunchApp"})
  public void Login() {
	  System.out.println("Log in successful");
  }

  @Test(dependsOnMethods={"Login"})
  public void CheckInbox() {
	  System.out.println("Inbox checked successful");
	  Assert.assertEquals("Login", "Login");
  }
  @Test(dependsOnMethods={"CheckInbox"})
public void SentMail(){
	  System.out.println("Mail Sent Succesfull");
  }
@Test(dependsOnMethods={"SentMail"})
public void Logout(){
	System.out.println("Log out successfull");
}
}
