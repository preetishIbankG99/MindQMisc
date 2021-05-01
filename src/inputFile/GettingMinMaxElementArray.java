package inputFile;

public class GettingMinMaxElementArray {

	public static void main(String[] args) {
		int [] value={10,11,12,45,32,14};
		int smallest=value[0];
		for(int i=0;i<value.length;i++){
			if(value[i]<smallest){//if we change the sign to > we will get max
			smallest=value[i];	
		}
		}
		System.out.println(smallest);
	    }
	    }
