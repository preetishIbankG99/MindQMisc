package package1;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		File fileObject=new File("C:/Users/GUDU/abcd");
		 
		fileObject.mkdir();
		boolean a=fileObject.exists();
		if(a==true){
			System.out.println("Folder Exists");
			
		}
		else{
			System.out.println("Folder Doesnot Exists");
		}
	}
	

}
