package package1;

public class ConditionalLoop2 {

	public static void main(String[] args) {
	int a=50000;// input values a=10,50,100,1000 etc
	if((a>=1)&&(a<=100)){
		System.out.println("A is a small Number");
	}
	else	if((a>100)&&(a<=1000)){
		System.out.println("A is a medium Number");
	}
	else if ((a>1000)&&(a<=10000)){
		System.out.println("A is a Big Number");
}
	else{
		System.out.println("A is a Large Number");
}
}
}