package inputFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {
public static void main(String[] args) throws Exception {
	InputStreamReader read=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(read);
System.out.println("Enter your pet name:");
String name=br.readLine();
System.out.println("Welome :"+name);
}
}
