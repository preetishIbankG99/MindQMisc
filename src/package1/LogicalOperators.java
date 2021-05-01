package package1;

public class LogicalOperators {

	public static void main(String[] args) {
		int subject1=56;
		int subject2=45;
		//use of logical operators
		if((subject1>35) && (subject2>35)){//in and condition both condition has to be true
			System.out.println("condition true");
		}
		else{
			System.out.println("condition is false");
		}
	
	if((subject1>35) || (subject2>35)){//in or condition one one condition need to be true
		System.out.println("condition true");
	}
	else{
		System.out.println("condition is false");
	}
	}
}