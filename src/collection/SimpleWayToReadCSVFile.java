package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleWayToReadCSVFile {
	public static void main(String[] args) {
		String filename="Selenium Easy - Download Table Data to CSV, Excel, PDF and Print.csv";
		File file=new File(filename);




		try {
			Scanner scan=new Scanner(file);
			while(scan.hasNext()){
				String data=scan.next();
				//String[] values=data.split(",");
				System.out.println(data);
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		}
}
