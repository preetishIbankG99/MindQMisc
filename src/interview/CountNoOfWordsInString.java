package interview;

import java.util.Scanner;

public class CountNoOfWordsInString {
public static int countWords(String string){
	String []strarray=string.split("");
	int count=0;
	for(String s:strarray){
		if(!s.equals("")){
			count++;
			
		}
		
	}
	return count;
	}
public static void main (String[] args){
	System.out.println("Enter A String : ");
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	System.out.println("Total Characters: "+countWords(str));
    scan.close();
}


}
