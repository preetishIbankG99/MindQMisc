package interview;

public class FINDTHIRDLARGES {
	public static int getthirdLargest(int[]a,int total) {
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
return a[total-3];
}
public static void main(String[] args) {
int []a= {11,44,22,76,88,45};
int[]b= {43,65,21,56,77,16,63};
System.out.println("ThirdLargest :"+getthirdLargest(a,6));
System.out.println("ThirdLargest :"+getthirdLargest(b,7));
}

}
