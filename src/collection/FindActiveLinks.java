package collection;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindActiveLinks {
	static WebDriver driver;
	public static void main(String[] args) {
	driver=new FirefoxDriver();
	driver.get("http://www.google.co.in");
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("Total links"+links.size());
	for(int i=0;i<links.size();i++){
		WebElement ele=links.get(i);
		String url=ele.getAttribute("href");
		verifylinkactive(url);
	}


	}
	private static void verifylinkactive(String linkUrl) 
	{
	try{
		URL url=new URL(linkUrl);
		HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
		httpURLConnect.setConnectTimeout(3000);
		httpURLConnect.connect();
		if(httpURLConnect.getResponseCode()==200){
			System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() );
			
		}

	if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() +" - "+HttpURLConnection.HTTP_NOT_FOUND);
	}

	}
		catch(Exception e){
			
		}
	}

}
