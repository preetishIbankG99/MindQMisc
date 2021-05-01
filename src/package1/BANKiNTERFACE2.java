package package1;

public class BANKiNTERFACE2 {

	public static void main(String[] args) {
		
		Bank1 b=new PNB1();
		System.out.println("ROI:"+b.rateofinterest());
		Bank1 b1=new SBI1();
		System.out.println("ROI:"+b1.rateofinterest());

	}

}
