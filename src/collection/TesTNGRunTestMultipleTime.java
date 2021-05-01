package collection;

import org.testng.annotations.Test;

public class TesTNGRunTestMultipleTime {
	@Test(invocationCount=10)
	public void display()
	{
		System.out.println("Manoj");
	}
	
	@Test
	public void display1()
	{
		System.out.println("Manoj1");
	
}
}
