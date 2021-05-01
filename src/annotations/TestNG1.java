package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	@BeforeClass
	public void beforeclass(){
		System.out.println("Initialize selenium for class1");
	}
	@BeforeMethod
	public void openbrowser(){
		System.out.println("browser opened");
	}
	@Test
	public void test1(){
		System.out.println("Inside testcase1");
	}
	@Test
	public void test2(){
		System.out.println("Inside testcase2");
	}

	@AfterMethod
	public void aftermethod(){
		System.out.println("browser closed");
	}
	@AfterClass
	public void afterclass(){
		System.out.println("destroy selenium for class1");
	}



}
