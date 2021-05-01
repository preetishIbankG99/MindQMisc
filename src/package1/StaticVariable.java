package package1;

public class StaticVariable {
int id;
String name;
static String college="PIET";//using of static variable
//using parameterized constructor//
StaticVariable(int i,String n){
	id=i;
	name=n;
	}
void display(){
	System.out.println(id+" "+name+" "+college);
}

public static void main(String[] args) {
StaticVariable s1=new StaticVariable(111,"KALYAN");//creating object after main method
StaticVariable s2=new StaticVariable(112,"ANANTHRAJ");
StaticVariable s3=new StaticVariable(113,"GANESH");
s1.display();
s2.display();
s3.display();
	
	
	
	
	
	
	
	

	}

}
