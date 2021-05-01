package interview;

public class MultiplicationTableJava {

	public static void main(String[] args) {
		int a[][]=new int[20][10];
		for(int i=1;i<=20;i++){
			for(int j=1;j<=10;j++){
		a[i-1][j-1]=i*j	;
		System.out.println("  "+a[i-1][j-1]);
		}
		System.out.println();

		}
	}

}
