package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Starting TestNg");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("Stop TestNg");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Start test execution");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("Initialize selenium for class2");
	}
	
	
@Test
public void test3(){
	System.out.println("Inside testcase3");
}

@AfterClass
public void afterclass(){
	System.out.println("destroy selenium for class2");
}

@AfterTest
public void aftertest(){
	System.out.println("stop test execution");
}



}
