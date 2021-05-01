package testNGtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {
	 @Test  
     public void testMethod1() {       
        System.out.println("Test Method1 executed");        
     }
    
     @Test(dependsOnMethods={"testMethod1"})      
     public void testMethod2() {       
        System.out.println("Test Method2 executed");
        Assert.assertTrue(false);
     }
    
     @Test(dependsOnMethods={"testMethod2"})
     public void testMethod3() {       
        System.out.println("Test Method3 executed");         
     }
    
     @Test(dependsOnMethods={"testMethod3"},alwaysRun = true)
     public void testMethod4() {       
        System.out.println("Test Method4 always executed");         
     }
}
