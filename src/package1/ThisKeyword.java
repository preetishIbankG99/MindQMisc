package package1;

public class ThisKeyword {
int rollno;

String name;

float fee;
ThisKeyword(int rollno,String name,float fee)//parameterized constructor
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()//creating method
{
System.out.println(rollno+" "+name+" "+fee);

}

public static void main(String[] args) {

	
ThisKeyword t1=new ThisKeyword(11,"suraj",10000);
ThisKeyword t2=new ThisKeyword(12,"subham",12000);

t1.display();
t2.display();
	}

}
