package interview;

public class ExceptionInterView {
	
	void A() {
		try {
		B();
		}
		catch(ArithmeticException e){
			System.out.println("Handled");
		}
		}
void B() {
	C();
}
	void C() {
		//Here Exceptions Occurs
		int x=10/0;
	}
	public static void main(String[] args) {
		ExceptionInterView o=new ExceptionInterView();
		o.A();

	}

}
