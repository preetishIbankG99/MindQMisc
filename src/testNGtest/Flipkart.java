package testNGtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	@BeforeMethod
	  public  void Flipkartlogin(){
		  System.out.println("logged in");
	  }
	  @AfterMethod
	  public  void Flipkartlogout(){
		  System.out.println("logged out");
		  
	  }
	  @Test(priority=1)
	  public void addProduct(){
		  System.out.println("Product Added");
		  }
	  
	@Test(priority=2)
	public void addCart(){
		System.out.println(" Added to cart");
	}
	@Test(priority=3)
	public void buynow(){
		System.out.println("Purchase item");
	}
	@Test(priority=4)
	public void orderdetails(){
		System.out.println("Order to be placed");
	}
}
