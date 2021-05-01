package package1;

public class Passing_Array2 {
public static void main(String[] args) {
	//Declaration of an Array
	String[] s={"GUDDU","SHIBA","BENU","RUBU","SILU"};
	//Passing ARRAY TO A METHOD
	Print_Array(s);
}

public static void Print_Array(String[] s) {
	for(int i=0;i<=s.length-1;i++){
		System.out.println("ALL VALUES  OF ARRAY ARE: "+s[i]);
	}
	
}
}
