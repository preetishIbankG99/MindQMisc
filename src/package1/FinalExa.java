package package1;
//There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.
public class FinalExa {
final int speedlimit=90;//final variable
void run(){
	// speedlimit=150;//cannot change compile time error already declared final
}
public static void main(String[] args) {
FinalExa x=new FinalExa();
x.run();
}
}
