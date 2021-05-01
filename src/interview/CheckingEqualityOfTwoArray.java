package interview;

import java.util.Arrays;

public class CheckingEqualityOfTwoArray {

	public static void main(String[] args) {
		int[]arr1={10,15,20,25};
		int[]arr2={10,15,20,25};
		boolean equalornot=true;
		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					equalornot=false;
}
}

}
else{
			equalornot = false;
		}
		System.out.println("Input Arrays :");
        
        System.out.println("First Array : "+Arrays.toString(arr1));
         
        System.out.println("Second Array : "+Arrays.toString(arr2));
         
        if (equalornot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
	
	}
}