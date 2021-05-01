package singleton;

import com.itextpdf.text.log.SysoCounter;

public class SingleTonJava {
	
	  //in oops singleton is nothing but a class that have only once object or instance
	//at a time
	//Design of Single ton Class
	//Step1-Make Constructor as private for singleton
	//Write static method that has a return type of obj of this singleton class(lazy initialization)
	 
	
	private static SingleTonJava singleton_instance=null;
	public String str;
	//constructor
	private SingleTonJava() {
		str="Hello IBM";
		
	}
	
	public static SingleTonJava getInstance() {
		if(singleton_instance==null ) 
			singleton_instance=new SingleTonJava();
			return singleton_instance;
	}

	public static void main(String[] args) {
		SingleTonJava x=SingleTonJava.getInstance();
		SingleTonJava y=SingleTonJava.getInstance();
		SingleTonJava z=SingleTonJava.getInstance();
x.str=(x.str).toUpperCase();
System.out.println(x.str);
System.out.println(y.str);
System.out.println(z.str);
System.out.println("========================================================================");
z.str=(z.str).toLowerCase();
System.out.println(x.str);
System.out.println(y.str);
System.out.println(z.str);
	}

}
