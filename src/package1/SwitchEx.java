package package1;

public class SwitchEx {

	public static void main(String[] args) {
		char grade='F';
		switch(grade){
		case 'A':
			System.out.println("Outstanding");
			break;
		case 'B':
			System.out.println("Excellent");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
				System.out.println("Fair");
			break;
		default:
				System.out.println("You can do Better");
		}

	}

}
