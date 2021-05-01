package interview;

import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String[] str={"java","jsp","php","dotnet","jsp","java"};
		
		HashSet<String>set=new HashSet<String>();
for(String dup:str){
	if(!set.add(dup)){
		System.out.println("duplicate element is :- "+dup);
		
		
		//or with out builtin
		/*for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }*/
		
		
}
	
}
		
		
	}

}
