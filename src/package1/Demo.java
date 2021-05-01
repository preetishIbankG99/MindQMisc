package package1;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File fileObject=new File("C:/Users/GUDU/selenium/sele.txt");
		 
		fileObject.mkdir();//for creating file/folder
        //fileObject.delete();//to delete a file or folder
       // fileObject.createNewFile();    //for create a file txt or xls		
		boolean a=fileObject.exists();//for checking folder exists or not
		if(a==true){
			System.out.println("Folder Exists");
		}
		else{
			System.out.println("Folder Not Exists");
		}
	}
	

}
