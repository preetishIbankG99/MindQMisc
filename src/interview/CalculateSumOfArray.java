
package interview;

public class CalculateSumOfArray {
	public int calculateSumofNumbers(){
		int a[]={10,20,30,40};
		int sum=0;
		for(int arr:a){
			
		sum=sum+arr;
		
		}
		return sum;
		
	}

	public static void main(String[] args) {
		CalculateSumOfArray cal=new CalculateSumOfArray();
		System.out.print("Sum of Array:"+cal.calculateSumofNumbers());

	}

}
