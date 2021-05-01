package innerclass;

public class JavaMemberInner {
private int data=100;
class Inner{
	void display(){
		System.out.println("data is:"+data);
	}
}
public static void main(String[] args) {
	JavaMemberInner jm=new JavaMemberInner();
	JavaMemberInner.Inner ji=jm.new Inner();
ji.display();
}
}
