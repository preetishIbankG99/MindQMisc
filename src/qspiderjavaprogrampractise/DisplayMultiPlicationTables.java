package qspiderjavaprogrampractise;

import java.util.Scanner;

public class DisplayMultiPlicationTables {
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=10 ;j++ )
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
		System.out.println();
		}	
		
	}
	
}
//enter value of n: 10
//
//1*1=1   	2*1=2   	3*1=3   	4*1=4   	5*1=5
//1*2=2  	    2*2=4   	3*2=6   	4*2=8   	5*2=10
//1*3=3   	2*3=6   	3*3=9   	4*3=12  	5*3=15
//1*4=4   	2*4=8   	3*4=12  	4*4=16  	5*4=20
//1*5=5   	2*5=10  	3*5=15  	4*5=20  	5*5=25
//1*6=6   	2*6=12  	3*6=18  	4*6=24  	5*6=30
//1*7=7   	2*7=14  	3*7=21  	4*7=28  	5*7=35
//1*8=8   	2*8=16  	3*8=24  	4*8=32  	5*8=40
//1*9=9   	2*9=18  	3*9=27  	4*9=36  	5*9=45
//1*10=10 	2*10=20 	3*10=30 	4*10=40 	5*10=50

