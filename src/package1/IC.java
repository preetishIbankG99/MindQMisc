package package1;

public class IC implements Printable {

public void print() {

System.out.println("Documents to be printed");		
	}
public static void main(String[] args) {
	IC i=new IC();
	i.print();
}
}
