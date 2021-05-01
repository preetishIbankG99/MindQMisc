package testNGtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MixOfPriorityDependsOnMethods {
       @Test(priority=1)
		public void login(){
		System.out.println("loggedin successfully");
		}
		@Test(priority=2)
		public void checkmails(){
			Assert.assertEquals("google", "mango");
		System.out.println("checkedmails successfully");
		}

		@Test(priority=4)
		public void closewindow(){
		System.out.println("windowclosed successfully");
		}

		@Test(priority=3,dependsOnMethods={"checkmails"})
		public void logout(){
		System.out.println("loggedout successfully");
}
}