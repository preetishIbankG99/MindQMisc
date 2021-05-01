package inheritancetestng;

import org.testng.annotations.Test;

public class SubTestNGClass extends SuperTestNGClass {
	@Test
	public void subTestNgMethod()
	{
		System.out.println("Sub testng method");
	}
}
