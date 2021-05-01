package package1;


//Default Constructor without values
public class DConstructor {
	int id;
	String name;
	void display(){
		System.out.println( id +" "+ name);
	}
		
		
		public static void main(String[] args) {
		DConstructor d=new DConstructor();
		d.display();
		d.display();

}
}