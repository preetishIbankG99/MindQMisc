package package1;

public class ConstructorOver {
int id;
String name;
int age;
int rollno;
ConstructorOver(int i,String j,int k){
	id=i;
	name=j;
	age=k;
}	

ConstructorOver(int i,String j,int k,int l){
	id=i;
	name=j;
	age=k;
	rollno=l;
	
}
	void display()
	{
		
		System.out.println(id+" " +name+" "+age+ " "+rollno );
		

	
}	
	
public static void main(String[] args) {
		
	ConstructorOver o=new ConstructorOver(12,"shiba",28);
	ConstructorOver o1=new ConstructorOver(13,"benu",29,1);
	o.display();
	o1.display();
	}

}
