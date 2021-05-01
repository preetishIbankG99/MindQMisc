package package1;

public class INTAB implements IntA,IntB {

	

	
	public void show() {
	
	System.out.println("It has to be show");	
	}

	
	public void print() {
	
		System.out.println("It has to be print");
	}
public static void main(String[] args) {
	INTAB ab=new INTAB();
	ab.print();
	ab.show();
}
}
