package innerclass;

public class NestedInterWithinClass {
interface Message{
	void mssg();
}
}
class TestNestedInterface2 implements NestedInterWithinClass.Message{

	
	public void mssg() {
		System.out.println("hiii bhaskar");
		
	}
	public static void main(String[] args) {
		NestedInterWithinClass.Message message=new TestNestedInterface2();//Upcasting
		message.mssg();
	}
}


















