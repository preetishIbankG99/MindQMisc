package collection;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingProxy {
public static void main(String[] args) {
	Proxy p=new Proxy();
	p.setHttpProxy("localhost:7777");
	DesiredCapabilities cap=new DesiredCapabilities();
	
	cap.setCapability(CapabilityType.PROXY, p);
	WebDriver driver=new FirefoxDriver(cap);
	driver.close();
}
}
