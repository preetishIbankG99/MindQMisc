package testNGtest;

import org.testng.annotations.Test;

public class TestNGCheckPriority {
  @Test(priority=1)
  public void login() {
	  System.out.println("App logged in successfully");
  }

  @Test(priority=2)
  public void checkinbox() {
	  System.out.println("checked successfully");
  }

  @Test(priority=3)
  public void sendmails() {
	  System.out.println("sending mails successfully");
  }
  @Test
  public void composemail() {
	  System.out.println("composed successfully");
  }


  @Test
  public void logout() {
	  System.out.println("App loggedout successfully");
  }

}
//if we are not giving a testcase method priority it will execute first