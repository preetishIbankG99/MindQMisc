package testNGtest;

import org.testng.annotations.Test;
//With Priority i can change the Execution from Alphabetical order to my Order
public class PriorityEx {
  @Test(priority=1)
  public void a() {
  System.out.println("I am Method A");
  }
@Test(priority=2)
public void c(){
	System.out.println("I am Method C");
}
@Test(priority=3)
public void b(){
	System.out.println("I am Method B");
}
}
