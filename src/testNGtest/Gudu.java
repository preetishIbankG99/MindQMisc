package testNGtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gudu {
	@BeforeClass
	  public void login() {
	System.out.println("Successfull logged in");
	  }
	  @AfterClass
	  public void logout() {
	System.out.println("Successfull logged out");
	  }
	@Test
	public void addVendor(){
		System.out.println("Vendor added succesfully");
	}

	@Test
	public void addCurrency(){
		System.out.println("Currency added succesfully");
	}

	@Test
	public void addProduct(){
		System.out.println("Product added succesfully");
		
	}

	@Test
	public void addCart(){
		System.out.println("Cart added succesfully");
	}
}
