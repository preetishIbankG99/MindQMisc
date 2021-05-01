package retryfailedtesttorunagain;

import org.testng.Assert;
import org.testng.annotations.Test;
//int counter=0;
//int retryLimit=3;
//though we declare to execute it 3 times after that it will fail for Test1()
//For Test2 method we havenot implemented retryAnalyzer so it will execute only once
//it is not a good approach bcoz suppose we have 100 Test cases in every method we have to delcare
//retryAnalyzer
public class MyTest {
@Test
//to run it in xml at runtime i comment this at class level
//(retryAnalyzer=retryanalyzer.RetryAnalyzer.class)
public void Test1() {
	Assert.assertEquals(false, true);
}

//@Test(retryAnalyzer=retryanalyzer.RetryAnalyzer.class)
@Test
public void Test2() {
	Assert.assertEquals(false, true);
}

@Test
public void Test3() {
	Assert.assertEquals(true, true);
}

}
