package interview;

public class ExtractNumbersFromString {
	public  static void main(String[] args) {
		String msg="you are about to delete 300 tasks please confirm";
		System.out.println(msg.substring(msg.indexOf("delete")+7,msg.indexOf("tasks")-1));
		}

}
