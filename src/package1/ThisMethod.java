package package1;

public class ThisMethod {
void m(){
	System.out.println("M is a good boy");
}
	void n(){
		System.out.println("N is a bad boy");
		this.m();
	}

}
