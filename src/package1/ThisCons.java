package package1;

public class ThisCons {
ThisCons(){
	System.out.println("hello Default This Constructor");
}
ThisCons(int x){
	this();//calling default constructor from parameterized constructor
System.out.println(x);
}
}
