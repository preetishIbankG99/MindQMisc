package collection;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {
static WebDriver driver;
public static void main(String[]args) throws InterruptedException{
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://demo.automationtesting.in/Windows.html");
System.out.println("Title of Main Window: "+driver.getTitle());
WebElement tabbedwindowbutton=driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
tabbedwindowbutton.click();
Thread.sleep(3000);
Set<String>WindowsIds=driver.getWindowHandles();
Iterator<String>itr=WindowsIds.iterator();
String mainwindow=itr.next();
System.out.println("Parent Windows id "+mainwindow);
String childwindow=itr.next();
System.out.println("Child Windows id "+childwindow);
driver.switchTo().window(childwindow);
Thread.sleep(3000);
System.out.println("Title of Child Window: "+driver.getTitle());
driver.close();
driver.switchTo().window(mainwindow);
Thread.sleep(3000);
System.out.println("Title of Parent Window: "+driver.getTitle());
}
}