package collection;

public class practise {
static int b=10;//outside main method
int c=20;//instance variable created object to call
	public static void main(String[] args) {
		practise obj=new practise();
		
 
for(int a=1;a<=5;a++)
{
	System.out.println(a);//inside loop local variable
	
}

obj.c=30;
System.out.println(b);
System.out.println(obj.c);
}


}
	
	
