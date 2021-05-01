package interview;

public class StringLengthWithoutBuilin {
public static void main(String[]args){
	int i=0;
	while(true){
	String str="gudubabu";
	try{
	char c=str.charAt(i);
	i++;
	}
catch(Exception e){
	break;
}
}
System.out.println(i);
}
}