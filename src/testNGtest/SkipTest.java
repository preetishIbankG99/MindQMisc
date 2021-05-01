package testNGtest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
  @Test(priority=2)
  public void Amazon() {
System.out.println("Amazon is a Commercial website");	  
	  
  }
  @Test(priority=1)
public void Sbi(){
	System.out.println("Sbi is a Banking Website");
	throw new SkipException("Due to security reason  i am skipping this test");
}
@Test(priority=3)
public void Softpedia(){
	System.out.println("Softpedia is a softwarebuild website");
}


}
