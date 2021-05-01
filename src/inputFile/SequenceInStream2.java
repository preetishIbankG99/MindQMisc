package inputFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.SequenceInputStream;


public class SequenceInStream2 {
public static void main(String[] args) throws Exception  {
	FileInputStream fis1=new FileInputStream("H:\\seqin1.txt");
	FileInputStream fis2=new FileInputStream("H:\\seqin2.txt");
	SequenceInputStream ins=new SequenceInputStream(fis1,fis2);
	FileOutputStream fout=new FileOutputStream("H:\\seqout.txt");

int j;
while((j=ins.read())!=-1)
{
	fout.write(j);
}
fout.close();
ins.close();
fis2.close();
fis1.close();
System.out.println("success");
}

}
