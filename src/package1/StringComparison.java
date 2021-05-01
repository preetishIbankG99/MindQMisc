package package1;

public class StringComparison {

	public static void main(String[] args) {
		String str1="SELENIUM";
		String str2="selenium";
		String str3="SELENIUM";
		String str4="Eselenium";
		String str5="zSELENIUM";
		
		System.out.println(str1==str2);//false
		//using equals method
		System.out.println(str1.equals(str3));//true
System.out.println(str1.compareTo(str4));//14 ascii values 
System.out.println(str3==str5);//false
System.out.println(str1.compareTo(str3));//0
////ASCII Values A-Z(65-90)
////ASCII Values a-z(97-122)
////ASII Values 0-9(48-57)
	}

}
