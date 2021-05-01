package interview;

public class CalculateRepeatingSeriesString {

	public static void main(String[] args) {
		String str="mmoonnooppoolloojjoo";
		
		 System.out.println("Enter a character to count in the string " + str);
		 char c=str.toLowerCase().charAt(2);//though we taking index to count particular char
        
int count = 0;
for (char cc : str.toCharArray()) {
if (c == cc) {
count++;
}
}
System.out.println(c + " occurs " + count + " times in " + str);

	}

}
