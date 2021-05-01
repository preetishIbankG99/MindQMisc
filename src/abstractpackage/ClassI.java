package abstractpackage;



public class ClassI implements Printable,Showable {
	public void methodone()
	{
	System.out.println("I a method one without arguement");	
	}
	public void methodone(int i) {
		//System.out.println("I a method one with arguement");
		System.out.println("I a method one with arguement"+i);
	}
public static void main(String[] args) {
	ClassI i=new ClassI();
	i.methodone();
	i.methodone(10);
}
}

