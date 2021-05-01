package interview;

import java.util.Random;


public class GenerateRandomNumber {
public void generateRandomNumber(){
	Random ran=new Random();
	
	for(int i=0;i<4;i++){
		int number=ran.nextInt(200);
		System.out.print(" "+number);
	}
}
public static void main(String[] args) {
	GenerateRandomNumber obj=new GenerateRandomNumber();
	obj.generateRandomNumber();
}

}
