package interview;

public class TryCatchReturn {
	public int div;


	public int method(){
		
		try{
			int div=550;
			System.out.println("try block succesfully executed");
			//int div=550/0;
			System.out.println(div);
			return div;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block called");
			System.out.println(e);
			
			return div;
		}
		
		
		finally{
			int div=1000;
			System.out.println("Finally block will always executed");
			return div;
		
		}
		
		
	}
	
	
public static void main(String[] args) {
TryCatchReturn t=new TryCatchReturn();
System.out.println(t.method());

}
}
