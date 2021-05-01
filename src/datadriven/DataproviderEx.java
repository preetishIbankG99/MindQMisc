package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderEx {
@Test(dataProvider="testdata")
public void facebookcredentials(String emailid,String password,String firstname,String surname,String mobilenumber){
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("email")).sendKeys(emailid);
driver.findElement(By.id("pass")).sendKeys(password);
driver.findElement(By.id("u_0_4")).sendKeys(firstname);
driver.findElement(By.id("u_0_6")).sendKeys(surname);
driver.findElement(By.id("u_0_9")).sendKeys(mobilenumber);
}
@DataProvider(name="testdata")
public Object[][]data(){
	Object[][] obj=new Object[3][5];
	obj[0][0]="preetish";
	obj[0][1]="bhanja";
	obj[0][2]="preetishkumar";
	obj[0][3]="bhanjadeo";
	obj[0][4]="9938456790";
    
	obj[1][0]="preetish1";
	obj[1][1]="bhanja1";
	obj[1][2]="preetishkumar1";
	obj[1][3]="bhanjadeo1";
	obj[1][4]="9938456791";
	
	obj[2][0]="preetish2";
	obj[2][1]="bhanja2";
	obj[2][2]="preetishkumar2";
	obj[2][3]="bhanjadeo2";
	obj[2][4]="9938456792";
	return obj;
	
}
}
