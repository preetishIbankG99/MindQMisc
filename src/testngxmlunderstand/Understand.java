package testngxmlunderstand;

import org.testng.annotations.Test;
//we can also write @Test at top  of the class which will define all methods with @Test
//@Test
public class Understand {
  @Test(expectedExceptions={ArithmeticException.class})
  public void iUnderstand() {
  System.out.println("I am understanding1");
  int x=1/0;
  System.out.println("The Exception "+x);
  }

  @Test
  public void imisUnderstand() {
  System.out.println("I misunderstand");
  }
  @Test
  public void iapologize() {
  System.out.println("I deeply apologize");
  }
  
}
