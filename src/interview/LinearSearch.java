package interview;
//Linear search
/*Step 1: Traverse the array
Step 2: Match the key element with array element
Step 3: If key element is found, return the index position of the array element
Step 4: If key element is not found, return -1*/
public class LinearSearch {
	public static int linearSearch(int[]a,int key){
		for(int i=0;i<a.length;i++){
			if(a[i]==key){
				return i;
			}
		}
		
		
		
		
		return -1;
		
	}
	public static void main(String[] args) {
		int []a1={10,20,30,40,50,60,70};
		
		int key=50;	
		System.out.println(key+" is found at index: "+linearSearch(a1, key));  
	}

}
