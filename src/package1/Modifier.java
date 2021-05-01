package package1;

public class Modifier {

	public static void main(String[] args) {
		AcessModifiers a=new AcessModifiers();
	//	System.out.println(a.data);//compile time error  AcessModifiers is not visible(private)
//a.mssg();//compile time error  AcessModifiers is not visible(private)
	}

}
