package interview;

public class ExceptionPropagationExample {
	
	void m() {
		int data=50/0;
		
	}
	void n() {
		m();
	}
	
	void p() {
		try {
			n();
		}
	catch(Exception e) {
		
	System.out.println("Exception Handled");
		
	}
	}

	public static void main(String[] args) {
		ExceptionPropagationExample epe=new ExceptionPropagationExample();
		epe.p();
		System.out.println("Normal Flow Occurs");

	}

}
