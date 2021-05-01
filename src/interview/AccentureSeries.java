package interview;

public class AccentureSeries {

	public static void main(String[] args) {
		String str="mmoonnooppooqqoo";
		int count=0;
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch=='o') {
				//System.out.print(" "+ch);
				count++;
				
			}
			
		}
		System.out.println();

		System.out.println("Totalno number of O's:"+count);
	}

}
