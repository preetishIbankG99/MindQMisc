package abstractpackage;

public class Recursion {
String name;
int rollno;
Recursion(String name,int rollno){
	this.name=name;
	this.rollno=rollno;
	
	
}
void display(){
System.out.println("Name is " + name  +  "   Roll no is "+rollno );
	
}
public static void main (String[]args){
	Recursion r=new Recursion("preetish", 1);
	r.display();
}

}