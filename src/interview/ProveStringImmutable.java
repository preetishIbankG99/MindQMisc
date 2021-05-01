package interview;

import com.itextpdf.text.log.SysoCounter;

public class ProveStringImmutable {
	public static void main(String[] args) {
		String initial="ABCCDEF";
		String After=initial.replace('A','Z');
		String After1=initial.replace('A','A');
		System.out.println("intial "+initial);
		System.out.println("After "+After);
	System.out.println(After1);
	}

}
