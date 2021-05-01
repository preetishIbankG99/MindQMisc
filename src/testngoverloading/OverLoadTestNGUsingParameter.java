package testngoverloading;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OverLoadTestNGUsingParameter {
	@Parameters({"name"})
	@Test
	public void NormalMethod(String name)
	{
		System.out.println("Normal Method");
	}
	
	@Parameters({"name1","age"})
	@Test
	public void NormalMethod(String name,int age)
	{
		System.out.println("Overloaded Method");
	}
}
