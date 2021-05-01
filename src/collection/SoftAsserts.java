package collection;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
	@Test
	public void testsoft(){
		SoftAssert assertion =new SoftAssert();
		System.out.println("test1 started");
		assertion.assertEquals(12, 13);
		System.out.println("test1 completes");
		assertion.assertAll();
		}
	@Test
	public void testHardAssert()
	{

	System.out.println("test2 started");
	Assert.assertEquals(12, 13);
	System.out.println("test2 completes");

	}
	}

