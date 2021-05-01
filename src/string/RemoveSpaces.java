package string;

public class RemoveSpaces {
public static void main(String[] args) {
	String str="I Love My India";
	String nospacestr=str.replaceAll("\\s", "");
	System.out.println(nospacestr);
}
}
