package package1;

public class CopyArray {
	public static void main(String[] args) {
char[]copyFrom={'u','o','p','r','e','e','t','i','s','h'};
char[]copyTo=new char[8];
	System.arraycopy(copyFrom,2,copyTo,0,8);
	System.out.println(new String(copyTo));
	}
}
