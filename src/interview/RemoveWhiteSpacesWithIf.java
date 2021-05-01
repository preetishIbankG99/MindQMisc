package interview;

public class RemoveWhiteSpacesWithIf {

	public static void main(String[] args) {
		String str="My country name is India";
		StringBuffer sb=new StringBuffer();
		char[]strArray=str.toCharArray();
		for(int i=0;i<strArray.length;i++){
			if((strArray[i]!=' ' )&&(strArray[i]!='\t')){
				sb.append(strArray[i]);
			}
		}
       System.out.print(sb);
	}

}
