package in.sp.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		

		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add("deepak");
		hs.add(20);
		hs.add(40);
		hs.add(null);
		hs.add(true);
		hs.add("deepak");
		
		//stem.out.println(hs);
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
