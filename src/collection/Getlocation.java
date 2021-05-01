package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getlocation {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		//First identify the WebElement to which you want the location and size
		WebElement ele=driver.findElement(By.name("q"));
		Point point=ele.getLocation();//ele.getLocation(); method should be used to get the location of the object
		//The return type of the getLocation() method is “Point” class instance
		//After creating object to getLocation object we can use getx() and getY() method to get xcoordinate and Y-coordinate
		//Return Type of getX() and getY() is integer
		int x=point.getX();
		int y=point.getY();
		System.out.println(x);
		System.out.println(y);
		/*ele.size(); method should be used to get the Size of the object
		The return type of the getSize() method is “Dimension” class instance
		After creating object to getLocation object we can use getHeight() and getWidth() method to get
		Height and Width respectively.*/
		
		Dimension dim=ele.getSize();
		dim.getHeight();
		dim.getWidth();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
	}

}
