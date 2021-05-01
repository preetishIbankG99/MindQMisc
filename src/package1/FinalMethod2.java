package package1;
//If you make any method as final, you cannot override it.
public class FinalMethod2 extends FinalMethod1 {

	/*void run(){  //Compile time error cannot override final method
		System.out.println("please follow me");
	}*/
	
	public static void main(String[] args) {
	FinalMethod2 m=new FinalMethod2();
	m.run();
}
}

