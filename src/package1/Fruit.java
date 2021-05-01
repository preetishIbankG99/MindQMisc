package package1;

public class Fruit {

String name;//fields in the class

String color;//fields in class
	public void display() {  //method declaration
	System.out.println("Name of fruit:" +name);
	System.out.println("Color of fruit:" +color);
}
public static void main(String[] args) {
	Fruit f=new Fruit();//created object and access the fields of method
f.name="Mango";
f.color="Yellow";
f.display();
}
}


	



