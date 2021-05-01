package package1;
//calling parameterized constructor from default
public class ParamConst {
ParamConst(){
	this(7);
	System.out.println("Default Constructor");
}

public ParamConst(int i) {
	System.out.println(i);
}

}
