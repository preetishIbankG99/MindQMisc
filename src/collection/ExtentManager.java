package collection;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = "./extentreport.html";
	
	
	public static ExtentReports GetExtent(){
		if (extent!= null)
                    return extent; //avoid creating new instance of html file
                extent = new ExtentReports();		
		extent.attachReporter(getHtmlReporter());
		return extent;
	}
 
	private static ExtentHtmlReporter getHtmlReporter() {
        htmlReporter = new ExtentHtmlReporter(filePath);
        htmlReporter.loadXMLConfig("./config.xml");
        return htmlReporter;
}
	
	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		return test;
	
	}
	
}
