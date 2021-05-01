package package1;
//we initialize blank final variable but only in constructor
public class InitBlankFinalVar {
	 final int speedlimit;//blank final variable  
	    
	 InitBlankFinalVar(){  
	  speedlimit=70;  
	  System.out.println(speedlimit);  
	  }  
	  
	  public static void main(String args[]){  
	    new InitBlankFinalVar();  
}
}