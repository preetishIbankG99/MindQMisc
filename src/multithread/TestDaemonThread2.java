package multithread;

public class TestDaemonThread2 extends Thread {
	public void run(){  
		  System.out.println("Name: "+Thread.currentThread().getName());  
		  System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
		 }  
		  
		 public static void main(String[] args){  
		  TestDaemonThread2 t1=new TestDaemonThread2();  
		  TestDaemonThread2 t2=new TestDaemonThread2();  
		  t1.start();  
		  t1.setDaemon(true);//will throw exception here  
		  t2.start();  
		 }  
}
//o/p-Exception in thread "main" java.lang.IllegalThreadStateException
/*at java.lang.Thread.setDaemon(Thread.java:1356)
at multithread.TestDaemonThread2.main(TestDaemonThread2.java:13)
Name: Thread-0
Daemon: false*/