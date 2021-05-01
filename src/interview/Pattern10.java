package interview;
/*o/p-
BBBB
BBBB
BBBB
BBBB*/
import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Rows: ");
		int rows=scan.nextInt();
		System.out.println("Cols: ");
		int cols=scan.nextInt();
		if(rows<=0||cols<=0){
			
		}
		else{
			for(int i=1;i<=rows;i++){
				for(int j=1;j<=cols;j++){
					System.out.print("B");
				}
			System.out.println();
			}
		}
		

	}

}
