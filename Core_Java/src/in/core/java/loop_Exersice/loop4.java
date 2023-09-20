package in.core.java.loop_Exersice;

public class loop4 {

	public static void main(String[] args) {
		

		int x=2,y=7;
		int p=x;
		for(int c=1;c<=y;c++)
		{
			p=p*x;
		}
		System.out.println(p);

	}

}
/* x   y   p=x   c  p=p*x  p
   2   7    2    1    4    4
   2        4    2    8    8
   2        8    3    16   16
   2        16   4    32   32
   2        32   5    64   64
   2        64   6    128  128
   2        128  7    256  256*/
