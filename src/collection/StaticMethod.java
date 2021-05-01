package collection;

public class StaticMethod {
	int rollno;
	String name;
	static String college="PIET";
	static void change(){
		college="MINDQ";
	}
	StaticMethod(int r,String n){
		rollno=r;
		name=n;
	}
	void display (){
		System.out.println(rollno+" "+name+" "+college);
		} 
	public static void main(String[] args) {
		StaticMethod.change();
		StaticMethod s1=new StaticMethod(111,"kalyan");
		StaticMethod s2=new StaticMethod(112,"ganesh");

		 s1.display();  
		    s2.display();  
		    
		
	}

}
