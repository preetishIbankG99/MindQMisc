package patternprogrammes;

public class Pattern8 {
	public static void main(String[] args) {
		int i,j,k=1;
		for(i=1;i<=3;i++) {
			for(j=1;j<=3;j++) {
			if(i==j) {
				System.out.print(" * ");
			}
			else {
				System.out.print((k++)+" ");
			}
			}
			System.out.println();
		}
	}

}

//* 1 2 
//3  * 4 
//5 6  * 
