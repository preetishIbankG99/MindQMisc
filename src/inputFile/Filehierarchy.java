package inputFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filehierarchy {
public static void main(String[] args) throws IOException {
	File f=new File("abcd");
	System.out.println(f.exists());
	f.mkdir();
	System.out.println(f.exists());
	System.out.println(f.isDirectory());
	File f1=new File("abcd","xyz.txt");
	f1.createNewFile();
	System.out.println(f1.exists());
	try{
	FileOutputStream fout=new FileOutputStream("D:\\workspace\\MindQ\\abcd\\xyz.txt");
	fout.write(65);
	fout.flush();
	fout.close();
	System.out.println("Success......");
	}
	catch(Exception e){
		System.out.println(e);
	}
	FileInputStream fin=new FileInputStream("D:\\workspace\\MindQ\\abcd\\xyz.txt");
int i=fin.read();
System.out.println((char)i);
fin.close();

}
}
