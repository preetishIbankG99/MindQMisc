package package1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MultiFilesCreations {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\GUDU\\Desktop\\New folder"+"Person"+".txt");
		int increase=1;
		while(file.exists()) {
			increase++;
			file=new File("C:\\Users\\GUDU\\Desktop\\New folder"+"Person"+"increase"+".txt");
			
		}
if(!file.exists()) {
	try {
		
		String content=file.toString();
		file.createNewFile();
	FileWriter fw=new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(content);
	bw.close();
	System.out.println("Done");
	}
catch(IOException e) {
	
}
}
	}

}
