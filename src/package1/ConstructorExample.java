package package1;


//Constructor Overloading with different parameters
public class ConstructorExample {
int id;
String name;
int age;
ConstructorExample(int i,String n){
	id=i;
	name=n;
	
}
ConstructorExample(int i,String n,int a){
	id=i;
	name=n;
	age=a;
}
void display(){
	System.out.println(id+" "+name+" "+age);
}
public static void main(String[] args) {
	ConstructorExample c=new ConstructorExample(111,"Shiba");//insert 2 parameters
ConstructorExample c1=new ConstructorExample(112,"Benu",28);//insert  3 parameters
c.display();
c1.display();
}

}
/*:O/p-111 Shiba 0
112 Benu 28*/

