package package1;

public class MethodOverriding1 extends MethodOverriding {
	public  void myMethod(){
		System.out.println("Hello Saroj");
		}

	public static void main(String[] args) {
		MethodOverriding1 obj2=new MethodOverriding1();
		obj2.myMethod();
		
		/*MethodOverriding obj1=new MethodOverriding ();
		obj1.myMethod(); //by using parent class obj i can use the property of parent class through child class
*/

	}

}
