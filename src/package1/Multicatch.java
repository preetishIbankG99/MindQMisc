package package1;

public class Multicatch {

	public static void main(String[] args) {
		try{
			int a[]=new int[5];
			a[8]=20;
			
		}

	catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
	}
	}
	}
