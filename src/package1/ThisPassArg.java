package package1;
//EventHandling
public class ThisPassArg {
void m(ThisPassArg obj){
	System.out.println("method invoked");
}
void n(){
	m(this);//used to reuse one object in many method
}
public static void main(String[] args) {
	ThisPassArg t=new ThisPassArg();
	t.n();
}
}
