package string;

public class StringPerformanceOptimization {
//	Time taken to create literal String 	
public static void main(String[] args) {
	long starttime=System.currentTimeMillis();
	for(int i=0;i<100000;i++){
		String s1="India";
		String s2="India";
	}	
	long endtime=System.currentTimeMillis();
	System.out.println("Time taken to create literal string: "+(endtime-starttime)+"ms");
	
	//Time taken to create Object String 
	
	long startTime1 = System.currentTimeMillis();  
	   
    for (int i = 0; i < 100000; i++) {  
        String s1 = new String("India");  
        String s2 = new String("India");  
    }  
    long endTime1 = System.currentTimeMillis();  
    System.out.println("Time taken to create Object String : " + (endTime1 - startTime1) + " ms");  
}  
}
/*o/p-Time taken to create literal string: 1ms
Time taken to create Object String : 3 ms*/

