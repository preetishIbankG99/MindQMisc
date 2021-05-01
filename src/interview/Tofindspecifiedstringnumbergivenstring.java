package interview;

public class Tofindspecifiedstringnumbergivenstring {
public static void main(String[]args){
	String s1="Cat";
	String[] s2={"cat","boat","sweet","rat"};
	String msg="Not found";
	for(int i=0;i<s2.length;i++)
	{
		if(s2[i].equalsIgnoreCase(s1))
				{
					msg="found";
					break;
				}
	}
	System.out.println(msg); 
	}
}


