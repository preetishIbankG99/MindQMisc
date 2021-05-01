package abstractpackage;

public class RBI {
public static void main(String[] args) {
	BANK b;
	b=new SBI();
System.out.println("Rate OF Interest is:"+b.getRateOfInterest()+"%");
b=new AXIS();
System.out.println("Rate OF Interest is:"+b.getRateOfInterest()+"");
}
}
//o/p=Rate OF Interest is:8%
//    Rate OF Interest is:6