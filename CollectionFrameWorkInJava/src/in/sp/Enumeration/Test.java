package in.sp.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		

		Vector v = new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add("anand");
		
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
