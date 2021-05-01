package json;

import org.json.simple.JSONObject;

public class Json1 {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "preetish");
		obj.put("age", new Integer(27));
		
		obj.put("salary", new Double(50000));
		System.out.println(obj);
		//Json array
//		JSONArray arr = new JSONArray();  
//		  arr.add("sonoo");    
//		  arr.add(new Integer(27));    
//		  arr.add(new Double(600000));   
//		  System.out.print(arr);  

	}

}
