package multithread;

public class DaemonThread extends Thread {
public void run(){
	if(Thread.currentThread().isDaemon())//inserting Thread boolean
	{
		System.out.println("Daemon Thread Works");
	}
	else{
		System.out.println("User Thread Works");
	}
}
	
	public static void main(String[] args) {
	
DaemonThread dt1=new DaemonThread();//creating thread
DaemonThread dt2=new DaemonThread();
DaemonThread dt3=new DaemonThread();
    dt1.setDaemon(true);
	//now dt1 is daemon thread
	dt1.start();//thread started
//	dt1.setDaemon(true);//java.lang.IllegalThreadStateException
	dt2.start();
	dt3.start();
	
	
	}

	
	}


