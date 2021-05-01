package inputFile;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInStream {
public static void main(String[] args) throws IOException  {
FileInputStream fis1=new FileInputStream("H:\\seqtext1.txt");
FileInputStream fis2=new FileInputStream("H:\\seqtext2.txt");
SequenceInputStream ins=new SequenceInputStream(fis1,fis2);
int i;

	while((i=ins.read())!=-1){
		System.out.println((char)i);

		
	}
ins.close();
fis1.close();
fis2.close();
}
}
//o/p in console
/*
i
t
 
i
s
 
s
e
q
u
e
n
t
i
a
l
 
i
n
p
u
t
 
1
i
t
 
i
s
 
s
e
q
u
e
n
t
i
a
l
 
i
n
p
u
t
2*/
