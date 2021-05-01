package interview;

public class CountVowels {

	public static void main(String[] args) {
		int CountVowels=0;
		String str="Kalyan Krishnan";
		char ch;
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch=='a'||ch=='A'|| ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
				System.out.print(" "+ch);
				CountVowels++;
				}
			
		}
		System.out.println();

		System.out.println("Totalno Vowels:"+CountVowels);

		}
	}


