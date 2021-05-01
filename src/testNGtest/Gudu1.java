package testNGtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gudu1 {
	@BeforeClass
	  public void login() {
	System.out.println("Successfull logged in");
	  }
	  @AfterClass
	  public void logout() {
	System.out.println("Successfull logged out");
	  }
	@Test
	public void deleteVendor(){
		System.out.println("Vendor deleted succesfully");
	}

	@Test
	public void deleteCurrency(){
		System.out.println("Currency deleted succesfully");
	}

	@Test
	public void deleteProduct(){
		System.out.println("Product deleted succesfully");
		
	}

	@Test
	public void deleteCart(){
		System.out.println("Cart deleted succesfully");
	}

}
