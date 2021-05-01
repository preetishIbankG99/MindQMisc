package mergemultipledatadriven;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeMultiDataProvider {
	
	
	
	//Calling both DataProviders at a Time But it will only consider dt1 values and put dt2 values null 
	//@Test(dataProvider="dataProviderTwo")
	@Test(dataProvider="mergeDataProvider")
	public void usingTwoDataProviders(HashMap<String,String>data) {
		System.out.println("FirstName is::::"+data.get("FirstName"));
		System.out.println("LaststName is::::"+data.get("LastName"));
		System.out.println("Location is::::"+data.get("Location"));
		System.out.println("Emailid is::::"+data.get("Emailid"));
		System.out.println("Company is::::"+data.get("Company"));
		System.out.println("ContactNumber is::::"+data.get("MobileNumber"));
	}
	@DataProvider(name="mergeDataProvider")
	public static Object[][]mergeDataProvider(){
		HashMap<String,String>dp3=new HashMap<String,String>();
		dp3.putAll((HashMap<String,String>)dataProviderOne()[0][0]);
		dp3.putAll((HashMap<String,String>)dataProviderTwo()[0][0]);
		Object[][]o=new Object[1][];
		o[0]=new Object[] {dp3};
		return o;
	}
	
	
@DataProvider(name="dataProviderOne")
public static Object[][]dataProviderOne(){
	Object[][]o=new Object[1][];
	HashMap<String,String>dp1=new HashMap<String,String>();
	dp1.put("FirstName", "Preetish");
	dp1.put("LastName", "Bhanajdeo");
	dp1.put("Location", "Marathalli");
	o[0]=new Object[] {dp1};
	return o;
}

@DataProvider(name="dataProviderTwo")
public static Object[][]dataProviderTwo(){
	Object[][]o=new Object[1][];
	HashMap<String,String>dp2=new HashMap<String,String>();
	dp2.put("Emailid", "Preetish.bhanja@gmail.com");
	dp2.put("MobileNumber", "9938557038");
	dp2.put("Company", "Microsoft");
	o[0]=new Object[] {dp2};
	return o;
}






}
