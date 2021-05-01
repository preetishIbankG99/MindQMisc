package interview;

public class ReverseaString {
	public static boolean StringPallindromeString(String str){
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev=sb.toString();
		//String rev=sb.reverse().toString();
	if(str.equals(rev)){
		return true;
	}
	else{
		return false;
	}
	}
}
