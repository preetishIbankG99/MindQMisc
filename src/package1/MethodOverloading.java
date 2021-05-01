package package1;

public class MethodOverloading {
	public void add(int a,int b){
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c){
		System.out.println(a+b+c);
	}

	public void add(double a,double b){
		System.out.println(a+b);
	}
	
	public void add(double a,double b,double c){
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		       //integer type
				obj.add(10, 20);
				obj.add(10, 20, 30);

				//double type
				obj.add(1.123, 2.345);
				obj.add(1.123, 2.345, 3.456);
	}

}
