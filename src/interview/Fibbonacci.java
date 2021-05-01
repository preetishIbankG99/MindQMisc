package interview;

public class Fibbonacci {
public static void main(String[] args) {
	int FirstNumber=0;
	int SecondNumber=1;
	System.out.print(FirstNumber+ " ");
	System.out.print(SecondNumber+ " ");
    for(int i=0;i<10;i++){
	int ThirdNumber=FirstNumber+SecondNumber;
	System.out.print(ThirdNumber+ " ");
	FirstNumber=SecondNumber;
	SecondNumber=ThirdNumber;
}

}
}
