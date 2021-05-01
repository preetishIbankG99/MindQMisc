package collection;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sikuli {

	public static void main(String[] args) throws SikuliException {
		
	Screen screen=new Screen();
	
	Pattern image1=new Pattern("‪C:\\Users\\GUDU\\Desktop\\sikuli\\gmail.PNG");
	
	Pattern image2=new Pattern("‪C:\\Users\\GUDU\\Desktop\\sikuli\\username.PNG");
	
	Pattern image3=new Pattern("‪C:\\Users\\GUDU\\Desktop\\sikuli\\password.PNG");
	
	Pattern image4=new Pattern("‪C:\\Users\\GUDU\\Desktop\\sikuli\\next.PNG");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	screen.wait(image1,10);
	screen.click(image1);
	screen.click(image2);
	screen.type(image3, "gudubhanja");
	screen.click(image4);
	
	}

}
