package package1;

public final class FinalOverloading {
 void display(int x){
	System.out.println("hiii vasu");

}
void show(int y,int z){
	System.out.println("Hii liku");
}
//final int y=89;
public static void main(String[] args) {
	//final int p;
	FinalOverloading f=new FinalOverloading();
	f.display(10);
	f.show(20,30);
}
}
