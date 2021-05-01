package becomegeniusinxpath;

public class XpathGenius {
	//PONTEM like jira

		//Become GENIUS in XPATH//
		
		//for text xpath
		//text is a function
	////a[text()='Customers']
		
		//contains is a function
		//a[contains(text(),'Features')]
		
		//for button signup
		//button[contains(text(),'Sign Up')]
		
		//customize xpath if dupliates found to make it genuine
	//div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle'and@id='dropdownMenuButton']

	//find xpath of paticular checkbox
		//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']

	//Dynamic Xpath
		//suppose previous class= xyz_123 now its changes to class=xyz_456
	//so to over come we take tha static part which is not changing	
	//driver.findElement(By.xpath("//input[contains(@class,'xyz_')]"))

		//suppose your first part is not changing ex=id=text_123,text_456
		
		//driver.findElement(By.xpath("//input[starts-with(@class,'xyz_')]"))
		
		// suppose your last part is not changing ex-id=123_text_,id=456_text_
		
		//driver.findElement(By.xpath("//input[starts-with(@class,'xyz_')]"))

}
