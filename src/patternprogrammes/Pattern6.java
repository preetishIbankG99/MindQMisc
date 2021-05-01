package patternprogrammes;

public class Pattern6 {

	public static void main(String[] args) {
		char ch='A';
		int k=10;
		    for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
		    System.out.print(" "+ch+k);
		    ch+=1;
		    k+=10;
			}
			System.out.println();
		    }
	}

}
