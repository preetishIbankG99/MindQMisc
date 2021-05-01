package package1;

import java.io.File;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException {
		
			File fileObject=new File("C:/Users/GUDU/abcd/gudu.txt");
			fileObject.createNewFile();
			fileObject.delete();
	}

}
