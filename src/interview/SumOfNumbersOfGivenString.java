package interview;

public class SumOfNumbersOfGivenString {
//sum of number of given string
	public static void main(String[] args) {
		String str= "page no 11 of 21";
		char[]d=str.toCharArray();
		int sum=0;
		for(char b:d){
			if(Character.isDigit(b)){
				int a=Integer.parseInt(""+b);
				sum=sum+a;
				
			}
		}
	System.out.println(sum);			

	}

}
