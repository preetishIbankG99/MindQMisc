package string;

public class ToogleLastLetterReverse {
	public static void main(String[] args) throws InterruptedException {

		String str="preetish bhanja deo";
		String[] split=str.split("\\s");
		for(String s:split){
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			String upper=sb.substring(0, 1).toLowerCase();
			String lower=sb.substring(1).toUpperCase();
			String concat=upper+lower;
			//String rev=new StringBuffer(concat).reverse().toString();
			System.out.print(" "+concat);
			//System.out.print(" "+concat);
		}
		}
}
