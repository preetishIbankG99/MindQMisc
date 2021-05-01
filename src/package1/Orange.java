package package1;

public class Orange extends Fruit1 {
String color="Yellow";
public void display(){
	System.out.println(super.color);
}
	public static void main(String[] args) {
		Orange obj=new Orange();
		obj.display();//o/p Yellow using without super
		//after using super keyword o/p is green
		//Super is used to refer variable,methods from immediate parent class
//super() is used to invoke immediate parent class constructor
		//super is use to invoke immediate parent class method
	}

}
