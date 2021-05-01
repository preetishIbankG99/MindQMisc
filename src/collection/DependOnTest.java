package collection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {
  @Test
  public void First() {
	  System.out.println("First");
  }
  
  @Test(dependsOnMethods={"First"})
  public void Second() {
	  System.out.println("Second");
	  Assert.assertEquals("gudu", "gudu1");
  }
  @Test(dependsOnMethods={"Second"},alwaysRun=true)
  public void Third() {
	  System.out.println("Third");
  }
  @Test(dependsOnMethods={"Third"})
  public void Fourth() {
	  System.out.println("Fourth");
  }
}
