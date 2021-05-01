package testngoverloading;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OverloadTestNGUsingDataProvider {
	// Data provider which provides one attribute
		@Test(dataProvider="DemoData1")
		public void NormalMethod(String s)
		{
			System.out.println("Normal Method");
		}
		
		// Data provider which provides two attribute
		@Test(dataProvider="DemoData")
		public void NormalMethod(String s,int a)
		{
			System.out.println("Overloaded Method");
		}
		
		@DataProvider(name="DemoData")
		public static Object[][] dataProviderMethod()
		{
			return new Object[][] {{"Amod",123}};
		}
		
		
		@DataProvider(name="DemoData1")
		public static Object[][] dataProviderMethod1()
		{
			return new Object[][] {{"Amod"}};
		}
}
