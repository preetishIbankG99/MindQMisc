package package1;


public class PConstructor {
	int id;
	String name;
	char grade;
	PConstructor(int x,String y,char z){

	id=x;
	name=y;
	grade=z;

	}
	void display(){
		
	System.out.println(id+"   "+name  +"  "+grade);	
	}
	public static void main(String[] args) {
		PConstructor d=new PConstructor(111,"KALYAN",'E');
		PConstructor n=new PConstructor(112,"ANANTH",'O');
		d.display();
		n.display();
		
	}
	}

