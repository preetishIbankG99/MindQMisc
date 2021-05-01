package package1;
//this to invoke current class method 
public class CCMThis {
void m(){
	System.out.println("Hello Boss I am Method M");
}
void n(){
	System.out.println("Hello Boss You are Method N");
this.m();//If you dont use this keyword compiler automatically add this keyword while invoking
}
}
