package datadriven;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {
	
		 
		public static void main(String[] args) throws InterruptedException {
		   WebDriver d=new FirefoxDriver();
		   d.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		   d.get("http://www.popuptest.com/popuptest2.html");
		 
		   Set s=d.getWindowHandles(); //s holds the set of all browser windows
		   Iterator iter=s.iterator();
		   String maintab=(String) iter.next();//maintab holds the 1st browser window
		   String childtab=(String) iter.next();//childtab holds the next browser window
		 
		   d.switchTo().window(childtab); //move to child browser window
		   System.out.println(childtab + d.getTitle());
		        d.close();
		   d.switchTo().window(maintab); //move to parent browser window
		   System.out.println(maintab+d.getTitle());
		        d.close();
		   //if a driver opens more than one browser windows, then we can loop to 
		   //move each of the window and perform some actions
		   /*while(iter.hasNext())
		    {
		        System.out.println(iter.next());
		    }*/
		   }
		}

