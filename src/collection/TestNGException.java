package collection;

import org.testng.annotations.Test;

public class TestNGException {
@Test(expectedExceptions=ArithmeticException.class)
public void testException(){
	System.out.println("learn-Automation");
int i=5/0;
}
}
