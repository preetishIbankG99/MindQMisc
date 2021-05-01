package testngexpectedexception;

import org.testng.annotations.Test;

public class TestNGException {
//Test Case passes if we put expected as precondition
	
@Test(expectedExceptions=NumberFormatException.class)

//@Test
//Test case will failed if we not declare expected
	public static void numberformatExceptionpassed() {
		String x="100A";
		Integer.parseInt(x);
	}
}
