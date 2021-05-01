package qspiderjavaprogrampractise;

public class CountNoOfDigitsInGivenString {
	public static void main(String[] args) {
		//To Count No of digits
		int count=0;
		String str3="Page 14 of 567";
		char[]f=str3.toCharArray();
		for(char h:f)
		{
			if(Character.isDigit(h))
					{
				count++;
					}		
		}
		System.out.println(count);

}
}
