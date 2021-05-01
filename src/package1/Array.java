package package1;


//whenever we are creeating an array every element is initialized with default value automatically
	//int[]a=new int[3];
	//s.o.p(a)//[I@3e25a5]
	//Declartion,construction,initialization of an array in a single line
	//EX-int[]a={10,20,30};char[] ch={'a','e','i','o','u'};String[] s={"java","php","oracle"}
	//length-final variable applicable only for arrays it represent size of the array.Ex-int[]x=new int[3];s.o.p(x.length);
	//length()-its a final method applicable for string objects.returns no of characters present in string.Ex-String x="gudu";s.o.p(x.length())
	//In multi Dimensional array length variable represents only base size but not total size.
	//Ex-int[][] a=new int[6][3];s.o.p(a.length);//6;6 first one is base size
	//s.o.p(a[0].length)//3
	/*There is no direct way to find total size of multi dimensional array but indirectly we can find as follows
	x[0].length+x[1].length+x[2].length+.........*/
	//Anonymous aaray without name main mooto is to "Just for instance use" at time of anonymous array creation we cant specify size otherwise we will get compile time error
	//Ex-int[3]{10,20,30,40}//Compiletime Error
	//new int[]{10,20,30};//valid
	//A char value can be promoted to int type but char aaray cannot be promoted to int array
	//Ex-int[]a={10,20,30};char[] ch={'a','b','c'};int[]b=a;//valid;int[]c=ch;//C.E
	//valid promotions
	/*1)char.......int(valid)
    2)char[].....int[](invalid)
    3)int.....long(valid)
    4)int[].....long[](invalid)
    5)double.....float(invalid)
    6)double[]....float[](invalid)
    7)String.....Object(valid)
    8)String[].....Object[](valid)*/
//Whenever we are assigning one array to another array internal elements wont be copy just reference variable will be reassigned hence types are important
/*int []a={10,20,30}
int[]b={40,50}
a=b;//valid
b=a;//valid
*/
public class Array {
	public static void main(String[] args) {
		int [] a={10,20,30,40};
		System.out.println(a[2]);
		String [] s={"java","ruby","python","dotnet"};
		System.out.println(s[3]);
		int index=0;
		while(index<4){
			System.out.println(a[index]);
			index++;
		}

	}

}
