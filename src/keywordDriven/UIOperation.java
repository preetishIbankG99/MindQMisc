package keywordDriven;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIOperation {
WebDriver driver;
public UIOperation(WebDriver driver){
	this.driver=driver;
	}
public void perform(Properties p,String operation ,String objectName,String objectType,String Value)throws Exception{
	System.out.println("");
	switch(operation.toUpperCase()){
	case "CLICK":
		driver.findElement(this.getobject(p,objectName,objectType)).click();
		break;
	case "SETTEXT":
		driver.findElement(this.getobject(p, objectName, objectType)).sendKeys(Value);
		break;
	case "GOTOURL":
		driver.get(p.getProperty(Value));
	break;
	default:
		break;
	}
}
private By getobject(Properties p, String objectName, String objectType)throws Exception {
	if(objectType.equalsIgnoreCase("XPATH")){
		return By.xpath(p.getProperty(objectName));
	}
	else if(objectType.equalsIgnoreCase("CLASSNAME")){
		return By.className(p.getProperty(objectName));
	}
	else if(objectType.equalsIgnoreCase("NAME")){
		return By.name(p.getProperty(objectName));
	}
	else if(objectType.equalsIgnoreCase("CSS")){
		return By.cssSelector(p.getProperty(objectName));
	}
	
	else if(objectType.equalsIgnoreCase("LINK")){
		return By.linkText(p.getProperty(objectName));
		
	}
	else if(objectType.equalsIgnoreCase("PARTIALLINK")){
		return By.partialLinkText(p.getProperty(objectName));
	}
	else
	{
		throw new Exception("Wrong object type");
	}}}
	




