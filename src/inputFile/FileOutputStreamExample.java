package inputFile;

//Java FileOutputStream Example 1: write byte
import java.io.FileOutputStream;

public class FileOutputStreamExample {
public static void main(String[] args) {
	try{
	FileOutputStream f=new FileOutputStream("H:\\testoutput.txt");
	f.write(90);//Ascii values input from A=65 to Z=90
	f.close();
	System.out.println("success");
	}
	//console o/op-success
	//test o/p-Z Z ascii value is 90
	catch(Exception e){
		System.out.println(e);
	}
}
	
}

