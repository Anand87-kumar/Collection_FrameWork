package in.sp.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		
 
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add("deepak");
		al.add(20);
		
		System.out.println(al);
		
//		ListIterator li = al.listIterator();
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
		
		java.util.Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
