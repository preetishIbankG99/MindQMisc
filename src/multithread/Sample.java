package multithread;



public class Sample extends Thread {
public void run(){
	for(int i=1;i<=5;i++){
		try{
			Thread.sleep(800);
		}
	
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println(i);
	}
    }

public static void main(String[] args) {
	Sample s=new Sample();
	Sample s1=new Sample();
	Sample s2= new Sample();
	s.start();
	try{
		s.join();
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	
	s1.start();
	s2.start();
//s.run();
//s1.run();
}


}
