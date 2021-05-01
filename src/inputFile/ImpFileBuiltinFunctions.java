package inputFile;

import java.io.File;
import java.io.IOException;

public class ImpFileBuiltinFunctions {

	
		public static void main(String[]args) throws InterruptedException, IOException {

			boolean f=new File("C:\\gudunewfolder\\gudu\\shiba").mkdir();
			 File file = new File("c:\\gudunewfolder\\gudu.xls");
			 file.createNewFile();
			 System.out.println(file.exists());
//			 file.delete();
//			 System.out.println(file.exists());
			 Thread.sleep(3000);
			 System.out.println(file.isFile());
			 Thread.sleep(3000);
			 System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		Thread.sleep(3000);
		System.out.println(file.lastModified());
		System.out.println(file.getParentFile());
		System.out.println(file.listFiles());
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		System.out.println(file.getUsableSpace());
		System.out.println(file.isHidden());
		System.out.println(file.getCanonicalFile());
		file.deleteOnExit();
	}

}
