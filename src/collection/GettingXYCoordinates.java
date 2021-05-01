package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingXYCoordinates {
//Getting values of X and Y Coordinate
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		int x=driver.findElement(By.id("email")).getLocation().getX();
		System.out.println("My X co-ordinate point is:::"+x);
		int y=driver.findElement(By.id("email")).getLocation().getY();
		System.out.println("My Y co-ordinate point is:::"+y);
//Getting Height and Width of an Element
		
		Dimension value=driver.findElement(By.id("email")).getSize();
		System.out.println("Height and Width is::"+value);

		int width=value.getWidth();
		System.out.println("Width is::"+width);
	
	    int height=value.getHeight();
	    System.out.println("Height is::"+height);
	}
	

}
