package interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecialCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to find special characters:");

		String userInput = sc.nextLine();

		sc.close();

		System.out.println("You entered: " + userInput);

		

        // We know there are 33 special characters. So we will use them.
		Pattern p = Pattern.compile("[ !\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]");
		Matcher m = p.matcher(userInput);
		
		// Iterating matcher
		int countOfSplChars = 0;
		while (m.find()) {
			countOfSplChars += 1;
			System.out.println(userInput.charAt(m.start())+ " at position " + (m.start()+1)+ ".");
		}
		System.out.println("Total special characters found:"+countOfSplChars);
	}
	}

//Please enter the string to find special characters:
//Make@#Seleniu?Eas&*y
//\You entered: Make@#Seleniu?Eas&*y
//@ at position 5.
//# at position 6.s
//? at position 14.
//& at position 18.
//* at position 19.
//Total special characters found:5

