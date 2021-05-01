package package1;

public class Passing_Array {
public static void main(String[] args) {
	//Declaring An Array
	Integer[] x={10,20,30,40,50};
	//Printing Array
Print_Array(x);
}


//This accept Array as an argument of type Integer 
private static void Print_Array(Integer[] x) {
	for(int i = 0;i<=x.length-1;i++){
		System.out.println("Print all values of an Array:"+x[i]);
	}
	
}
}
