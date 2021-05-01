package string;

public class MyHtmlTagRemover {
	public static void main(String a[]){
        String text = "<B>I don't want this to be bold<\\B>";
        System.out.println(text);
        text = text.replaceAll("\\<.*?\\>", "");
        System.out.println(text);
    }
}
