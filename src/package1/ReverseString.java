package package1;

public class ReverseString {
	public static void main(String[] args) {
		String str="KAHO NAA PYAAR HAI";
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println("Before reverse:"+str );
		System.out.println("After reverse:"+reverse);
	}
}
