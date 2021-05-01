package interview;

import java.util.HashMap;
import java.util.Map;

public class HAshMapExamlpe {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "gudu");
		map.put(2, "sudu");
		map.put(3, "rudu");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		/*o/p-
		1 gudu
		2 sudu
		3 rudu*/
		
		
		}
	
	//System.out.println("\t"+map);
	//{1=gudu, 2=sudu, 3=rudu}
	
	
	}

}
