package abstractpackage;

public class Testit {
public static void main(String[] args) {
	Parent p=new Parent();
	Parent.methodone();
	Child c=new Child();
	Child.methodone();
	Parent p1=new Child();
	Parent.methodone();


}
}
