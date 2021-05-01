package package1;


public class StudentT {
int Rollno;
String Name;
String Dob;
String Address;
float fee;
//instance variable and parameter are same due to which to overcome from ambiguity situation
StudentT(int Rollno,String Name,String Dob,String Address,float fee){
	this.Rollno=Rollno;
	this.Name=Name;
	this.Dob=Dob;
	this.Address=Address;
	this.fee=fee;
}
void display(){
	System.out.println(" Rollno is:"+Rollno+"  Name is:"+Name+"  Dob is:"+Dob+"  Address is :"+Address+"  Fee is:"+fee);

}

}
