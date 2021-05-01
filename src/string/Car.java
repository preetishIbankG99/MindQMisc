package string;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Car{
public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("http://apsrtconline.in/oprs-web/");
driver.manage().window().maximize();
WebElement calender=driver.findElement(By.xpath(".//*[@id='txtJourneyDate']"));
calender.click();
while(true){
	WebElement month=driver.findElement(By.className("ui-datepicker-group ui-datepicker-group-last"));
if(month.equals("June")){
	break;
}
else{
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]")).click();
}
}
List<WebElement> Rows=driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[2]/tbody/tr"));
for (int i = 1; i <= Rows.size(); i++){
	List<WebElement> Cols = driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[2]/tbody/tr["+i+"]/td"));
	for(int j=1; j<=Cols.size();j++){
		WebElement ele = driver.findElement(By.xpath("(.//*[@class='ui-datepicker-calendar'])[2]/tbody/tr["+i+"]/td["+ j +"]"));
		String eleValue = ele.getText();
		if (eleValue.equals("21")) {
			ele.click();
	}
}
}
}
}




	
	


	
	
	




	



