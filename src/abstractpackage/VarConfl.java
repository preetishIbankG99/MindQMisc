package abstractpackage;

public class VarConfl implements InterA,InterB  {
	public static void main(String[] args) {
		
		//System.out.println(x);
		System.out.println(InterA.x);
		System.out.println(InterB.x);
	}

}
