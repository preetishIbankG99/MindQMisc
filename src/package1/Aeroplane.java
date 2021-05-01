package package1;

public class Aeroplane extends AbstractExamble {

	void fly() {
	
		System.out.println("Aeroplane is flying");
	}
	public static void main(String[] args) {
		AbstractExamble obj=new Aeroplane();
	obj.fly();
	}
}