package interview;

public class ReplaceStringUsingBuiltIn {

	public static void main(String[] args) {
		String s="preetish kumar";
System.out.println(new StringBuffer(s.substring(9,14)).toString()+" ".concat(s.substring(0,8)));
		


	}

}
