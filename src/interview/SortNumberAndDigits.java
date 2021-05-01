package interview;

public class SortNumberAndDigits {
	public static void main(String[] args) {
		String str="abcd123efgh456";
		char[] charArray=str.toCharArray();
		StringBuffer str1=new StringBuffer();
		StringBuffer str2=new StringBuffer();
		for(char ch:charArray)
		{
			if(Character.isDigit(ch))
				str1=str1.append(ch);
			else
			{
				str2=str2.append(ch);
			}
		}
		System.out.println(str1);
		System.out.println(str2);
		}}

