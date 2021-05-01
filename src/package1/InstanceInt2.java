package package1;

public class InstanceInt2 {
int x;
InstanceInt2(){
	System.out.println("Number is x");
}
//instance initialization block is created
{
System.out.println("Instance initialization Block is Invoked");
}
public static void main(String[] args) {
	InstanceInt2 i=new InstanceInt2();
	InstanceInt2 j=new InstanceInt2();
	
}
}
//o/p:Instance initialization Block is Invoked
//Number is x

//Instance initialization Block is Invoked
//Number is x
