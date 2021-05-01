package package1;

public abstract class Bike {

public void engine(){
System.out.println("bikes have engine");
}
	public void gears(){
	System.out.println("bikes have gears");
	}

public abstract void handle();
public abstract void wheels();
public static void main(String[] args) {
	

//Bike objb=new Bike();//cannot initiate  object bike into abstract class
HeroHonda obj=new HeroHonda();// in abstract class creating object and calling child class
obj.handle();
obj.wheels();

}

}
