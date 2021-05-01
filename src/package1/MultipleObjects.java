package package1;



public class MultipleObjects {
	int length;
	int breadth;
	void insert(int l ,int b){
		length=l;
		breadth=b;
		
		}
	void calculateArea(){
	System.out.println(length*breadth);

	} 


	public static void main(String[] args) {
		MultipleObjects p=new MultipleObjects (),p1=new MultipleObjects ();
		p.insert(11, 5);
		p1.insert(10, 5);
		
		p.calculateArea();
		p1.calculateArea();
	}

}
