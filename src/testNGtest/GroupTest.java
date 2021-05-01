package testNGtest;

import org.testng.annotations.Test;

public class GroupTest {
	
  @Test(groups={"sanity","regression"},priority=1)
public void login(){
	  System.out.println("login successful");
  }

  @Test(groups={"sanity"},priority =2)
  public void fundtranser(){
  	  System.out.println("fundtranser successful");
    }

  @Test(groups={"regression"})
  public void search(){
  	  System.out.println("search successful");
    }
  @Test(groups={"sanity"},priority =3)
  public void advancesearch(){
  	  System.out.println("advancesearch successful");
    }

  @Test(groups={"sanity","regression"},priority =4)
  public void billgenerate(){
  	  System.out.println("billgenerate successful");
  	   }

  @Test(groups={"regression"},priority=9)
  public void printbill(){
  	  System.out.println("printbill successful");
  	   }
  @Test(groups={"regression"},priority=10)
  public void logout(){
  	  System.out.println("logout successful");
  	   }


}
