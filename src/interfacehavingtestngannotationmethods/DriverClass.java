package interfacehavingtestngannotationmethods;

import org.testng.annotations.Test;

public class DriverClass implements InterfaceTestNGMethods {

	
	@Test
	public void DriverClassMethod()
	{
		System.out.println("Driver class method");
	}
	
	
}
