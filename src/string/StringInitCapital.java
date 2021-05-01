package string;

public class StringInitCapital {

	public static void main(String[] args) {
		String []str={"gudu","benu","shiba","rubu"};
		for(String s:str){
			String upper=s.substring(0, 1).toUpperCase();
			String lower=s.substring(1).toLowerCase();
			String concat=upper+lower;
			System.out.print("["+concat+"]");

}
}
}