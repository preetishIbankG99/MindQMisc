package interview;

public class DivisorBy3515 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
		if(i%3==0 && i%5==0) {
			System.out.println(i+"fizzbuzz");
		
		}
		
		if(i%3==0&&i%5!=0 ) {
			System.out.println(i+"fizz ");
		}
		
		if(i%5==0&&i%3!=0 ) {
			System.out.println(i+"buzz ");
		}
		}
        
	}
	
	}

	


