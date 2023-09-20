package in.core.java.loop_Exersice;

public class loop2 {

	public static void main(String[] args) {
		

		int x=1;
		for(int c=1;c<=10;c++) {          
			System.out.println(x); 
			x+=c;                 
		}

	}

}
//follow of the program.
/* x     c   x+c=c(x=x+c)   output(x) 
   1     1     2             1
   2     2     4             2
   4     3     7             4
   7     4     11            7  
   11    5     16            11
   16    6     22            16*/