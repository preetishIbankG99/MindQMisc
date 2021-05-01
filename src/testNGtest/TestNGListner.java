package testNGtest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner  implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test case Finish and TestCase Details are:"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Test Case Started and TestCase Details are:"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Case FailedButwithinSuccess and TestCase Details are:"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
    System.out.println("Test Case Failed and TestCase Details are:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test Case Skipped and TestCase Details are:"+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test Case Started and TestCase Details are:"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
    System.out.println("Test Case Success and TestCase Details are:"+result.getName());
		
	}

}
