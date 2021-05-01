package interview;

public class Print10To1 {
public static  void main(String[]args){
	for(int i=10;i>=1;i--){
		System.out.print(" "+i);
	}
}
}
//to rotate second half of array

//int arr[]={10,20,30,40,50,60,70,80,90,100};
//int start =arr.length/2;
//int end = arr.length-1;
//int temp=0;
//for (int i=arr.length/2;i<arr.length/2+(arr.length/4);i++)
//{
//	 temp=arr[start]; arr[start]=arr[end]; arr[end]=temp; start++; end--; }
//
//for (int i:arr) System.out.println(i);


//rotate first half of array
/*int arr[]={10,20,30,40,50,60,70,80,90,100};
int start =0;
int end = arr.length/2-1;
int temp=0;
for (int i=0;i<arr.length/2-arr.length/4;i++)
{
	 temp=arr[start]; 
	 arr[start]=arr[end]; 
	 arr[end]=temp; start++; 
	 end--; }

for (int i:arr) System.out.print(i+" ")*/

