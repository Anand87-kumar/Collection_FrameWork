package in.core.java.number;

public class Break_Sts {

	public static void main(String[] args) {
		
		int ctr=10;
		// 10 is less than 1. value-No/false
		//while(ctr<=1) {
		//10 is greater than 1. answer is true.
		while(ctr>=1) {
			//System.out.println("CETPA");
			//System.out.println(ctr);
			//ctr--;
			ctr--;
			if(ctr==6 || ctr==2)
				continue;
			if(ctr==3 || ctr==9)
				break;
			System.out.println(ctr);
			//break;
		}

	}

}
