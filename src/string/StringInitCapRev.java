package string;

public class StringInitCapRev {
public static void main(String[] args) {
		
	String []str={"gudu","benu","silu","rubu"};
	for(String s:str){
		String upper=s.substring(0, 1).toUpperCase();
		String lower=s.substring(1).toLowerCase();
		String concat=upper+lower;
		String sb=new StringBuffer(concat).reverse().toString();
		System.out.print("["+sb+"]");
}	
}

}
