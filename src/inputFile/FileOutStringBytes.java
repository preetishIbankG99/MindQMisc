package inputFile;
//Java FileOutputStream example 2: write string 
import java.io.FileOutputStream;

public class FileOutStringBytes {
public static void main(String[] args) {
	try{
		FileOutputStream f=new FileOutputStream("H://testout2.txt");
		String str="Welcome to MindQ";
		byte[]b=str.getBytes();//conversion of stringdata into byte array
		f.write(b);
		f.close();
	System.out.println("Success");	
	}
catch(Exception e){
	System.out.println(e);
}

}
}
