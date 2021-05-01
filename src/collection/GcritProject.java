package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GcritProject {
	static WebDriver driver;
	@BeforeTest()
		public void formlogincredentials() throws InterruptedException{
		 driver=new FirefoxDriver();
		
		 driver.manage().window().maximize();
		 
		 
		driver.navigate().to("http://www.gcrit.com/build3/create_account.php");
		System.out.println("Url successfully lanunched");
	}
		
		@Test()
			
		public void inputdata() throws InterruptedException{
			
		
		WebElement Radiobutton=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		Radiobutton.click(); 
		System.out.println("Radiobutton is clicked");
		WebElement firstname=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[2]/input"));
		firstname.sendKeys("preetish");
		System.out.println("Name selected");
		WebElement lastname=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[3]/td[2]/input"));
		lastname.sendKeys("bhanjadeo");
	    System.out.println("Password selected");
	WebElement Dob=driver.findElement(By.xpath(".//*[@id='dob']"));
	Dob.click();

	WebElement Dob1=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[6]/td[1]/a"));
	Dob1.click();
	System.out.println("Date of birth Selected");
	WebElement Email=driver.findElement(By.name("email_address"));
	Email.sendKeys("preetishabc.bhanja@gmail.com");
	System.out.println("email selected ");
	WebElement company=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[3]/table/tbody/tr/td[2]/input"));
	company.sendKeys("piet");
	System.out.println("company selected");
	WebElement streetaddress=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[1]/td[2]/input"));
	streetaddress.sendKeys("bangalore munnekolala");
	System.out.println("streetaddress selected");
	WebElement suburb=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[2]/td[2]/input"));
	suburb.sendKeys("marathahalli");
	System.out.println("suburb Selected");
	WebElement postalcode=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[3]/td[2]/input"));
	postalcode.sendKeys("769015");
	System.out.println("postalcode Selected");
	WebElement City=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[4]/td[2]/input"));
	City.sendKeys("Bangalore");
	System.out.println("City Selected");
	WebElement State=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[5]/td[2]/input"));
	State.sendKeys("Karnatak");
	System.out.println("State selected");
	WebElement Country=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select"));
	Thread.sleep(2000);
	Select select=new Select(Country);
	select.selectByValue("99");
	System.out.println("Country Selected");
	WebElement Telephone=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[1]/td[2]/input"));
	Telephone.sendKeys("0123456789");
	System.out.println("Telephone Selected");

	WebElement Faxno=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[2]/td[2]/input"));
	Faxno.sendKeys("54321");
	System.out.println("Faxno Selected");
	WebElement Password=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input"));
	Password.sendKeys("123456");
	System.out.println("Password Selected");
	WebElement Password1=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[2]/td[2]/input"));
	Password1.sendKeys("123456");
	System.out.println("password selection confirmed");
	Thread.sleep(4000);
	WebElement Continue=driver.findElement(By.xpath(".//*[@id='tdb4']"));
	Continue.click();
	WebElement Continue1=driver.findElement(By.xpath(".//*[@id='tdb5']/span[2]"));
	Continue1.click();
	System.out.println("continue to shopping page");
	 WebElement Shop=driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[2]/table/tbody/tr[2]/td[3]/a[1]/img"));
	 Shop.click();
	 System.out.println("Select product");
	 WebElement addcart=driver.findElement(By.id("tdb5"));
	 addcart.click();
	 System.out.println("product added to cart");
	 WebElement checkout=driver.findElement(By.xpath(".//*[@id='tdb6']/span[2]"));
	 checkout.click();
	 System.out.println("Checkout successful");
	}
		@AfterMethod()
			public void Logout(){
			driver.close();
		}
		
}
