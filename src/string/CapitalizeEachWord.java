package string;

public class CapitalizeEachWord {
public static void main(String[] args) {
String str="preetish bhanja deo";
String[] split=str.split("\\s");
for(String s:split){
	String upper=s.substring(0, 1).toUpperCase();
	String lower=s.substring(1).toLowerCase();
	String concat=upper+lower;
	System.out.print(" "+concat);
	}
	}
}
