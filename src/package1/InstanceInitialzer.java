package package1;
//Example of instance initializer block
public class InstanceInitialzer {
	 int speed;  
     
	 InstanceInitialzer()
	     {
		 System.out.println("speed is "+speed);
		 }  
	   //instance initial block created
	       {
	    	speed=100;
	    	}  
	       
	    public static void main(String args[]){  
	    	InstanceInitialzer b1=new InstanceInitialzer();  
	    	InstanceInitialzer b2=new InstanceInitialzer();  
}      
}
