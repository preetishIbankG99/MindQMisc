package collection;

import org.testng.annotations.Test;

public class TestNGEnabled {
	
		@Test(priority=0)
	    public void methodfail() { 
	      System.out.println("Fail Method");
	    }
	   
	    @Test(dependsOnMethods="error",priority=2) 
	    public void alwaysruntrue() { 
	      System.out.println("Always run is true");
	    }
	    
	    @Test(enabled=true,priority=1)
		public void error()
	    {
	    	System.out.println("Exception Occured");
	    }
}
