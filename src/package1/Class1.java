package package1;

public class Class1 {
	static int x=10,y=20;//Declaring Static variables
	int a=30,b=40;//Declaring Nonstatic Variables
	
	public static int add(){
		int result=x+y;
		return result;//by using Static Method
	}
	
	public void  multiply(){
		System.out.println(a*b);
		
	}
	public void display(){
		System.out.println("hiiiiiiiii");
	}
	
	
	
	
	
	public static void main(String[] args) {
		Class1 obj=new Class1();
		Class1.add();
		obj.multiply();
		obj.display();

	}

}
