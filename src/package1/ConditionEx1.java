package package1;

public class ConditionEx1 {

	public static void main(String[] args) {
		int a=10,b=80,c=6,d=40;
		if(a>b){
			if(a>c){
				if(a>d){
					System.out.println("A is a big number");
				}
				else{
					System.out.println("A is not a big number");
				}
				
			}
			else{
				System.out.println("A is not a big number");
			}
		}
		else{
			System.out.println("A is not a big number");
		}
	}

}
