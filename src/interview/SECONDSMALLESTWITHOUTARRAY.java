package interview;

public class SECONDSMALLESTWITHOUTARRAY {
	public static int getsecondSmallest(int[]a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
		for(int j=i+1;j<total;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
		}
		return a[1];
		}
	public static void main(String[] args) {
		
int []a= {1,2,3,4,5,6};
int []b= {7,8,9,10,11,12,13};
System.out.println("SECOND SMALLEST :"+getsecondSmallest(a,6));
System.out.println("SECOND SMALLEST :"+getsecondSmallest(b,7));
	}


}
