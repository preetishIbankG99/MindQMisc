package inputFile;

import java.io.File;

public class RenameMoveFile {
	public static void main(String[] args) {
		
	File file=new File("C:\\Users\\GUDU\\Desktop\\gudu\\apa.txt");	 
		
		 boolean success=file.renameTo(new File("C:\\Users\\GUDU\\Desktop\\gudu\\subfolder\\apaaa.txt"));
		 System.out.println("Success ="+success);


}
}
