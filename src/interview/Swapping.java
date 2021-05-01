package interview;

public class Swapping {
public static void main(String[] args) {
	
	int x=10;
	int y=20;
	System.out.println("before swap value of x="+x);
	System.out.println("before swap value of y="+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("after swap value of x="+x);
	System.out.println("after swap value of y="+y);
}
}
