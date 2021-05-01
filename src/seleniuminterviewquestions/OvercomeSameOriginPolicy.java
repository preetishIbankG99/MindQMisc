package seleniuminterviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OvercomeSameOriginPolicy {
	public static void main (String[]args){
	DesiredCapabilities capability=new DesiredCapabilities().firefox();
	capability.setCapability(CapabilityType.PROXY,"your desire proxy");
	WebDriver driver=new FirefoxDriver(capability);
}}
