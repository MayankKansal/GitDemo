package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arratListDemo {

	public static void main(String[] args) {
	
		ArrayList<String> a =new ArrayList<String>();
		a.add("First");
		a.add("Second");
		System.out.println(a);
		a.add(0, "Zero");
		System.out.println(a);
		System.out.println(a.indexOf("Zero"));
		a.add("Zero");
		System.out.println(a.indexOf("Zero"));
		a.add("First");
		System.out.println(a);
		System.out.println(a.indexOf("First"));
		System.out.println(a.contains("Zero"));
		int size= a.size();
		System.out.println(size);
	
		Iterator<String> it= a.iterator();
	//	System.out.println(it.next());
		//System.out.println(it.next());
		System.out.println("-------------------------------------------------------------------------------------");
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		for(int i=0; i<size;i++) {
			System.out.print(it.next());
		}
	}

}
