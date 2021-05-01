package string;

public class StringLastCap {

	public static void main(String[] args) {
		String []str={"gudu","benu","silu","rubu"};
		for(String s:str){
			String lower=s.substring(0,3).toLowerCase();
			String upper=s.substring(3).toUpperCase();
			String concat=lower+upper;
			System.out.print("["+concat+"]");
		}}}


