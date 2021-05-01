package interview;

public class LargestSmallestFromUnsortedArray {

	public static void main(String[] args) {
	int a[]=new int[]{12,76,54,92,21,-12};
	int max=a[0];
    int min=a[0];
    for(int i=1;i<a.length;i++){
    	if(a[i]>max){
    		max=a[i];
    	}
    	else if(a[i]<min){
    		min=a[i];
    	}
    }
    System.out.println("Largest number : " + max);
    System.out.println("Smallest number : " + min);
    System.out.println(" "+min*max);	
	}

}
 