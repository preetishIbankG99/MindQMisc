package sikkuli;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class DemoSikuli {

	public static void main(String[] args) throws SikuliException {
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://www.facebook.com");
//		driver.manage().window().maximize();
	Screen screen=new Screen();
	Pattern p1=new Pattern("C:\\Users\\GUDU\\Desktop\\pc.PNG"); 
    Pattern p2=new Pattern("C:\\Users\\GUDU\\Desktop\\New folder\\password.PNG");
	
    screen.wait(p1, 10); 
    // Calling 'type' method to enter username in the email field using 'screen' object
   screen.click(p1);
    
	
	
	
	
	}

}
