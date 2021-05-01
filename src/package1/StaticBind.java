package package1;
//When type of the object is determined at compiled time(by the compiler), it is known as static binding.
//static binding (also known as early binding).
//If there is any private, final or static method in a class, there is static binding.
public class StaticBind {
	private void bind(){
		System.out.println("i am binding...");
		}  
	  
	 public static void main(String args[]){  
	 StaticBind sb=new StaticBind();  
	  sb.bind();  
	 }  
}
//i am binding...