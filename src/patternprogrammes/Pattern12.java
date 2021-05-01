package patternprogrammes;

public class Pattern12 {
public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
			if(i%2==0&&j%2==0) {
				System.out.print(" * ");
			}
			else {
				System.out.print(" # ");
			}
			}
			System.out.println();
		}
	}
}
//#  #  #  #  # 
//#  *  #  *  # 
//#  #  #  #  # 
//#  *  #  *  # 
//#  #  #  #  # 