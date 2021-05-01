package string;

public class ReverseEachwordAndCapitalizeFirst {
public static void main(String[] args) {
	String str="hello gudu whatss up";
	String[] split=str.split("\\s");
	for(String s:split){
		String upper=s.substring(0, 1).toUpperCase();
		String lower=s.substring(1).toLowerCase();
		String concat=upper+lower;
		String sb=new StringBuffer(concat).reverse().toString();
		System.out.print(" "+sb);
		
		
		//System.out.print(" "+concat);
	}
}
}