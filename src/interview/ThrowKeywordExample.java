package interview;

public class ThrowKeywordExample {

	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not valid");
			
		}
		else {
			System.out.println("::::Welcome to Voting::::");
		}
	
	
	}
	
	public static void main(String[] args) {
		validate(12);
		/*Exception in thread "main" java.lang.ArithmeticException: not valid
		at interview.ThrowKeywordExample.validate(ThrowKeywordExample.java:7)
		at interview.ThrowKeywordExample.main(ThrowKeywordExample.java:18)
*/
	//validate(21)
//::::Welcome to Voting::::
		
	}

}
