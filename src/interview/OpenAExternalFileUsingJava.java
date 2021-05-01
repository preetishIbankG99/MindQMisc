package interview;

import java.io.IOException;

public class OpenAExternalFileUsingJava {
public static void main(String[]args) throws IOException {
	Runtime runtime=Runtime.getRuntime();
	String[] s=new String[] {"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe" ,"D:\\songs\\instrumentals\\aaja mahiya.mp3"};
	Process process=runtime.exec(s);
}
}
