package testNgclasses;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcase3 {
@Test
public void testGmail(){
	//Assert.assertTrue(false);//to fail a testcase
	Assert.assertTrue(true);
	System.out.println("Gmail is working as expected");
}
}
