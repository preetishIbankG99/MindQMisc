package multithread;
// Java Thread Example by implementing Runnable interface
class Multi2 implements Runnable {

	public void run() {
System.out.println("Thread is ready");	
	}
public static void main(String[] args) {
	Multi2 m=new Multi2();//creating object class
	Thread t1 =new Thread(m);//inserting it into thread class
	t1.start(); 
    
}
}
