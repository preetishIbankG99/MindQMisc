package testNGtest;

import org.testng.annotations.Test;

public class BeforeAfter2 {
  
	
	
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
