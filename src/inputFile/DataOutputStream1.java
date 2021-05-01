package inputFile;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStream1 {
public static void main(String[] args) throws Exception {
FileOutputStream fout=new FileOutputStream("H://DataOutputStream.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeInt(65);
dout.flush();
dout.close();

System.out.println("Success...");
}
}
