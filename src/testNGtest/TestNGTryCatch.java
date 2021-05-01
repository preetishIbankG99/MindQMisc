package testNGtest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGTryCatch {
  @Test(priority=1)
  public void gmaillogin() {
	  System.out.println("Welcome to gmail gudu");
	  
  }

  @Test(priority=3)
  public void yahoologin() {
	  System.out.println("Welcome to yahoo gudu");
	  try{
	Assert.assertEquals("gudu","guluri");  
	  }
	  catch(Throwable t){
		  System.out.println(t);
	  }
	  
	  }

  @Test(priority=2)
  public void skypelogin() {
	  System.out.println("Welcome to skypelogin");
	  
  }



}
