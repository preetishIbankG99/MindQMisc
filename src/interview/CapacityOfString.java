package interview;

public class CapacityOfString {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		//default 16
		System.out.println(sb.capacity());
		sb.append("hello");
		//now also 16
		System.out.println(sb.capacity()); 
		sb.append("java is my favourite subject");
		//now it becomes {(16*2)+2}=34
		//ensure capacity we have to give maximum 34 is now default if i give ensure cap>34 any number now default capacity changes to 70
				//sb.ensureCapacity(34);
		System.out.println(sb.capacity());
       //now it becomes{(34*2)+2}=70
		sb.ensureCapacity(50);
		
		System.out.println(sb.capacity());
	}

}
