package interview;

public class FINDDUPLIACATEARRAYNUMBERS {
public static void main(String[] args) {
		
		int[]a= {1,2,2,3,4,5,6,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
			if((a[i]==a[j])&& (i!=j)) {
				System.out.println("Dupliactes are :"+a[j]);
			}
				
				
			}
		}

	}
}
