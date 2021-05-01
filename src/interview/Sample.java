package interview;

public class Sample {
	public static int method(){
		try{
			 int a=50/0;
			System.out.println(a);
			return a;
			
			}
		catch(NullPointerException e){
			int c=20;
			System.out.println(c);
			System.out.println(e);
			return c;
		}

		finally{
			//System.exit(0);
			int b=10;
			System.out.println("Finally always executed");
			System.out.println(b);
			return b;


		}
		}
		public static void main(String[] args) {
			Sample .method();
			

		}
}
