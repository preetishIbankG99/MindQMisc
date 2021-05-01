package innerclass;

public class TestNestedInterface implements NestedInterface1 .Message {

	
	public void mssg() {
		System.out.println("Hello NestedInterface");
		
	}
public static void main(String[] args) {
	NestedInterface1.Message message=new TestNestedInterface();
	message.mssg();
}
	
	
		
	}


