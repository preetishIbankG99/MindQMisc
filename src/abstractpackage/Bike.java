package abstractpackage;

abstract class Bike {
Bike(){
	System.out.println("Bike is created");
}
	abstract void run();
	void changegear(){
		System.out.println("Gear changed");
	}
}
