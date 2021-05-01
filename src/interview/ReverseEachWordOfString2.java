package interview;

import java.util.Scanner;

public class ReverseEachWordOfString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("::::Enter A String::::");
		String str=sc.nextLine();
		String[]words=str.split("\\s");
		String reversea=" ";
for(String w:words){
	StringBuilder sb=new StringBuilder(w);
	reversea=sb.reverse().toString()+" ";
   System.out.print(" "+reversea.trim());
}
	}

}
