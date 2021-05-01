package collection;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.internal.Utils;

public class ElementHighlighterNaveen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		//WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
		WebElement email=driver.findElement(By.name("username"));
		email.sendKeys("gudu");
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("gudu123");
		
	WebElement lgbtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	
	Thread.sleep(3000);
	//flasing the element
    flash(lgbtn,driver);
    //making border color for element type
    dropBorder(lgbtn,driver);
   //takescreen shot of element
    Thread.sleep(4000);
    File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Utils.copyFile(f, new File("H:\\photonwp\\MindQ\\Screenshots\\Elementnaveen.png"));
	//To Generate an  alert if any functionality fails
	
	//generateAlert(driver,"::This is an alert with my login button::");
	
	//clicking on element using javascript executor
	clickElement(driver,lgbtn);
	
	//refresh a webpage by javascript executor
	  refreshWebpageByJS(driver);
	  
	  //Getting Title from Page By Javascript
	  System.out.println(getTitleByJS(driver));
	  
	  //Get inner full page Text by javascript executor
	  System.out.println(getPageInnerText(driver));
	
	  
	  //Scrolling a webPage
	  scrollPageDown(driver);
	  
	  //Scroll into view until element found
	  WebElement forgotpwdlink=driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
	  scrollIntoView(driver,forgotpwdlink);
	
	}
	
public static void flash(WebElement element, WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=0;i<10;i++) {
		changeColor("rgb(0,200,0)",element,driver);
		
		}
	}
public static void changeColor(String color,WebElement element,WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e) {
		
	}
}

public static void dropBorder(WebElement element ,WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver); 
	 js.executeScript("arguments[0].style.border='3px solid red'",element); 
	
}
public static void generateAlert(WebDriver driver,String message) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("alert('"+message+"')" );
}
public static void clickElement(WebDriver driver,WebElement element) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].click();",element);
}
public static void refreshWebpageByJS(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("history.go(0)");
}
public static String getTitleByJS(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	String title=js.executeScript("return document.title;").toString();
	return title;
}
public static String getPageInnerText(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	String pageText=js.executeScript("return document.documentElement.innerText;").toString();
	return pageText;
}
public static void scrollPageDown(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
}
public static void scrollIntoView(WebDriver driver,WebElement element) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true);",element);
}



}
