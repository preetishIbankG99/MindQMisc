package interview;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {

	public static void main(String[] args) {
	   Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "gudu");
		map.put(2, "benu");
		map.put(3, "juju");
		map.put(4, "guru");
		
		
		//map.remove(4);
		for(Map.Entry m:map.entrySet()){
		
		 System.out.println(m.getKey()+" "+m.getValue());
		
		}
//or
	System.out.println("Map Elements");
		System.out.println("\t"+map);
		
		
	}

}
