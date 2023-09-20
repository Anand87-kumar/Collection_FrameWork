package in.sp.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(101);
		al.add(102);
		al.add(103);
		
		System.out.println(al);
		
		
		Map map = new HashMap();
		map.put(101, "deepak");
		map.put(102, "amit");
		map.put(103, "anand");
		
		//map.clear();
		
		System.out.println(map.containsKey(105));
		System.out.println(map.containsValue("ankit"));
		System.out.println(map.entrySet());
		
		
		System.out.println(map);
	}

}
