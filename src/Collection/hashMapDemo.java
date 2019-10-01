package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hs = new HashMap<Integer, String>();
		hs.put(0,"zero");
		hs.put(1, "first");
		hs.put(2, "second");
		System.out.println(hs);
		hs.put(3, null);
		
		hs.replace(2, "newtwo");
		System.out.println(hs);
		
		System.out.println(hs.get(2));
		System.out.println(hs.get(3));
		
	Set s =	hs.entrySet();
	Iterator it =s.iterator();
	
	
	while(it.hasNext()) {
		//System.out.println(it.next());
		Map.Entry mp =(Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		
	}
		
	
	
	
	
	
	}

}
