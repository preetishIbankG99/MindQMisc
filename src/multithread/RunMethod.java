package multithread;

public class RunMethod extends Thread {
public void run(){
	for(int i=1;i<5;i++){
		try{
			Thread.sleep(500);
			
		}
	catch(InterruptedException e){
		System.out.println(e);
	}
	System.out.println(i);
	}
}
	
public static void main(String[] args) {
RunMethod t1=new RunMethod();	
RunMethod t2=new RunMethod();
t1.run();
t2.run();
}
}
