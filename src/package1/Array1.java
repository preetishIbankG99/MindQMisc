package package1;

public class Array1 {

	public static void main(String[] args) {
	 int [] a = new int[5];//creating array and defining size
	 a[0]=10;
	 a[1]=20;
	 a[2]=30;
	 a[3]=40;
	 a[4]=50;
	// a[4]=1.456 syntax error type mismatch
    // a[3]="uft" syntax error type mismatch
	 //only similar type of data it will take
	 
System.out.println(a[2]);//30
System.out.println(a[3]+a[4]);//90
	}

}
