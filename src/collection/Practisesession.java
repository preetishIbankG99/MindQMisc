package collection;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.Netapi32Util.Group;


public class Practisesession {
public static void main(String[] args) throws InterruptedException, Exception {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	 //driver.get("www.google.com");
	 //Caused by: org.openqa.selenium.WebDriverException: 
		//Target URL www.google.com is not well-formed.
 // driver.get("http://google.co.in");
	//driver.get("https://www.naukri.com/");
//driver.get("http://amazon.in");
//driver.get("http://flipkart.com");
	//driver.get("http://ebay.in");
//driver.get("http://www.gmail.com");
/*driver.findElement(By.id("Email")).sendKeys("preetish.bhanja@gmail.com");
driver.findElement(By.id("next")).click();
driver.findElement(By.name("Passwd")).sendKeys("abcd");
driver.findElement(By.id("signIn"));*/
//driver.navigate().back();
//Thread.sleep(3000);
//get doesnot remember any hitory but navigate()interface does
//using navigate you can go backward and forward
//driver.navigate().refresh();
  /*for clear of any field while after sending data
driver.findElement(By.name("q")).sendKeys("I am typing");
driver.findElement(By.name("q")).clear();
driver.findElement(By.name("q")).sendKeys("I am Retyping");*/
 
  /*for gettingCssValue
  WebElement searchbox=driver.findElement(By.name("q"));
 System.out.println(searchbox.getCssValue("font-family"));
 System.out.println(searchbox.getCssValue("font-size"));
 System.out.println(searchbox.getCssValue("color"));*/
 
  /* for getting location where element is present we use getLocation
 WebElement signin=driver.findElement(By.id("gb_70"));
Point locale=signin.getLocation();//point is a class
 System.out.println(locale.getX()+","+locale.getY());
  
  */
  
   /*for getSize() it returns the width and height of the Element 
  WebElement signin=driver.findElement(By.id("gb_70"));
  Dimension locale=signin.getSize();
  */
  
  /*for getting a tag name
  WebElement signin=driver.findElement(By.id("gb_70"));
  String tag=signin.getTagName();
  System.out.println(tag);*/
  //for getting the visible text of an element
 /* WebElement signin=driver.findElement(By.id("gb_70"));
  String mytext=signin.getText();
  System.out.println(mytext);*/
  
  //isSelected,isEnabled,isDisplayed
//  WebElement signin=driver.findElement(By.id("gb_70"));
//  signin.click();
//  boolean staysignin=driver.findElement(By.id("PersistentCookie")).isSelected();
//  System.out.println(staysignin);
  
  
 /* for gettingAttribute
  String myvalue=driver.findElement(By.id("gb_70")).getAttribute("href");
System.out.println(myvalue);
*/
  
  /*	for getting the current url
	System.out.println(driver.getCurrentUrl());
*/

	/*for getting the current title
	System.out.println(driver.getTitle());*/
	
/*for getting pagesource
	System.out.println(driver.getPageSource());*/
	//window handle
	//System.out.println(driver.getWindowHandle());
	//gettin a cookie name
	//System.out.println(driver.manage().getCookieNamed("ebay"));

	/*for getting cookies
	System.out.println(driver.manage().getCookies());*/
	
	//driver.close();
//driver.close () it will close the currently open browser
//driver.quit()it will close all the browser open by selenium webbrowser
//driver.findElement(By.xpath(".//*[@id='qsbClick']/span[1]")).sendKeys("searchjobs");
//driver.quit();
//sendKeys() will be used to eneter text into the textbox
//we can use sendKeys() after identifying the object or  locators 
//For css selector By.css("(Html tag[property name='value']"))
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
 
/*FindElement returnType WebElement findelement find only one object at a time

WebElement searchbox=driver.findElement(By.className("LM6RPg"));
searchbox.sendKeys("trimmers");*/

//FindElements returnType  List of WebElement(List<WebElement>) findElements find more than one object
/*List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("Total no of links on flipkart site are:"+links.size());
int count=0;
for(WebElement ele:links)
{
if(!ele.getText().equals(""))
{
	count=count+1;
	System.out.println(ele.getText());
}
System.out.println("Total no of links with text are:"+count);
}

*/

/*//if we know the text of the link on which we will perform an action.
//we should use link text method
WebElement link=driver.findElement(By.linkText("Log In"));
link.click();*/

/*//if we dont know the text of the link which we are using becoz the text of the link
//changing frequently then we should use partial link text
WebElement link =driver.findElement(By.partialLinkText("Log"));
link.click();*/

/*//Handling Keyboard by using Action class
//selenium cannot perform  multiple actions at a time
//we should combine all the actions together and make a composite action using build and to  perform the composite action we use perform
Actions act=new Actions(driver);
act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();

Actions act=new Actions(driver); 
act.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.ALT).build().perform();

*/
//Handling Mouse actions
//if you want to move the cursor on the particular element we use use method in action class moveTo()

/*WebElement link=driver.findElement(By.linkText("Fashion"));
link.click();

Actions act =new Actions(driver);
act.moveToElement(link).build().perform();*/

//Mouse Hover
/*WebElement Link = driver.findElement(By.linkText("Cameras"));
Actions act = new Actions(driver);
act.moveToElement(Link).build().perform();*/

//dragAndDrop
/*Actions act=new Actions(driver);
WebElement Source=driver.findElement(By.id("gh-btn"));
WebElement Target=driver.findElement(By.id("gf-fbtn"));
act.dragAndDrop(Source, Target).build().perform();

*/
//doubleclick()
//the parameter for contextClick Method is WebElement
/*WebElement ele=driver.findElement(By.linkText("Track My Order"));
Actions act=new  Actions(driver);
act.contextClick(ele).doubleClick().build().perform();*/

//Rightclick()
/*WebElement ele=driver.findElement(By.linkText("Track My Order"));

Actions act=new Actions(driver);
act.contextClick(ele).perform();*/

//clickAndHold()
//  WebElement ele=driver.findElement(By.linkText("Track My Order"));
//  Actions act=new Actions(driver);
  //act.clickAndHold(ele);
 // act.moveByOffset(100, 300).perform();
//act.dragAndDropBy(ele, 100, 300);

  //Taking a screen shot
	/*Selenium Does not provide any option to take the screenshot of the webapplication
	for that we have to use another interface called takeScreenshot of the page of application
	we should take the screen shot with file name
	we should use typecasting to convert the browser instance(driver) to take Screenshot interface
	After typecasting driver to take screenshot interface you should use a method getScreenShotAs().we should take screens hot as a file
	the return type of getScreenshot method is file
	After taking the Screenshot we should transfer the file to local computer & save it as a specified name
	To do it we will use a class called File utils which should be taken from apache Common.io.FIle.Utils
	inside Fileutils class we should use copyfile method to move the file to local computer
	copy file method will take two parameters SourceFile ,DestinationFile
	While creating a file we can use two extension(.png,.jpeg)
	When we take screenshot in firefox browser it will get screenshot as entire page
	but apart from firefox any other browser it will give only visible path as screen shot*/

//File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(f, new File("D:/newFile/screenshot.png"));

	//Javascript Executor
	/*it is a interface in selenium webdriver which will help us to use java script
	in case if sendkeys,click method page refresh ,scrolling not works using selenium
	we can use js executor as a alternative we cant write js code inside selenium directly so we should 
	use jsexecutor like wise screenshot typecasting is require for js executor
	after typecasting browser object to javascript execution interface we should use
	a method called executorscript to write jscode
	executescript method takes two parameters(script,arguements)
	script is mandatory and arguement is optional*/
	/*JavascriptExecutor jse=((JavascriptExecutor)driver);
	jse.executeScript("window.location='http://ebay.in'");
	jse.executeScript("document.getElementById('gh-ac').value='back packs'");
	jse.executeScript("document.getElementById('gh-btn').click()");

	for (int i = 0; i < 3; i++) {
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,900)");
	}
	jse.executeScript("history.go(0)");//for refresh
*/
	//Handling Dropdown in selenium
	/*driver.get("http://ebay.in");
	WebElement dropDown=driver.findElement(By.id("gh-cat"));
	Select sel=new Select(dropDown);
	//sel.selectByIndex(1);
	//sel.selectByValue("1249");
	//sel.selectByVisibleText("Charity");
	
	//list of elements present in dropdown box
	List<WebElement>items=sel.getOptions();
	for(WebElement item:items){
		System.out.println(item.getText());
	} //  isMultiple,getAllSelectedOption,getFirstSelectedOption,deselectBy(Index,Value,VisibleText,All)
	
	driver.get("http://ebay.in");
	WebElement dropDown=driver.findElement(By.id("gh-cat"));
	Select sel=new Select(dropDown);
	//WebElement ele=sel.getFirstSelectedOption();
	//System.out.println(ele.getText());
	sel.selectByIndex(2);
	Thread.sleep(4000);
	sel.deselectByIndex(2);
	*/
	
/*	//WindowHandles
a)getWindowHandle()
It will provide the id of currently focused window
b)getWindowHandles()
it will provides the ids of all the windows open by selenium webdriver
The return type of getWindowHandle() is StringType
The return type of getWindowHandles() is Set<String> 
Ratherthan using windowHandle its recommend to use title.to get the title of webpage
we should use getTitle() in selenium.its return Type is String
GetTitle will provide the title of webpage which is currently focused
*/
	//close to switch the focus window
	/*public class GetWindowHandle {
		static public void CloseWindow (WebDriver driver,String data){
			Set<String>Windows=driver.getWindowHandles();
			for(String str:Windows){
				driver.switchTo().window(str);
				String title=driver.getTitle();
				if(title.equals(data)){
					driver.close();
					
				}
			}

		}
			
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.naukri.com");
			GetWindowHandle obj=new GetWindowHandle();
			Thread.sleep(3000);
			obj.CloseWindow(driver, "Amazon");
		}
			*/
	//getWindowHandles
	/*public class WindowHandles {
		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.naukri.com");
			WindowHandles wh=new WindowHandles();
			String str=driver.getWindowHandle();
			System.out.println(str);
			String title=driver.getTitle();
			System.out.println(title);
			Set<String>allWindows=driver.getWindowHandles();
			System.out.println(allWindows);//it will print all windows id in console
			for(String handle:allWindows){
				driver.switchTo().window(handle);
				if(driver.getTitle().equals("Amazon")){
					String AmazonUrl=driver.getCurrentUrl();
					System.out.println(AmazonUrl);
					
				}
				
			
			}
			
			

		}
		}*/
	
	//XpathGenerating
/*//formula for xpath 	.//*[@locator='  ']   (id,class,css)
	//Absolute(taking nearest id if it is not possible)
	it begins with a root path and is prefixed with a /
	ex-/html/body/div/div[@id='lst-ib']
	//relative
			begins from current location is prefixed by //
			ex- //input[@id='lst-ib']
	*/
	//DynamicObject of xpath
	/* step1-Remove the part of xpath which is dynamic
	ex-.//*[@id='yui_3_18_0_3_1492202037964_1170']
	after change
	.//*[@id='yui_3_18_0_3]
	step-2-place "contains" infront of @Symbol
	step-3-keep brackets () for attributes
	step-4-Replace"=" with","
	original path
	.//*[@id='yui_3_18_0_3_1492202037964_1170']
	after changes
	.//*[contains(@id,'yui_3_18_0_3')]
	or
	.//*[starts-with(@id,'yui_3_18_0_3')]
	*/
	/*Ex-public class DynamicObject {

		public static void main(String[] args) throws Exception  {
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("selenium training");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@id,'yui_3_18_0_3')]/li[2]")).click();    


		}
	*/
	//Auto it
	/*package browsermethods;

	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class FileUploadUsingAutoit {
		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tutorialspoint.com/");

			driver.findElement(By.className("fa")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("START NOW")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='uploader_browse']/span[2]")).click();
			
			Runtime.getRuntime().exec("cmd /C C:\\Users\\Mindq-pc\\Desktop\\screens\\FileUpload.exe");
		
		}
		
		
	}
	//create below code in auto it editor in vb script
	WinActivate("File Upload")
	sleep(2000)
	send(path+filename)
	sleep(2000)
	send("{Enter}")
	*/
	
	//Robot: This class will be used to press and release the keyboard keys
	/*We can automate window based pop-ups using Robot class. Generally selenium automates only
	browsers if any window based pop-ups encounters you can use Robot class to generate
	keyboard or mouse events to handle those
	*/
	
//	Toolkit .getDefaultToolkit().getSystemClipboard().set Content ()
	
	/*#1: Use String Selection class to create a string to transfer to the system clipboard to copy the
	path of the file.
	#2: Use Toolkit.getDefaultToolkit ().getSystemClipboard () to get the system clip board.
	#3: Use set Content () method to send the path of the file to the clipboard which we stored using
	String Selection.
	#4: Use Robot class to press Ctrl+v (Paste the content from clipboard) and enter buttons in the
	keyboard and release the keys immediately. Using keypress and Key Release methods in Robotclass
	
	*/
	//Ex-package browsermethods;

/*import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotExample {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/");

		driver.findElement(By.className("fa")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("START NOW")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='uploader_browse']/span[2]")).click();
	
		StringSelection sel=new StringSelection("C:\\Users\\Mindq-pc\\Desktop\\abcd.java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(contents, owner);
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
	*/
//	Synchonization
/*	1)ImplicitWait
 * Implicit waits will be in place for the entire time the browser is open. This means selenium will
wait maximum of implicit wait time before throwing an exception error, but incase that element
exists before that maximum time also, still it will be waiting for that much time.
Logic:-Selenium checks the control in first go, incase it is not able to find the control it will wait
for the given implicit time, and then try again, after the end of the wait time to look for the
control before throwing an exception. By default its value is 0.
Syntax:-
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
It accepts 2 params, time to wait = 20 and TimeUnit which is seconds in our case. Thus here, It
asks selenium to wait for 20 seconds for all the controls before throwing an error.
it will be use to wait for all the objects inside the code
it will verify the obj for first second if the obj is available
in first second it will not wait any time for that obj.if obj is
not available selenium will wait for the specify amount of time
Ex-WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit for each
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.findElement(By.id("Email")).sendKeys("preetish.bhanja@gmail.com");
		driver.findElement(By.id("next")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
		driver.findElement(By.id("Passwd")).sendKeys("abcd");*/

	
	//2)Explicit
/*it will wait for a particular object("single object")
We are explicitly making the execution of selenium code to wait, for a certain condition to occur
before, proceeding further in the code.
	*/
	
	/*public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		//Creating an obj forWebDriverWait class to apply wait on particular obj as shown above 
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.withTimeout(15, TimeUnit.SECONDS).pollingEvery(5,
		TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("adsfsdfds")));
*/

/*3)Fluentwait
if we want to check an object iteratively(repeatedly)we should use it
fluent wait check for the object iteratively once the obj is available
it will continue the execution process
it is a class in selenium we can access all the methods bycreating obj to the class
the parameter to the constructor of fluent wait is browser obj
FluentWait fw=new fluentWait()
It defines the maximum amount of time to wait for a condition, as well as the frequency with
which to check the condition. Furthermore, the user may configure the wait to ignore specific
types of exceptions whilst waiting, such as NoSuchElementExceptions when searching for an
element on the page.
It is mostly used, while working with AJAX applications as well as in scenarios when element
load time fluctuating.*/
	/*Ex-	
public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://google.com");
FluentWait f=new FluentWait(driver);
f.withTimeout(15,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
f.until(ExpectedConditions.visibilityOfElementLocated(By.name("gjgjg")));

*/
//Handling Frames
	/*What is a Frame:HTML frames are used to divide your browser window into multiple
	sections where each section can load a separate HTML document. A collection of frames in the
	browser window is known as a frame set.

How to confirm that you are encountered frame on the webpage:
Right click on the webpage you can see an option called “This Frame”

*/
	/*1. driver.switchTo().frame(Index);
	Index starts with “0”.
	The first Frame is Frame “0” and soon..
	Code:
	driver .switchTo().frame(0);*/
 
	/*//2.driver.switchTo().frame(Id or Name as String)
	driver .switchTo().frame(“Frame”);/ / using Name
	driver .switchTo().frame(“0”);/ / using Id
*/

/*3. driver .switchTo().frame(Webelement );
Identify the frame as a WebElement and pass the WebElement to the frame method
Code:
WebElement DropDown=driver.findElement(By.id("gh-cat-box"));
driver .switchTo().frame(DropDown);

public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://paytm.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("_3ac-")).click();
//		driver.switchTo().frame(0);
		WebElement frm=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("input_0")).sendKeys("abcd");

*/

	//	Handling Window Alerts:
		
/*Alert box is a window component which will be designed by using javascript.there are three types of alert box
(1)information-contains only ok button (2)confirmation-contains both ok and cancel button(3)Prompt Alert-Alert which takes an input and OK and Cancel Button
accept() To accept the alert
dismiss() To dismiss the alert
 getText() To get the text of the alert
sendKeys() To write some text to the alert
identification of alertbox-if it appears we cannot perform any action on the web applicationuntil unless we click on ok buttons

*/

	/*1)Code to accept the Alert:
	Alert simpleAlert = driver.switchTo().alert();
	String alertText = simpleAlert.getText();
	System.out.println("Alert text is " + alertText);
	simpleAlert.accept();

	2)Alert confirmationAlert = driver.switchTo().alert();
	confirmationAlert.dismiss();
	
	3)Code to Enter text in to the confirmation alert and clicking OK:
		Alert promptAlert = driver .switchTo().alert ();
	String alertText = promptAlert .getText();
	System.out.println("Alert text is " + alertText);
	promptAlert .sendKeys("Accepting the alert");
	Thread.sleep(4000); //This sleep is not necessary, just for demonstration
	promptAlert .accept ();
	
	Ex2-driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Helllo");
		alert.accept();
		System.out.println(alert.getText());

*/
//Using Wget Utility(First download wget.exe file from the https://eternallybored.org/misc/wget/)
/*
	WGet is a command-line tool used to download files.
	If you want to download a file in any browser you can use WGet utility.
	Steps:
		To construct the command you have to use the below steps
		Step1: Specify the place where you have the wget.exe file in your computer
		Step2: specify the path where you want to download the file
		Step3: Specify from where the file should be downloaded
		import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class wgetExample {
		
		public static void main(String[] args) throws IOException {
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://seleniumhq.org/download");
			
			WebElement downloadLink=driver.findElement(By.linkText("32 bit Windows IE"));

			String fileloc=downloadLink.getAttribute("href");
			
			
			Runtime.getRuntime().exec("cmd /C C:\\Users\\Mindq-pc\\Desktop\\screens\\wget.exe -P C:\\Users\\Mindq-pc\\Desktop\\screens "+fileloc);
			
		}

	}*/

//handling Radiobutton and CheckBox
	/*CheckBox: a small box on a form into which a tick or other mark is entered as the response to a
	question.
	Radio But ton: an icon representing one of a set of options, only one of which can be selected at
	any time.
	How to Identify CheckBox and RadioBut ton:
	Like All other controls you can identify checkbox also with any attribute value from the HTML
	We are discussing only about checkboxes because radio button user can select only one at a
	time.
	Moreover when ever you click on the radio button even though it’s selected it is not going to
	deselect .
	Radio Button does not have any deselect option:
		Ex:   public class RadioButtonCheckBox {

			  public static void main(String[] args) {

				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");

				WebElement checkbox = driver.findElement(By.name("permission"));

				checkbox.click();
				if (checkbox.isSelected()) {
					System.out.println("Checkbox already selected");
				} else {
					checkbox.click();
				}

			}


public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
//checkbox
WebElement Checkbox=driver.findElement(By.name("permission"));
Checkbox.click();
if(Checkbox.isSelected()){
	System.out.println("Checkbox is selected");
}
else{
	Checkbox.click();
}
//Radiobutton	
WebElement Radiobutton=driver.findElement(By.id("two"));
Radiobutton.click();
if(Radiobutton.isSelected()){
	System.out.println("radio button is selected");
}
else{
	Radiobutton.click();
System.out.println("now it is selected");
}
}
*/
//Getting css values of an object from html page
//	Whenever we are testing the applications, we may require css value of the element. Say now we
//	need to check the scenario of a button color/state getting changed or not when we do mouse
//	hover.
//	To check this, we can check the css values that are changing when we perform mouse hover on
//	the element.
//	css selector provides an option to identify an object using any attribute available for object
//	syntax for css selector to identify obj
//	1)("Html tag[property Name='value']")
//    2)[attribute name='attribute value']
	
    		
   /* ex-driver.get("http://redbus.in");
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement Destination=driver.findElement(By.cssSelector("[class='db'][type='text'][id='dest']"));
    	driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();	
    		*/
    		
    //Reading Data From Excel by using apache poi
	/*Java does not provide any option to read the data from excel .Like selenium you should use some jarfiles
	to read the excell.there are two vendors who will provide support to read the data from excell
	1)JXL(Java Excel ApI)-it will read or modify the excell file only upto office 2003.To read or modify we should use Apache poi
    its supports .xls file
    2)Apache poi(poi-poor obfuscation implementation)-Apache poi read 97,2003,2007,2010
and the latest version of .xlsx-file extension for an open xml

Steps for POI
1)get access to the workbook
2)get access to the sheet inside work book
3)get used no of row count
4)iterate through each row and get the column count
5)iterate through each column and get access to each cell
    		*/
 /* EX-public static void main(String[] args) throws Exception    {
	  //get access to the workbook
	  XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\GUDU\\Desktop\\gudu.xlsx");
	  //get access to the sheet inside work book
	  XSSFSheet sh=wb.getSheet("Sheet1");//or wb.getSheetAt(0);
	  
	  //For individual cell value
	  //String data=sh.getRow(0).getCell(0).getStringCellValue();
	  //System.out.println("Value in first cell " + data);
	  //get used no of row count
	  int rowCount=sh.getPhysicalNumberOfRows();
	  //iterate through each row and get the column count
	  for(int i=0;i<rowCount;i++){
	  //iterate through each column and get access to each cell
		  int colCount=sh.getRow(i).getPhysicalNumberOfCells();
	  	
		  for(int j=0;j<colCount;j++){
	  		
			  XSSFCell cell=sh.getRow(i).getCell(j);
	  		
			  System.out.println(cell);
	  	}
	  System.out.println("--");

	  }
	  wb.close();
	  }  		
    		*/
    		
    //Handling Webtables
	/*Web tables are basically group of elements that are logically stored in a row and column format.
	It is used to organize similar information in a web page
	Below tags are generally defined in an html tables:
		1."table" tag defines html table.
		2."tbody" tag defines container for rows and columns.
		3."tr" defines rows in an html table.
		4."td"/’th’ define column of an html table.
		Steps to read all the values from the HTML table:
		Step-1: First get the number of rows in the webtable (All Tr tags inside the tbody)
		Step-2: Iterate through all the rows and get the column count for each row(All td for each tr tag)
		Step-3: Iterate through all the columns and get all the cell values
		Above approach will be best suitable if the table dimensions changes dynamically
    		or
    		Developer develop/design a webtable by using<table>tag
    		table content will be stored inside a tag called<tr>-table row
    		Each row contains columns to design a cell or column developers  will use
    		<td>tag-table data
    		
    		Ex-1)ArrDept
    		package browsermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrDeptTimeCal {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://indianrail.gov.in");
		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.linkText("Reserved Train Schedule"));

		link.click();

		WebElement searchBox = driver.findElement(By.id("lccp_trnname"));
		searchBox.sendKeys("14553");

		WebElement button = driver.findElement(By.className("btn_style"));
		button.click();

		List<WebElement> rows = driver.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr"));

		System.out.println("No fo rows inside the table are :" + rows.size());

		for (int i = 2; i <= rows.size(); i++) {
			List<WebElement> cols = driver
					.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <= cols.size(); j++) {

				WebElement cell = driver.findElement(
						By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[" + i + "]/td[" + j + "]"));

				String cellValue = cell.getText();
				if (cellValue.equals("BASSI PATHANAM")) {
					WebElement arrTime = driver
							.findElement(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[" + i + "]/td[5]"));
					WebElement deptTime = driver
							.findElement(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[" + i + "]/td[6]"));

					System.out.println("Arrival time at Panipat is :" + arrTime.getText());
					System.out.println("departure time at Panipat is :" + deptTime.getText());
				}
			}

		}
	}

}
    		Ex-2)calender
    		package browsermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();

		WebElement calender = driver.findElement(By.xpath(".//*[@id='txtJourneyDate']"));

		calender.click();

		while (true) {
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			if (month.equals("June")) {
				break;
			} else {
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			}

		}

		List<WebElement> rows = driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[1]/tbody/tr"));

		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> cols = driver
					.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[1]/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <= cols.size(); j++) {

				WebElement ele = driver.findElement(
						By.xpath("(.//*[@class='ui-datepicker-calendar'])[1]/tbody/tr[" + i + "]/td[" + j + "]"));

				String eleValue = ele.getText();
				if (eleValue.equals("22")) {
					ele.click();
				}
			}
		}
	}
}

Ex-3)Webtable
package browsermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// printing all the table values in to the console
		WebDriver driver = new FirefoxDriver();
		driver.get("http://indianrail.gov.in");
		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.linkText("Reserved Train Schedule"));

		link.click();

		WebElement searchBox = driver.findElement(By.id("lccp_trnname"));
		searchBox.sendKeys("14553");

		WebElement button = driver.findElement(By.className("btn_style"));
		button.click();

		List<WebElement> rows = driver.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr"));

		System.out.println("No fo rows inside the table are :" + rows.size());

		for (int i = 2; i <= rows.size(); i++) {
			List<WebElement> cols = driver
					.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <= cols.size(); j++) {

				WebElement cell = driver.findElement(
						By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[" + i + "]/td[" + j + "]"));

				System.out.print(cell.getText());
				System.out.print("--");

			}
			System.out.println();
		}
	}

}

*/
 //TESTNG{TEST NEXTGENERATION}
/*	Junit is the old generation of TestNG .Junit will be used to perform unit Testing.
	Unit testing will be done by the developers to test their codes.Developers will perform unit testing
	to reduce no of defects encountered while testing.junit will be perform only unit testing where as TestNg will be use to perform
	both unit as well as Functional testing.
	Functional Testing includes regression testing,retesting,smoke testing,sanity testing etc
	Junit & TestNG contains some reusable codes which will be called as annotations.TestNG provides more no of
	annotations where as Junit provides Very less number of annotations.The reusable code will be more in TestNG than Junit.
	Junit will not provide any support to perform paralleroup testing support execution where as TestNG provides support to perform parallel execution.
	Junit doesnot provide Any support for group testing.where as TestNG provides Group testing support.
    Junit doesnot provide any support to perform dependency testing.TestNG provide support in case of dependency testing.name*/
	/*Annotations In testNG:
		@BeforeSuite: The annotated method will be run before all tests in this suite have run.
		@AfterSuite: The annotated method will be run after all tests in this suite have run.
		@BeforeTest: The annotated method will be run before any test method belonging to the
		classes inside the tag is run.
		@AfterTest: The annotated method will be run after all the test methods belonging to the
		classes inside the tag have run.
		@Before Groups: The list of groups that this configuration method will run before. This method
		is guaranteed to run shortly before the first test method that belongs to any of these groups is
		invoked.
		@After Groups: The list of groups that this configuration method will run after. This method is
		guaranteed to run shortly after the last test method that belongs to any of these groups is
		invoked.
		@Before Class: The annotated method will be run before the first test method in the current
		class is invoked.
		@After Class: The annotated method will be run after all the test methods in the current class
		have been run.	
		@Before Method: The annotated method will be run before each test method.
        @After Method: The annotated method will be run after each test method.
        @Test: The annotated method is a part of a test case.
		
		@DataProvider:Parameter list of the test method.The @ test method that wants to receive data
		from this DataProvider needs to use a data provider name equals to the name of this annotation
		
		@Factory:Marks a method as a factory that returns objects that will be used by TESTNG as Testclasses.This method must return object[]
		@Listener:Defines listeners on a test class
		@Parameters:Defines how to pass parameter to @ Test method
		
Ex-public class TestNG {
public WebDriver driver;
@BeforeMethod
public void beforeMethod() {
// Create a new instance of the Firefox driver
driver = new FirefoxDriver();
driver.get("http://www.Gmail.com");
}
@Test
public void main() {
// Find the element that's ID attribute is 'account' And enter send keys
driver.findElement(By.id("Email")).sendKeys("malli.arjun440@gmail.com");
// Click on Next Button
driver.findelement(by.id("next")).click();
// Find the element that's ID attribute is 'pwd' (Password)
// Enter Password on the element found by the above desc.
driver.findElement(By.id("Passwd")).sendKeys("Test@123");
// Now Sign In. WebDriver will find the form for us from the element
driver.findElement(By.id("signIn")).click();
// Print a Log In message to the screen
System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
// Find the element that's ID attribute is 'account_logout' (Log Out)
driver.findElement(By.id("account_logout"));
}
@AfterMethod
public void afterMethod() {
// Close the driver
driver.quit();

Run the test by right click on the test case script and select Run As > TestNG Test
		TestNG also produce HTML reports. To access those reports go to the Project directory and
opentest -output folder.

//TestNG Annotations:
Annotations hierarchy or Annotations levels in TestNG.
<suite>
<test>
<classes>
<method>
<test>
</method>
</classes>
</test>
</suite>
@Test is the smallest annotation here. @Method will be executed first, before and after the
execution of @Test. The same way @Class will be executed first, before and after the execution
of @Method and soon.

ex-@Test
public void testCase1() {
System.out.println("This is the Test Case 1");
}
@Test
public void testCase2() {
System.out.println("This is the Test Case 2");
}
@BeforeMethod
public void beforeMethod() {
System.out.println("This will execute before every Method");
}
@AfterMethod
public void afterMethod() {
System.out.println("This will execute after every Method");
}
@BeforeClass
public void beforeClass() {
System.out.println("This will execute before the Class");
}
@AfterClass
public void afterClass() {
System.out.println("This will execute after the Class");
}
@BeforeTest
public void beforeTest() {
System.out.println("This will execute before the Test");
}
@AfterTest
public void afterTest() {
System.out.println("This will execute after the Test");
}
@BeforeSuite
public void beforeSuite() {
System.out.println("This will execute before the Test Suite");
}
@AfterSuite
public void afterSuite() {
System.out.println("This will execute after the Test Suite");
}
}
o/p-This will execute before the Test Suite
This will execute before the Test
This will execute before the Class
This will execute before every Method
This is the Test Case 1
This will execute after every Method
This will execute before every Method
This is the Test Case 2
This will execute after every Method
This will execute after the Class
This will execute after the Test
PASSED: testCase1
PASSED: testCase2


*/
 //TestNG Running test in batch
	/*test1-
	package testng;

	import org.testng.annotations.Test;

	public class LoginTest {
	@Test
	public void LoginViaGmail(){
		System.out.println("Successfully Login via Gmail");
	}
	@Test
	public void LoginViaFacebook(){
		System.out.println("Successfully Login via Facebook");
	}
	@Test
	public void LoginViaHotmail(){
		System.out.println("Successfully Login via Hotmail");
	}
	@Test
	public void LoginViaYahoo(){
		System.out.println("Successfully Login via Yahoo");
	}
	}*/

    /*	test2-package testng;

import org.testng.annotations.Test;

public class SignUp {
  @Test
  public void SignUpViaGmail() {
  System.out.println("Succesfully Signed Up via Gmail");
  }
  @Test
  public void SignUpViaFacebook() {
  System.out.println("Succesfully Signed Up via Facebook");
  }
  @Test
  public void SignUpViaYahoo() {
  System.out.println("Succesfully Signed Up via Yahoo");
  }
}
	*/
   /*xml file-<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
   <suite name="Functional TestSuite">
   <test verbose="2" name="Basic tests">
     <classes>
       <class name="testng.LoginTest"/>
       <class name="testng.SignUp"/>
     </classes>
   </test> <!-- Default test -->
 </suite> <!-- Default suite -->
 		*/
    		
  //  Multiple Batch		
/*	Ex-public class LoginTest {
		@Test
		public void LoginViaGmail(){
			System.out.println("Successfully Login via Gmail");
		}
		@Test
		public void LoginViaFacebook(){
			System.out.println("Successfully Login via Facebook");
		}
		@Test
		public void LoginViaHotmail(){
			System.out.println("Successfully Login via Hotmail");
		}
		@Test
		public void LoginViaYahoo(){
			System.out.println("Successfully Login via Yahoo");
		}
		}
ex2-package testng;

import org.testng.annotations.Test;

public class SignUp {
  @Test
  public void SignUpViaGmail() {
  System.out.println("Succesfully Signed Up via Gmail");
  }
  @Test
  public void SignUpViaFacebook() {
  System.out.println("Succesfully Signed Up via Facebook");
  }
  @Test
  public void SignUpViaYahoo() {
  System.out.println("Succesfully Signed Up via Yahoo");
  }
}
ex3-public class PaymentTest {
	@Test
	public void paymentinDollar(){
		System.out.println("Dollar payment is success");
	}
	@Test
	public void paymentinRupee(){
		System.out.println("Rupee payment is success");
	}
	}
ex4-public class PaymentReturn {
	@Test
	public void PaymentReturnbyBank(){
		System.out.println("Payment Return By Bank");
	}
	//XML basic function
	ex-<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="Basic Functional TestSuite">
	  <test verbose="2" name="Basic tests">
	    <classes>
	      <class name="testng.LoginTest"/>
	      <class name="testng.SignUp"/>
	    </classes>
	  </test> <!-- Default test -->
	</suite> <!-- Default suite -->

	//XML Payment
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="paymentfuntction suite">
	  <test verbose="2" name="Payment test">
	    <classes>
	      <class name="testng.PaymentTest"/>
	      <class name="testng.PaymentReturn"/>
	    </classes>
	  </test> <!-- Default test -->
	</suite> <!-- Default suite -->
    		
    	//XML Function multi batch
	<?xml version="1.0" encoding="UTF-8"?>
	<suite name="Functional1 TestSuite">
	<suite-files>
	<suite-file path="./paymentfunctional.xml"/>
	<suite-file path="./basicfunctional.xml"/>
	</suite-files>
	</suite><!-- Default suite -->
    		*/
    		
	//Skipping a Test Case	
	/*Think of a situation where you are required to skip one or more @Test from your testng class.
	In testng, you can easily able to handle this situation by setting the ‘enabled’ parameter to ‘false’
	for e.g.:
	@Test(enabled = false)
	To use two or more parameters in a single annotation, separate them with a comma:
	@Test(priority = 3, enabled = false)*/
    		
	/*public class SkipTest {
		public WebDriver driver;
		@Test(priority = 0)
		public void One() {
		System.out.println("This is the Test Case number One");
		}
		@Test(priority = 1)
		public void Two() {
		System.out.println("This is the Test Case number Two");
		}
		@Test(priority = 2, enabled = false)
		public void Three() {
		System.out.println("This is the Test Case number Three");
		}
		@Test(priority = 3)
		public void Four() {
		System.out.println("This is the Test Case number Four");
		}
	}*/
	
	/*O/p
	This is the Test Case number One
	This is the Test Case number Two
	This is the Test Case number Four
	PASSED: One
	PASSED: Two
	PASSED: Four

	===============================================
	    Default test
	    Tests run: 3, Failures: 0, Skips: 0	*/	
    		//OR
    /*	//Ex-2//public class SkipTest {
	public WebDriver driver;
	@Test(priority = 0)
	public void gmail() {
	System.out.println("This is the gmail");
	}
	@Test(priority = 1)
	public void twitter() {
	System.out.println("This is the twitter");
	}
	//@Test(priority = 2, enabled = false)
	@Test(priority=2)
	public void facebook() {
	System.out.println("This is the facebook");
	throw new SkipException("facebook function not supported");
	}
	@Test(priority = 3)
	public void hotmail() {
	System.out.println("This is the hotmail");
	}
}	*/
    	
	//How to run Failed testcase	
	
	/*Ex-public class FailTest {
		public WebDriver driver;
		@Test(priority = 0)
		public void gmail() {
		System.out.println("This is the gmail");
		//pass both actual and expected are equal
		//Assert.assertEquals("preetish", "preetish");
		//fail
		Assert.assertEquals("preetish", "preetish1");
		System.out.println("After Assert condition");
		
		//how to overcome failtest using try catch
		try{
		Assert.assertEquals("preetish", "preetish1");
		}
		catch(Throwable t){
		System.out.println(t);
		}
		//Failed Upper & Lowercase
		//Assert.assertEquals("preetish", "Preetish");
		
		//For integer fails
		//Assert.assertEquals(1,2);
		
		//pass
		//Assert.assertTrue(4>2);
		//fail
			//Assert.assertTrue(4>5);
		
		//pass bcoz condition is false
		//Assert.assertFalse(1>4);
		//fail bcoz condition is false
		//Assert.assertFalse(1<4);
		
		}
		@Test(priority = 1)
		public void twitter() {
		System.out.println("This is the twitter");
		}
    	*/	
	//Priority
	/*Prioritizing:
		You n e ed to u se th e ‘priority‘parameter , if you want the methods to be executed in your
		order . Parameters are keywords that modify the annotation’s function
    //Priority example
*/	//With Priority i can change the Execution from Alphabetical order to my Order
	/*public class PriorityEx {
	  @Test(priority=1)
	  public void a() {
	  System.out.println("I am Method A");
	  }
	@Test(priority=2)
	public void c(){
		System.out.println("I am Method C");
	}
	@Test(priority=3)
	public void b(){
		System.out.println("I am Method B");
	}
	}
*/
  // Dependency or dependsOnMethod
	/*Sometimes, you may need to invoke methods in a Test case in a particular order or you want to
	share some data and state between methods. This kind of dependency is supported by TestNG
	as it supports the declaration of explicit dependencies between test methods.
	TestNG allows you to specify dependencies either with:
	1) Using attributes dependsOnMethods in @Test annotations OR
	2 )Using attributes dependsOnGroups in @Test annotations.
	*/
	/*Ex-public class DependsOnMethod {
		@Test
		public void login(){
			System.out.println("login successful");
		}
		@Test(dependsOnMethods={"login"})
		public void search(){
			System.out.println("Search successful");
		}
		@Test(dependsOnMethods={"search"} ,alwaysRun=true)
		public void advancedsearch(){
			System.out.println("Advancedsearch successful");// in priority if assert=false then also its execute rest of program
			Assert.assertEquals("Gmail", "Google");//but in dependsOnMethods it will skip the rest code from where its assertion fails
		}
		@Test (dependsOnMethods={"advancedsearch"})
		public void logout(){
			System.out.println("logout successful");
		}
		}*/
    		
    	//TestNG Parameters
//	TestNG again gives us another interesting feature called TestNG Par ameter s. TestNG lets you
//	pass parameters directly to your test methods with your testng.xml.

	/*parameter class
	Ex-public class TestngParameters {
	
	
	@Parameters("Email")
	@Test
	public void login(String Email){
		System.out.println("Inside Login");
		System.out.println(Email);
	}   		
	}		*/
    		
    	//parameter xml file
	/*<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="My suite">
	  <test verbose="2" name="gmail test">
	  <parameter name="Email" value="preetish.bhanja@gmail.com"/>
	    <classes>
	      <class name="testng.TestngParameters"/>
	    </classes>
	  </test> <!-- Default test -->
	</suite> <!-- Default suite -->
	
	o/p-Inside Login
preetish.bhanja@gmail.com
PASSED: login("preetish.bhanja@gmail.com")
	
	Ex2-public class TestngParameters2 {
	private static WebDriver driver;
	@Test
	@Parameters({ "Username", "Password" })
	public void test(String Username, String Password) {
	driver = new FirefoxDriver();
	driver.get("http://gmail.com");
	driver.findElement(By.id("Email")).sendKeys("Username");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("Password");
	driver.findElement(By.id("signIn")).click();
	}
}

parameter2Xml-<suite name="Suite">
<test name="gmail">
<parameter name="Username" value="testuser_1"/>
<parameter name="Password" value="Test@123"/>
<classes>
<class name="testng.TestngParameters2" />
</classes>
</test>
</suite>
*/
//Data Provider
	/*If we have more no of Parameters to read from xml.its not recommended to store
	all the parameters inside an xml file.As the xml increases or grows.its very difficult to handle and maintain to avoid this we will use 
	data provider concept
	data provider is a method where the data will be stored in a method instead of an xml File.
	The return type of DataProvider method is 2Dimensional Array Object.
			When you need to pass complex parameters or parameters that need to be created from Java
			(complex objects, objects read from a property file or a database, etc…), in such cases
			parameters can be passed using Dataproviders. A Data Provider is a method annotated
			with @DataProvider.*/
    		
	/*Ex-public class DATAPRO {
    			@Test(dataProvider = "testdata")
    			
    			public void gmaillogin(String username, String password) {
    					
    			WebDriver driver = new FirefoxDriver();
    					
    			driver.get("http://gmail.com");
    					
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    					
    			driver.findElement(By.id("Email")).sendKeys(username);
    					
    			driver.findElement(By.id("next")).click();
    					
    			driver.findElement(By.id("Passwd")).sendKeys(password);
    					
    				
    			}

    				
    			@DataProvider(name = "testdata")
    				
    			public Object[][] data() {
    					
    			Object[][] obj = new Object[3][2];
    					
    			obj[0][0] = "kalyanseleniumtraining";
    					
    			obj[0][1] = "abcd";

    					
    			obj[1][0] = "chandrika.srinu";
    					
    			obj[1][1] = "xyz";

    					
    			obj[2][0] = "harinathvarma";
    					
    			obj[2][1] = "123";

    				return obj;
    				}
    			}
*/
 //===========================================//   		
   //Group Testing
	/*Ex-
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
    		
    	//	XML File of Grouptest//
       <suite name="Suite">
       <test name="Test">
      <groups>
      <run>
      <include name="sanity"/>
      </run>
       </groups>
       <classes>
      <class name="testNGtest.GroupTest"/>
    </classes>
  </test> 
</suite> 

   Group Ex-2
   ============
    public class GroupTest {
   WebDriver driver=null;
   @Test(groups="regression")
   public void gmailUsername(){
   driver=new FirefoxDriver();
   driver.get("http://gmail.com");
   driver.findElement(By.id("Email")).sendKeys("gudu");
   } 		
    @Test(groups="smoke")
    public void gmailNextButton(){
    driver=new FirefoxDriver();
    driver.get("http://www.google.com");
    driver.findElement(By.name('q')).sendKeys("gudu123");
    }		
    }		
    		
    		Xmlfile 
    		<suite name="suite">
    		<test name="practise grouping">
    		<groups>
    		//<define name="All">
    		//</define>
    		<run>
    		<include name="smoke"/>
    		<include name="regression"/>
    		</run>
    		</groups>
    		<classes>
    		<class name="packagename.classname"/>
    		</classes>
    		</test>
    		</suite>
    		*/
   // Multibrowser Testing
	
	/*In every project it is required to perform multi-browser testing to make sure that the
	functionality is working as expected with every browser to give equal user experience to all of
	the wide range of audience. It takes a considerable time to test everything on every browser and
	when we have used automation to reduce the testing efforts then why don’t we perform the
	multi-browser testing using automation. TestNG gives us functionality to perform same test on
	different browsers in a simple and easy way.*/
    		
	/*Ex-MuLtiBrowser
	public class MultiBrowser{
		 @Parameters("browser")
		 @Test
		 public void Googlecode(String browser){
			 WebDriver driver=null;
			
			 if(browser.equals("firefox")){
				 driver=new FirefoxDriver();
			 }
			 else if(browser.equals("chrome")){
				 System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
				 driver=new ChromeDriver();
			 }
		 driver.navigate().to("http://google.com");
		 driver.findElement(By.name("q")).sendKeys("Adobe Flashplayer");
		 
		 
		 }
		 
		}*/
	
	
	
    	
	/*
	 Steps to perform multi/parallel browser execution
	 create a project ->create a class->create a TestNG .xml-> in the suite name tag after name attribute add another attribute called
	 parallel="tests".when we write parallel="tests" all the test case mentioned in xml will be executed parallelly.
	 //multi xml file
	 suite name="Parallel Execution" parallel="tests">
	   <test name="Chrome Test">
	     <parameter name="browser" value="chrome"> //(passing parameter)
	       </parameter>
	        <classes>
	         <class name="parallelexe.NewTest"/>
	          </classes>
	          </test>
	          <test name="firefox Test">
	       <parameter name="browser" value="firefox">
	     </parameter>
	    <classes>
	  <class name="parallelexe.NewTest"/> 
	  </classes> 
	   </test> 
	 </suite> */
    //=====================================//
	//Parallel Tests using TestNG:		
	/*	If we run testcases one by one.the process will be called as sequential execution.
if we run the test case all at a time.it will called as parallel execution.parallel execution
is always possible in TestNG.to perform parallel execution we should specify the browser name
inside xml file.if we place the browser name in xml file the xml file will be called as 
parameterization
    		*/
    	/*Example-
    	public class ParallelExecution {
    		WebDriver driver=null;
    		@Parameters({"userid","pass"})
    		@Test
    		public void GmailUserName(String data,String pass){
    			driver=new FirefoxDriver();
    			driver.get("http://gmail.com");
    			driver.findElement(By.id("Email")).sendKeys(data);
    		    driver.findElement(By.id("next")).click();
    		    driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(pass);
    		}
    		}*/
//parallel xml file
	/*<suite name="Default suite">
	  <test  name="Verify google Home page">
	  <parameter name="userid" value="preetish88.bhanja@gmail.com">
	  </parameter>
	  <parameter name="pass" value="12345">
	  </parameter>
	    <classes>
	      <class name="testng.ParallelExecution"/>
	    </classes>
	  </test> 
	</suite> */
	
    		/*EX2-public class TestGuru99MultipleSession {
    		    @Test    
    		    public void executSessionOne(){
    		            //First session of WebDriver
    		        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    		            WebDriver driver = new ChromeDriver();
    		            //Goto guru99 site
    		            driver.get("http://demo.guru99.com/V4/");
    		            //find user name text box and fill it
    		            driver.findElement(By.name("uid")).sendKeys("Driver 1");
    		            
    		        }
    		        
    		    @Test    
    		        public void executeSessionTwo(){
    		            //Second session of WebDriver
    		        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    		        WebDriver driver = new ChromeDriver();
    		            //Goto guru99 site
    		        driver.get("http://demo.guru99.com/V4/");
    		        //find user name text box and fill it
    		        driver.findElement(By.name("uid")).sendKeys("Driver 2");
    		        
    		        }
    		        
    		    @Test    
    		        public void executSessionThree(){
    		            //Third session of WebDriver
    		        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    		        WebDriver driver = new ChromeDriver();
    		            //Goto guru99 site
    		        driver.get("http://demo.guru99.com/V4/");
    		        //find user name text box and fill it
    		        driver.findElement(By.name("uid")).sendKeys("Driver 3");
    		        
    		        }        
    		}
    		*/
    		//parallel/multi xml
	/*<suite name="TestSuite" thread-count="3" parallel="methods" >
	<test name="testGuru">
	<classes>
	<class name="TestGuru99MultipleSession">
	</class>
	</classes>
	</test>
	</suite>*/
  //=================================//  		
	//MAVEN TEST CLASS
	/*Build tool is used to setup everything which is required to run your java code independently.
	This can be applied to your entire java project. It generates source code, compiling code,
	packaging code to a jar etc. Maven provides a common platform to perform these activities
	which makes programmer’s life easier while handling huge project.
	Maven provides pom.xml which is the core to any project. This is the configuration file where all
	required information’s are kept. Many of the IDEs (Integrated Development Environments) are
	available which makes it easy to use.*/
/*	package mavenproject.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class Gmail {
	  @Test
	  public void launchapp() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.gmail.com");
	  driver.findElement(By.id("Email")).sendKeys("shibashaktidas@gmail.com");
	  driver.findElement(By.id("next")).click();
	  Thread.Sleep(3000);
	  //driver.findElement(By.id("Passwd")).sendKeys("abcd");
	  
	  
	  }
	}*/
	/*
    	maven pom.xml
    	just Before </project> tag create a tag like
<dependencies>
//Here you can add n number of dependencies
</ dependencies>

Apart from this adding dependency Maven provides another option called plugin. Plugin's are
used to enhance the features of Maven.
For example you can add Add'on to run TestNG tests from POM.xml using maven surefire
plugin
Steps to Run TestNG from Pom.xml
Step1: Create a maven projects
Step2: Create a package inside src/main/java inside the projects
Step3: Create a testng class inside the package
Step4: Generate TestNg.xml using convert to TestNG option
(All these steps discussed in the testng section)
Step5: Open POM.xml file
Step6:Create a tag called <build><</build>
Step7: Create another tag like <plugins></plugins>
Step8: paste the below code inside plugins tag
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>2.19.1</version>
<configuration>
<suiteXmlFiles>
<suiteXmlFile>testng.xml</suiteXmlFile>
</suiteXmlFiles>
</configuration>
</plugin>
Step9: Add dependency as
<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>6.9.8</version>
<scope>test</scope>
</dependency>
Finally the POM.xml will looks like
    	==============
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    	   <modelVersion>4.0.0</modelVersion>
    	         <groupId>mavenpackage.com</groupId>
    	           <artifactId>mavenproject.com</artifactId>
    	             <version>0.0.1-SNAPSHOT</version>
    	                <dependencies>
    	                <dependency>
    	         <groupId>org.testng</groupId>
    	         <artifactId>testng</artifactId>
    	     <version>6.9.9</version>
    	    </dependency>
    	    <dependency>
    	    <groupId>org.seleniumhq.selenium</groupId>
    	    <artifactId>selenium-java</artifactId>
    	    <version>2.53.1</version>
    	   </dependency>
    	   </dependencies>
    	   <build>
    	        
    	        
    	        <plugins>
    	           
    	            <plugin>
    	                <groupId>org.apache.maven.plugins</groupId>
    	                <artifactId>maven-surefire-plugin</artifactId>
    	                <version>2.19.1</version>
    	                <configuration>
    	                    
    	                    <suiteXmlFiles>
    	                        <suiteXmlFile>testng.xml</suiteXmlFile>
    	                        
    	                    </suiteXmlFiles>
    	                </configuration>
    	            </plugin>
    	            </plugins>
    	            </build>
    	</project>*/
    		
    		
    		/*xml
    		====
    		<?xml version="1.0" encoding="UTF-8"?>
    		<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
    		<suite name="Suite">
    		  <test name="Test">
    		    <classes>
    		      <class name="mavenproject.com.Gmail"/>
    		    </classes>
    		  </test> <!-- Test -->
    		</suite> <!-- Suite -->*/
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
















































































}
}