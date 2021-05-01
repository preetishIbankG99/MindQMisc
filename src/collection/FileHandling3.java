package collection;

import java.io.File;
import java.io.IOException;

public class FileHandling3 {

	public static void main(String[] args) throws IOException {
		File fileObject=new File("C:/Users/GUDU/abcd/basu.xls");
		fileObject.createNewFile();
	}

}
