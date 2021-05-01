package inputFile;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FileOut2 {

	public static void main(String[] args) {
		try{
			FileOutputStream f=new FileOutputStream("C:\\Users\\GUDU\\Desktop\\gudu.txt");
		String s="Hiii ShibaShakti";
		byte[] b=s.getBytes();//converting string into byte array    
		f.write(b);
		f.close();
		System.out.println("Success");
		}
	catch(Exception e){
		System.out.println(e);
	}
	}

}
