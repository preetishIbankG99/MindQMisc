package multithread;
//What if we call run() method directly instead start() method?
public class TestCallRun1 extends Thread{
public void run(){
	System.out.println("thread  is running");
}
	public static void main(String[] args) {
		TestCallRun1 t1=new TestCallRun1();
		//st1.start();
		t1.run();//running //fine, but does not start a separate call stack 
		//Each thread starts in a separate call stack
	}

}
