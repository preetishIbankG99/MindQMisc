package package1;

public class ClassI implements Interface1, Interface2 {

	public void brake(){
		System.out.println("4 gears");
	}
		

	

	
	public void engine() {
		System.out.println("Bikes have engine");
		
	}

	
	public void gears() {
		System.out.println("Bikes have gears");
		
	}
	public void handle() {
		System.out.println("Bikes have handle");
		
	}

	
	public void seat() {
System.out.println("Bikes have seat");		
		
	}
	public static void main(String[] args) {
		ClassI obj=new ClassI();
		obj.engine();
		obj.gears();
		obj.handle();
		obj.seat();
		obj.brake();
}
}