package package1;

public class ConditionalEx2 {

	public static void main(String[] args) {
		int a=20,b=15,c=10,d=5;
		if(((a>b)&&(a>c)&&(a>d))){
			System.out.println("A is Bigger");
			
		}
		else if(((b>a)&&(b>c)&&(b>d))){
			System.out.println("B is Bigger");
			
		}
		else if(((c>a)&&(c>b)&&(c>d))){
			System.out.println("C i Bigger");
		}
		else {
			System.out.println("D is Bigger");
		}
	
	}
	
	

}
