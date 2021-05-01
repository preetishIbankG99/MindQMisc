package package1;

public  class HeroHonda extends Bike {

	public void handle() {
		
		System.out.println("bikes have handle");
	}

	
	public void wheels() {
		
		System.out.println("bikes have wheels");
		
	}

	public static void main(String[] args) {
		HeroHonda objHH=new HeroHonda();
		objHH.engine();
		objHH.gears();
		objHH.handle();
		objHH.wheels();
		
		
		
	}
}