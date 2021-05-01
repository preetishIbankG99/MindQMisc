package abstractpackage;

public class JavaMainOverloading {
//JVM Will consider main method having sting array as arguments and having public static void
	public static void main(String[] args) {
		System.out.println("This Is Method1");
		main("NaveenLabs");
		main(10);
		main(10,20);

	}

	public static void main(String args) {
		System.out.println("This Is Method2");

	}
	public static void main(int a) {
		System.out.println("This Is Method3");

	}
	public static void main(int a,int b) {
		System.out.println("This Is Method4");

	}




}
