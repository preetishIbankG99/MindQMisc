package collection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGEnable {
	@Test
	public void show()
	{
		System.out.println("Show Executed");
		Assert.assertFalse(2>1);
	}
	
	@Test(enabled=true)
	public void show1()
	{
		System.out.println("Show1 Executed");
		Assert.assertEquals("manoj", "hjg");
		
	}
	@Test(dependsOnMethods="show1",alwaysRun=true) // There Is No Such Option For False
	public void show2()
	{
		System.out.println("Show2 Executed");
	}
}
