package package1;
//allowed data types to specify arraysize are byte,short,char,int.if we are using  any other type we will get compile time error
//The maxm allowed arraysize in java is maxm value of int size[2147483647]
//byte b=10; int[] a=new int[b];valid
//short s=20; int[] a=new int[s];
//in java multi dimensional arrays are implemented as array of aarays approach but not matrix form
//main advantage of multi dimensional array is to improve memory utilization
public class ArrayDimensional {
	int i=0;
	public static void main(String[] args) {
	int [] array1={1,2,3,4,5};	//single Dimensional array
	int[] [] array2={{1,3,5,6},{2,4,6,8}};//multidimensional array
		System.out.println(array1[3]);//4
		System.out.println(array2[0][0]);//1
System.out.println(array2[1][0]);//2
System.out.println(array2[1][3]);//8
System.out.println(array2[0][0]);//1
	}
}