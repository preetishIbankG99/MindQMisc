package interview;

public class EvenOdd {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			if(i%2==0){
				System.out.print(" "+i);//even
				System.out.println();
			}
			else if(i!=0){
				System.out.print(" "+i);//odd
			}
		}

	}

}
