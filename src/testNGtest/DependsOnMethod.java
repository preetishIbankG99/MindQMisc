package testNGtest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependsOnMethod {
@Test
public void login(){
	System.out.println("login successful");
}
@Test(dependsOnMethods={"login"})
public void search(){
	System.out.println("Search successful");
}
@Test(dependsOnMethods={"search"} ,alwaysRun=true)
public void advancedsearch(){
	System.out.println("Advancedsearch successful");// in priority if assert=false then also its execute rest of program
	Assert.assertEquals("Gmail", "Google");//but in dependsOnMethods it will skip the rest code from where its assertion fails
}
@Test (dependsOnMethods={"advancedsearch"})
public void logout(){
	System.out.println("logout successful");
}
}
